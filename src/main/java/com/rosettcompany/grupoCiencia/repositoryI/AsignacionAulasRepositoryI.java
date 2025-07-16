package com.rosettcompany.grupoCiencia.repositoryI;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rosettcompany.grupoCiencia.repository.AsignacionAulasEntity;


@Repository
public interface AsignacionAulasRepositoryI extends CrudRepository<AsignacionAulasEntity, Integer>{

    @Query(value = "SELECT DISTINCT idciclonormalizado FROM asignacion_aulas WHERE idsede = :idsede", nativeQuery = true)
    List<Integer> findCiclosBySede(@Param("idsede") int idsede);

    @Query(value = "SELECT DISTINCT idmodalidad FROM asignacion_aulas WHERE idsede = :idsede AND idciclonormalizado = :idciclonormalizado", nativeQuery = true)
    List<Integer> findModalidadesBySedeAndCiclo(@Param("idsede") int idsede, @Param("idciclonormalizado") int idciclonormalizado);

    @Query(value = "SELECT DISTINCT idaula FROM asignacion_aulas WHERE idsede = :idsede AND idciclonormalizado = :idciclonormalizado AND idmodalidad = :idmodalidad", nativeQuery = true)
    List<Integer> findAulasBySedeCicloModalidad(@Param("idsede") int idsede, @Param("idciclonormalizado") int idciclonormalizado, @Param("idmodalidad") int idmodalidad);
}
