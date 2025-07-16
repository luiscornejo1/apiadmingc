package com.rosettcompany.grupoCiencia.bean;

public class DetalleCicloSedeModalidad {
	private int idciclonormalizado;
	private int idsede;
	private int idmodalidad;

	public DetalleCicloSedeModalidad(int idciclonormalizado, int idsede, int idmodalidad) {
		super();
		this.idciclonormalizado = idciclonormalizado;
		this.idsede = idsede;
		this.idmodalidad = idmodalidad;
	}

	public int getIdciclonormalizado() {
		return idciclonormalizado;
	}

	public void setIdciclonormalizado(int idciclonormalizado) {
		this.idciclonormalizado = idciclonormalizado;
	}

	public int getIdsede() {
		return idsede;
	}

	public void setIdsede(int idsede) {
		this.idsede = idsede;
	}

	public int getIdmodalidad() {
		return idmodalidad;
	}

	public void setIdmodalidad(int idmodalidad) {
		this.idmodalidad = idmodalidad;
	}

}
