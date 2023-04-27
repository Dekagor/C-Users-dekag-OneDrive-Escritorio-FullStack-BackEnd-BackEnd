/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.PortfolioPersonal.GRDK.Dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

/**
 * @author dekag
 */
@Getter
@Setter
public class dtoPersona {

    @NotBlank
    private String nombre;

    @NotBlank
    private String apellido;

    @NotBlank
    private String descripcion;
    
    @NotBlank
    private String puesto;

    @NotBlank
    private String img;
    
    private String banner;
    
    public dtoPersona() {
    }

    public dtoPersona(String nombre, String apellido, String descripcion, String puesto, String img, String banner) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.descripcion = descripcion;
        this.puesto = puesto;
        this.img = img;
        this.banner = banner;
    }   
}
