/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.PortfolioPersonal.GRDK.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;




/**
 * @author dekag
 */
@Getter
@Setter
@Entity
public class Educacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String tituloE;
    private String descripcionE;
    private String anioE;
    private String imgE;

    public Educacion() {
    }

    public Educacion(String tituloE, String descripcionE, String anioE, String imgE) {
        this.tituloE = tituloE;
        this.descripcionE = descripcionE;
        this.anioE = anioE;
        this.imgE = imgE;
    }

}