package com.journal_backend.journal_backend.models;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Document(collection = "journals")
public class Journal {
    @Id
    private String id;
    private String title;
    private String content;
    private String emotionalState;
    private Date createdAt;
}
