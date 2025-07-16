package com.rosettcompany.grupoCiencia.repository;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="videos")
public class Video {

	@Id
	@Column(name="idvideo")
	private int idvideo;
	
	@Column(name="ruta_video")
	private String ruta_video;
	
	@Column(name="idcurso")
	private int curso;

	public Video() {
		super();
	}

	public Video(int idvideo, String ruta_video, int curso) {
		super();
		this.idvideo = idvideo;
		this.ruta_video = ruta_video;
		this.curso = curso;
	}

	public int getIdvideo() {
		return idvideo;
	}

	public void setIdvideo(int idvideo) {
		this.idvideo = idvideo;
	}

	public String getRuta_video() {
		return ruta_video;
	}

	public void setRuta_video(String ruta_video) {
		this.ruta_video = ruta_video;
	}

	public int getCurso() {
		return curso;
	}

	public void setCurso(int curso) {
		this.curso = curso;
	}


	
}
