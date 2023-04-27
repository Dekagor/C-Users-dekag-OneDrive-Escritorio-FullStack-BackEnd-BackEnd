/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.PortfolioPersonal.GRDK.Controller;

import com.PortfolioPersonal.GRDK.Dto.dtoExperiencia;
import com.PortfolioPersonal.GRDK.Entity.Experiencia;
import com.PortfolioPersonal.GRDK.Security.Controller.Mensaje;
import com.PortfolioPersonal.GRDK.Service.SExperiencia;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dekag
 */

@RestController
@RequestMapping("Explab")
@CrossOrigin(origins = "http://localhost:4200")
public class CExperiencia {
    @Autowired
    SExperiencia sExperiencia;

    @GetMapping("/lista")
    public ResponseEntity<List<Experiencia>> list(){
        List<Experiencia> list = sExperiencia.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<Experiencia> create(@RequestBody dtoExperiencia dtoexperiencia){
        if(StringUtils.isBlank(dtoexperiencia.getNombreExperiencia()))
            return new ResponseEntity (new Mensaje ("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        if(sExperiencia.existsByNombreExperiencia(dtoexperiencia.getNombreExperiencia()))
            return new ResponseEntity(new Mensaje("Esa experiencia existe"), HttpStatus.BAD_REQUEST);
        
        Experiencia experiencia = new Experiencia (dtoexperiencia.getNombreExperiencia(), dtoexperiencia.getDescripcionExperiencia());
        sExperiencia.save(experiencia);
        
        return new ResponseEntity(new Mensaje("Experiencia agregada"), HttpStatus.OK);
    }

    @GetMapping("/detail/{id}")
    public ResponseEntity<Experiencia> getById(@PathVariable("id") int id){
        if(!sExperiencia.existsById(id))
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        Experiencia experiencia = sExperiencia.getOne(id).get();
        return new ResponseEntity(experiencia, HttpStatus.OK);
    }
    
    @PutMapping("/update/{id}")
    public ResponseEntity<Experiencia> update(@PathVariable("id") int id, @RequestBody dtoExperiencia dtoexperiencia){
     //validamos si existe el ID
    if(!sExperiencia.existsById(id))
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.BAD_REQUEST);
     //verifica si existe experiencia        
    if(sExperiencia.existsByNombreExperiencia(dtoexperiencia.getNombreExperiencia()) && sExperiencia.getByNombreExperiencia(dtoexperiencia.getNombreExperiencia()).get().getId() != id)
        return new ResponseEntity(new Mensaje("Esa experiencia ya existe"), HttpStatus.BAD_REQUEST);
      //verifica los campos  
    if(StringUtils.isBlank(dtoexperiencia.getNombreExperiencia()))
        return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
    
    Experiencia experiencia = sExperiencia.getOne(id).get();
    experiencia.setNombreExperiencia(dtoexperiencia.getNombreExperiencia());
    experiencia.setDescripcionExperiencia(dtoexperiencia.getDescripcionExperiencia());
    
    sExperiencia.save(experiencia);
    return new ResponseEntity(new Mensaje("Experiencia actualizada"), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Experiencia> delete (@PathVariable("id") int id){
        //validamos si existe el ID
    if(!sExperiencia.existsById(id))
        return new ResponseEntity(new Mensaje("El ID no existe"),HttpStatus.BAD_REQUEST);
             
    sExperiencia.delete(id);
    
    return new ResponseEntity(new Mensaje("Experiencia eliminada"), HttpStatus.OK);
    }
}
