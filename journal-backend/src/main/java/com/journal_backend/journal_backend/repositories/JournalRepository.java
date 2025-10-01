package com.journal_backend.journal_backend.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.journal_backend.journal_backend.models.Journal;

@Repository
public interface JournalRepository extends MongoRepository<Journal, String> {

    List<Journal> findByUserId(String userId);  
} 
