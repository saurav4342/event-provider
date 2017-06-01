package com.pixelattic.libraries.repository;

import org.bson.types.ObjectId;
import org.springframework.data.repository.CrudRepository;

import com.pixelattic.libraries.model.Video;

public interface VideoRepository extends CrudRepository<Video,ObjectId>{

}
