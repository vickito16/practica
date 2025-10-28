package com.example.practica.dto;

import java.time.LocalDate;
import java.util.Date;

public class alumnoDTO {
    private int id;
    private String nombre;
    private String apMaterno;
    private String apPaterno;
    private LocalDate fecha;
    private String login;
    private String password;
    private String dni;

    public alumnoDTO() {
    }

    public alumnoDTO(int id, String nombre, String apMaterno, String apPaterno, LocalDate fecha, String login, String password, String dni) {
        this.id = id;
        this.nombre = nombre;
        this.apMaterno = apMaterno;
        this.apPaterno = apPaterno;
        this.fecha = fecha;
        this.login = login;
        this.password = password;
        this.dni = dni;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApMaterno() {
        return apMaterno;
    }

    public void setApMaterno(String apMaterno) {
        this.apMaterno = apMaterno;
    }

    public String getApPaterno() {
        return apPaterno;
    }

    public void setApPaterno(String apPaterno) {
        this.apPaterno = apPaterno;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}
