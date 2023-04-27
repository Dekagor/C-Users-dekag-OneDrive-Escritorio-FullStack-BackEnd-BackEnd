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
public class dtoEducacion {
    @NotBlank
    private String tituloE;
    @NotBlank
    private String descripcionE;
    private String anioE;
    private String imgE;

    public dtoEducacion() {
    }

    public dtoEducacion(String tituloE, String descripcionE, String anioE, String imgE) {
        this.tituloE = tituloE;
        this.descripcionE = descripcionE;
        this.anioE = anioE;
        this.imgE = imgE;
    }
    
}
