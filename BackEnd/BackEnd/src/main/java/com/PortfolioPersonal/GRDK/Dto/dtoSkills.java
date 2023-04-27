/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.PortfolioPersonal.GRDK.Dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author dekag
 */
@Getter
@Setter
public class dtoSkills {
    @NotBlank
    private String nombre;
    @NotBlank
    private int porcentaje;
    private String imgS;
    
    public dtoSkills() {
    }

    public dtoSkills(String nombre, int porcentaje, String imgS) {
        this.nombre = nombre;
        this.porcentaje = porcentaje;
        this.imgS = imgS;
    }

}