package com.example.practica.repository;


import com.example.practica.entity.AlumnoWeb;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AlumnoWebRepository extends JpaRepository<AlumnoWeb, Integer> {
    Optional<AlumnoWeb> findByLogiEstd(String logiEstd);
    Optional<AlumnoWeb> findByNdniEstdWeb(String ndniEstdWeb);
}
