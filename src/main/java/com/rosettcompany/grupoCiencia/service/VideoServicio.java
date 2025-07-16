package com.rosettcompany.grupoCiencia.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rosettcompany.grupoCiencia.repository.Video;
import com.rosettcompany.grupoCiencia.repositoryI.VideoRepositoryI;

@Service
public class VideoServicio {

	@Autowired
	private VideoRepositoryI videoRepository;
	
	
	public void guardarVideo(Video video) {
		
		videoRepository.save(video);
	}
	
	public Optional<Video> findVideoById(Video video) {
		
		return videoRepository.findById(video.getIdvideo());
	}

}
