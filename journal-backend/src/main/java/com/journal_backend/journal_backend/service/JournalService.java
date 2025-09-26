package com.journal_backend.journal_backend.service;

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

    public Journal createJournal() {
        throw new UnsupportedOperationException("Unimplemented method 'createJournal'");
    }

    public String getJournalById() {
        throw new UnsupportedOperationException("Unimplemented method 'getJournalById'");
    }

    public String deleteJournalById() {
        throw new UnsupportedOperationException("Unimplemented method 'deleteJournalById'");
    }

    public String getJournalByUserId() {
        throw new UnsupportedOperationException("Unimplemented method 'getJournalByUserId'");
    }
    
}
