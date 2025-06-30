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
 * Es la direccion que declara un postulante
 * @author Leo Stortoni
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Direccion {
    private Long id;
    private Ciudad ciudad;
    private String calle;
    private String codigoPostal;
    private String nroCasa; 
}
