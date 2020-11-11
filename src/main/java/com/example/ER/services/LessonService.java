package com.example.ER.services;

import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Service
public class LessonService {
    @PersistenceContext
    private EntityManager entityManager;

    public LessonService(){}
}
