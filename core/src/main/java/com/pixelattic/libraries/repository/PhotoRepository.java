package com.pixelattic.libraries.repository;

import org.bson.types.ObjectId;
import org.springframework.data.repository.CrudRepository;

import com.pixelattic.libraries.model.Photo;

public interface PhotoRepository extends CrudRepository<Photo,ObjectId>{

}
