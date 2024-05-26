package com.At.t.QuizApp.Service;

import com.At.t.QuizApp.Question;
import com.At.t.QuizApp.dao.QuestionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionService {
    @Autowired
    QuestionDao questionDao;

    public ResponseEntity<List<Question>> getAllQuestions() {
        try {
            return new ResponseEntity<>( questionDao.findAll(), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>( new ArrayList<>(), HttpStatus.BAD_REQUEST);
        }

    }

    public List<Question> getAllQuestionsByCategory(String category) {
        return questionDao.findByCategory(category);
    }

    public String addQuestion(@RequestBody Question question){
         questionDao.save(question);
         return "success babu ";
    }
}
