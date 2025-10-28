package com.example.practica.service;

import com.example.practica.entity.AlumnoWeb;
import com.example.practica.repository.AlumnoWebRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlumnoWebService {

    @Autowired
    private AlumnoWebRepository alumnoWebRepository;

    public List<AlumnoWeb> listarTodos() {
        return alumnoWebRepository.findAll();
    }

    public Optional<AlumnoWeb> buscarPorId(Integer id) {
        return alumnoWebRepository.findById(id);
    }

    public AlumnoWeb guardar(AlumnoWeb alumno) {
        return alumnoWebRepository.save(alumno);
    }

    public void eliminar(Integer id) {
        alumnoWebRepository.deleteById(id);
    }

    public Optional<AlumnoWeb> buscarPorLogin(String login) {
        return alumnoWebRepository.findByLogiEstd(login);
    }

    public boolean validarCredenciales(String login, String password) {
        Optional<AlumnoWeb> alumnoOpt = alumnoWebRepository.findByLogiEstd(login);
        if (alumnoOpt.isEmpty()) {
            return false;
        }

        AlumnoWeb alumno = alumnoOpt.get();
        // Compara directamente el texto plano
        return alumno.getPassEstd().equals(password);
    }

    public Optional<AlumnoWeb> buscarPorDni(String dni) {
        return alumnoWebRepository.findByNdniEstdWeb(dni);
    }
}
