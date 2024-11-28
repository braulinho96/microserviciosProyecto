package com.tutorial.documentservice.repository;

import com.tutorial.documentservice.entity.Document;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface DocumentRepository extends JpaRepository<Document, Long> {
    public ArrayList<Document> findByIdLoan(Long id);
}
