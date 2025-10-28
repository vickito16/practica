package com.example.practica.entity;


import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "alumnoweb")
public class AlumnoWeb {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codiEstdWeb")
    private Integer codiEstdWeb;

    @Column(name = "ndniEstdWeb", nullable = false, length = 50)
    private String ndniEstdWeb;

    @Column(name = "appaEstdWeb", nullable = false, length = 50)
    private String appaEstdWeb;

    @Column(name = "apmaEstdWeb", nullable = false, length = 50)
    private String apmaEstdWeb;

    @Column(name = "nombEstdWeb", nullable = false, length = 50)
    private String nombEstdWeb;

    @Column(name = "fechNaciEstdWeb")
    private LocalDate fechNaciEstdWeb;

    @Column(name = "logiEstd", nullable = false, length = 100)
    private String logiEstd;

    @Column(name = "passEstd", nullable = false, length = 500)
    private String passEstd;

    // ====== Getters y Setters ======
    public Integer getCodiEstdWeb() {
        return codiEstdWeb;
    }

    public void setCodiEstdWeb(Integer codiEstdWeb) {
        this.codiEstdWeb = codiEstdWeb;
    }

    public String getNdniEstdWeb() {
        return ndniEstdWeb;
    }

    public void setNdniEstdWeb(String ndniEstdWeb) {
        this.ndniEstdWeb = ndniEstdWeb;
    }

    public String getAppaEstdWeb() {
        return appaEstdWeb;
    }

    public void setAppaEstdWeb(String appaEstdWeb) {
        this.appaEstdWeb = appaEstdWeb;
    }

    public String getApmaEstdWeb() {
        return apmaEstdWeb;
    }

    public void setApmaEstdWeb(String apmaEstdWeb) {
        this.apmaEstdWeb = apmaEstdWeb;
    }

    public String getNombEstdWeb() {
        return nombEstdWeb;
    }

    public void setNombEstdWeb(String nombEstdWeb) {
        this.nombEstdWeb = nombEstdWeb;
    }

    public LocalDate getFechNaciEstdWeb() {
        return fechNaciEstdWeb;
    }

    public void setFechNaciEstdWeb(LocalDate fechNaciEstdWeb) {
        this.fechNaciEstdWeb = fechNaciEstdWeb;
    }

    public String getLogiEstd() {
        return logiEstd;
    }

    public void setLogiEstd(String logiEstd) {
        this.logiEstd = logiEstd;
    }

    public String getPassEstd() {
        return passEstd;
    }

    public void setPassEstd(String passEstd) {
        this.passEstd = passEstd;
    }
}
