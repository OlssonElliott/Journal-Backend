package com.journal_backend.journal_backend.service;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.journal_backend.journal_backend.models.Journal;
import com.journal_backend.journal_backend.repositories.JournalRepository;

@Service
public class JournalService {

    private final JournalRepository journalRepository;

    JournalService(JournalRepository journalRepository) {
        this.journalRepository = journalRepository;
    }

    public List<Journal> getAllJournals() {
        return journalRepository.findAll();
    }

    public Journal createJournal(Journal journal) {
    if (journal.getCreatedAt() == null) {
        journal.setCreatedAt(new Date());
    }
    return journalRepository.save(journal);
        }

    public Journal getJournalById(String id) {
        return journalRepository.findById(id).orElse(null);
    }

    public String deleteJournalById(String id) {
    return journalRepository.findById(id).map(journal -> {
            journalRepository.delete(journal);
            return "Journal with id " + id + " deleted successfully.";
        }).orElse("Journal with id " + id + " not found.");
    }

    public List<Journal> getJournalByUserId(String userId) {
        return journalRepository.findByUserId(userId);
    }
    
}
