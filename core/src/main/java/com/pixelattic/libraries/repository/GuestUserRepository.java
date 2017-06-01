package com.pixelattic.libraries.repository;

import org.bson.types.ObjectId;
import org.springframework.data.repository.CrudRepository;

import com.pixelattic.libraries.model.GuestUser;

public interface GuestUserRepository extends CrudRepository<GuestUser,ObjectId>{

}
