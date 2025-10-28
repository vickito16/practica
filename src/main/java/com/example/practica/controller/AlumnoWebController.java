package com.example.practica.controller;

import com.example.practica.dto.alumnoDTO;
import com.example.practica.dto.credencialesDTO;
import com.example.practica.dto.mensajeDTO;
import com.example.practica.entity.AlumnoWeb;
import com.example.practica.service.AlumnoWebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alumnos")
@CrossOrigin(origins = "*") // Permite peticiones desde el frontend
public class AlumnoWebController {

    @Autowired
    private AlumnoWebService alumnoWebService;

    @PostMapping("/validar")
    public mensajeDTO validacion(@RequestBody credencialesDTO credenciales) {

        boolean valido = alumnoWebService.validarCredenciales(
                credenciales.getLogin(),
                credenciales.getPassword()
        );

        if (valido) {

            return new mensajeDTO("ok", "Usuario Validado", null);

        } else {
            return new mensajeDTO("error", "Usuario Invalido", null);
        }



    }


    @GetMapping("/listar")
    public List<AlumnoWeb> listar() {
        return alumnoWebService.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<AlumnoWeb> obtenerPorId(@PathVariable Integer id) {
        return alumnoWebService.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/registrar")
    public mensajeDTO registrar(@RequestBody alumnoDTO  alumno) {
        AlumnoWeb a = new AlumnoWeb();
        a.setApmaEstdWeb(alumno.getApMaterno());
        a.setAppaEstdWeb(alumno.getApPaterno());
        a.setNombEstdWeb(alumno.getNombre());
        a.setNdniEstdWeb(alumno.getDni());
        a.setFechNaciEstdWeb(alumno.getFecha());
        a.setLogiEstd(alumno.getLogin());
        a.setPassEstd(alumno.getPassword());
        alumnoWebService.guardar(a);

        return new mensajeDTO("ok", "alumno Registrado", null);
    }

    @PutMapping("/{id}")
    public ResponseEntity<AlumnoWeb> actualizar(@PathVariable Integer id, @RequestBody AlumnoWeb datos) {
        return alumnoWebService.buscarPorId(id).map(a -> {
            a.setNdniEstdWeb(datos.getNdniEstdWeb());
            a.setAppaEstdWeb(datos.getAppaEstdWeb());
            a.setApmaEstdWeb(datos.getApmaEstdWeb());
            a.setNombEstdWeb(datos.getNombEstdWeb());
            a.setFechNaciEstdWeb(datos.getFechNaciEstdWeb());
            a.setLogiEstd(datos.getLogiEstd());
            a.setPassEstd(datos.getPassEstd());
            alumnoWebService.guardar(a);
            return ResponseEntity.ok(a);
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
        if (alumnoWebService.buscarPorId(id).isPresent()) {
            alumnoWebService.eliminar(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
