package com.rosettcompany.grupoCiencia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rosettcompany.grupoCiencia.repository.AulasEntity;
import com.rosettcompany.grupoCiencia.repository.CiclosNormalizadosEntity;
import com.rosettcompany.grupoCiencia.repository.Modalidad;
import com.rosettcompany.grupoCiencia.service.FiltroServicio;

@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE })
@RequestMapping("/api/filtros")
public class FiltrosController {

    @Autowired
    private FiltroServicio filtroServicio;

    @GetMapping("/ciclos/sede/{idsede}")
    public ResponseEntity<List<CiclosNormalizadosEntity>> ciclosPorSede(@PathVariable int idsede) {
        List<CiclosNormalizadosEntity> data = filtroServicio.obtenerCiclosPorSede(idsede);
        return new ResponseEntity<>(data, HttpStatus.OK);
    }

    @GetMapping("/modalidades/sede-ciclo/{idsede}/{idciclonormalizado}")
    public ResponseEntity<List<Modalidad>> modalidadesPorSedeCiclo(@PathVariable int idsede,
            @PathVariable int idciclonormalizado) {
        List<Modalidad> data = filtroServicio.obtenerModalidadesPorSedeYCiclo(idsede, idciclonormalizado);
        return new ResponseEntity<>(data, HttpStatus.OK);
    }

    @GetMapping("/aulas/sede-ciclo-modalidad/{idsede}/{idciclonormalizado}/{idmodalidad}")
    public ResponseEntity<List<AulasEntity>> aulasPorSedeCicloModalidad(@PathVariable int idsede,
            @PathVariable int idciclonormalizado, @PathVariable int idmodalidad) {
        List<AulasEntity> data = filtroServicio.obtenerAulasPorSedeCicloModalidad(idsede, idciclonormalizado, idmodalidad);
        return new ResponseEntity<>(data, HttpStatus.OK);
    }
}
