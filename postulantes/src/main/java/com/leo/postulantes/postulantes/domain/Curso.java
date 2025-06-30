/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.leo.postulantes.postulantes.domain;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Un curso que puede ser realizado por un postulante
 * @author Leo Stortoni
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Curso {
    
    private Long id;
    private String nombre;
    private String descripcion;
}
