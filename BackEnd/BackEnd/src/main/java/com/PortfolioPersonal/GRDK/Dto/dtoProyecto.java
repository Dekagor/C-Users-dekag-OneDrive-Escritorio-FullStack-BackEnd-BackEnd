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
public class dtoProyecto {

    @NotBlank
    private String nombreP;
    private String descripcionP;
    private String linkP;
    private String fechaP;
    private String imgP;

    public dtoProyecto() {
    }

    public dtoProyecto(String nombreP, String descripcionP, String linkP, String fechaP, String imgP) {
        this.nombreP = nombreP;
        this.descripcionP = descripcionP;
        this.linkP = linkP;
        this.fechaP = fechaP;
        this.imgP = imgP;
    }
}