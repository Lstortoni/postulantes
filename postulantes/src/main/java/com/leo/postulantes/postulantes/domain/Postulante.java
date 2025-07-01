/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.leo.postulantes.postulantes.domain;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Clase que representa al postulante
 * @author Leo Stortoni
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Postulante {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nombre;
    private String apellido;
    private String email;
   @OneToOne
   @JoinColumn(name = "usuario_id") // referencia a Usuario.id por defecto
    private Usuario usuario;
   @OneToOne
   @JoinColumn(name = "direccin_id") // referencia a Direecion.id por defecto
   private Direccion direccion;
         
  // Un postulante puede tener muchos cursos
    @OneToMany(mappedBy = "postulante", cascade = CascadeType.ALL, orphanRemoval = true)        
    private List<Curso> cursosRealizados;
    //Un postulante - Muchas experiencias
   @OneToMany(mappedBy = "postulante", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Experiencia> experienciasLaborales;
    private String descripcionPostulante;
    private Ciudad ciudadPreferencia;
}
