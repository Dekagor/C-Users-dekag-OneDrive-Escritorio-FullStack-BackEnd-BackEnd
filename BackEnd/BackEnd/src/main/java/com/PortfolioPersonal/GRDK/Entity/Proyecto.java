/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.PortfolioPersonal.GRDK.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

/**
 * @author dekag
 */
@Getter
@Setter
@Entity
public class Proyecto{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @NotBlank
    private String nombreP;
    private String descripcionP;
    private String linkP;

    private String fechaP;

    private String imgP;

    public Proyecto() {
    }

    public Proyecto(String nombreP, String descripcionP, String linkP, String fechaP, String imgP) {
        this.nombreP = nombreP;
        this.descripcionP = descripcionP;
        this.linkP = linkP;
        this.fechaP = fechaP;
        this.imgP = imgP;
    }
}