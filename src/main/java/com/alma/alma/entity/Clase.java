package com.alma.alma.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Clase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer clase_id;
    private String nombre_clase;


    public Integer getClase_id() {
        return clase_id;
    }

    public void setClase_id(Integer clase_id) {
        this.clase_id = clase_id;
    }

    public String getNombre_clase() {
        return nombre_clase;
    }

    public void setNombre_clase(String nombre_clase) {
        this.nombre_clase = nombre_clase;
    }
}

