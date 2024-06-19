package com.alma.alma.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Profesor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer profesor_id;
    private String nombre_profesor;


    public Integer getProfesor_id() {
        return profesor_id;
    }

    public void setProfesor_id(Integer profesor_id) {
        this.profesor_id = profesor_id;
    }

    public String getNombre_profesor() {
        return nombre_profesor;
    }

    public void setNombre_profesor(String nombre_profesor) {
        this.nombre_profesor = nombre_profesor;
    }
}

