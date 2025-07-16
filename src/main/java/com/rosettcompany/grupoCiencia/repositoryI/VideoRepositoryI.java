package com.rosettcompany.grupoCiencia.repositoryI;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rosettcompany.grupoCiencia.repository.Video;

@Repository
public interface VideoRepositoryI extends CrudRepository<Video,Integer> {

}
