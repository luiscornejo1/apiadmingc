package com.rosettcompany.grupoCiencia.repositoryI;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.rosettcompany.grupoCiencia.repository.AreaConocimiento;

@Repository
public interface AreaConocimientoRepositoryI extends CrudRepository<AreaConocimiento,Integer> {
	
	
	@Procedure(name="listar_areas_conocimiento")
	public String listarAreasConocimiento(
			@Param("in_id_area") int idarea
			);

}
