package com.example.ER.repositories;

import com.example.ER.domain.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LessonRepository extends JpaRepository<Lesson, Long> {
    List<Lesson> findAllById(long id);

    List<Lesson> findByGroupNameOrderByIdAsc(String groupName);
}
