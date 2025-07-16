package com.rosettcompany.grupoCiencia.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rosettcompany.grupoCiencia.repository.AulasEntity;
import com.rosettcompany.grupoCiencia.repository.CiclosNormalizadosEntity;
import com.rosettcompany.grupoCiencia.repository.Modalidad;
import com.rosettcompany.grupoCiencia.repositoryI.AsignacionAulasRepositoryI;
import com.rosettcompany.grupoCiencia.repositoryI.AulasRepositoryI;
import com.rosettcompany.grupoCiencia.repositoryI.CiclosNormalizadosRepositoryI;
import com.rosettcompany.grupoCiencia.repositoryI.ModalidadRepositoryI;

@Service
public class FiltroServicio {

    @Autowired
    private AsignacionAulasRepositoryI asignacionAulasRepository;

    @Autowired
    private CiclosNormalizadosRepositoryI ciclosRepository;

    @Autowired
    private ModalidadRepositoryI modalidadRepository;

    @Autowired
    private AulasRepositoryI aulasRepository;

    public List<CiclosNormalizadosEntity> obtenerCiclosPorSede(int idsede) {
        List<Integer> ids = asignacionAulasRepository.findCiclosBySede(idsede);
        List<CiclosNormalizadosEntity> ciclos = new ArrayList<>();
        for(Integer id : ids) {
            ciclosRepository.findById(id).ifPresent(ciclos::add);
        }
        return ciclos;
    }

    public List<Modalidad> obtenerModalidadesPorSedeYCiclo(int idsede, int idciclonormalizado) {
        List<Integer> ids = asignacionAulasRepository.findModalidadesBySedeAndCiclo(idsede, idciclonormalizado);
        List<Modalidad> modalidades = new ArrayList<>();
        for(Integer id : ids) {
            modalidadRepository.findById(id).ifPresent(modalidades::add);
        }
        return modalidades;
    }

    public List<AulasEntity> obtenerAulasPorSedeCicloModalidad(int idsede, int idciclonormalizado, int idmodalidad) {
        List<Integer> ids = asignacionAulasRepository.findAulasBySedeCicloModalidad(idsede, idciclonormalizado, idmodalidad);
        List<AulasEntity> aulas = new ArrayList<>();
        for(Integer id : ids) {
            aulasRepository.findById(id).ifPresent(aulas::add);
        }
        return aulas;
    }
}
