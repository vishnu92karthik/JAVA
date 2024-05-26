package com.At.t.QuizApp.dao;

import com.At.t.QuizApp.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

 public interface QuizDao extends JpaRepository<Quiz, Integer> {
}
