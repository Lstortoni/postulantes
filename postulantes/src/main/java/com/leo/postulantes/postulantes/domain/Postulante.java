/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.leo.postulantes.postulantes.domain;

import jakarta.persistence.Entity;
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
    private Long id;
    private String nombre;
    private String apellido;
    private String email;
    private Usuario usuario;
    private Direccion direccion;
    private List<Curso> cursosRealizados;
    private List<Experiencia> experienciasLaborales;
    private String descripcionPostulante;
    private Ciudad ciudadPreferencia;
}
