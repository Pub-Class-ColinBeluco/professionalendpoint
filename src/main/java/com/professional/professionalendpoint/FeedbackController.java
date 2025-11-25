package com.professional.professionalendpoint;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/feedback")
public class FeedbackController {
    private final List<Feedback> feedbacks = new ArrayList<>();

    @GetMapping
    public List<Feedback> lsTodosFeedback() {
        return feedbacks;
    }

    @PostMapping
    public Feedback criarFeedback(@RequestBody Feedback novoFeedback) {
        feedbacks.add(novoFeedback);
        return novoFeedback;
    }
}
