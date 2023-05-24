package de.neuefische.backend.controller;

import de.neuefische.backend.model.CategoryList;
import de.neuefische.backend.model.Question;
import de.neuefische.backend.model.QuizRequest;
import de.neuefische.backend.service.QuizService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class QuizController {

    private final QuizService service = new QuizService();

    @GetMapping("/categories")
    public CategoryList getCategories() {
        return service.getCategories();
    }

    @PostMapping(path="/home")
    public List<Question> PostHome(@RequestBody QuizRequest quizRequest) {
        return service.getQuizSession(quizRequest.getDifficulty(), quizRequest.getCategory(), quizRequest.getQuestions());
    }

}
