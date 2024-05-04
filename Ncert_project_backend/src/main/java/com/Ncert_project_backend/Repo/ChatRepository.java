package com.Ncert_project_backend.Repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.Ncert_project_backend.entity.Chat;

public interface ChatRepository extends MongoRepository<Chat, String> {
    // You can define custom query methods here if needed
}
