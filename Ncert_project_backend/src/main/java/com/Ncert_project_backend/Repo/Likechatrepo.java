package com.Ncert_project_backend.Repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.Ncert_project_backend.entity.Chat;
import com.Ncert_project_backend.entity.Likeclass;

public interface Likechatrepo extends MongoRepository<Likeclass, String> {

}
