package com.journal_backend.journal_backend.controller;

import org.springframework.web.bind.annotation.RestController;

import com.journal_backend.journal_backend.models.Journal;
import com.journal_backend.journal_backend.service.JournalService;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/api/v1/journals")
public class JournalController {

    private final JournalService journalService;

    JournalController(JournalService journalService) {
        this.journalService = journalService;
    }
    
    @GetMapping("/getAll")
    public List<Journal> getAllJournals() {
        return journalService.getAllJournals();
    }

    @GetMapping("/getById")
    public Journal getJournalById(@RequestParam String id) {
        return journalService.getJournalById(id);
    }

    @GetMapping("/getByUserId")
    public Journal getJournalByUserId(@RequestParam String userId) {
        return journalService.getJournalByUserId(userId);
    }
    
    @PostMapping("/create")
    public Journal createJournal(@RequestBody Journal newJournal) {
        return journalService.createJournal(newJournal);
    }

    @DeleteMapping("/delete")
    public String deleteJournalById (@RequestParam String id) {
        return journalService.deleteJournalById(id);
    }
    
    
}
