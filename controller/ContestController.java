package com.example.joinup2.controller;

import com.example.joinup2.entity.Contest;
import com.example.joinup2.service.ContestService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contests")
public class ContestController {

    private final ContestService contestService;

    public ContestController(ContestService contestService) {
        this.contestService = contestService;
    }

    @GetMapping
    public List<Contest> getAllContests() {
        return contestService.getAllContests();
    }

    @GetMapping("/{id}")
    public Contest getContestById(@PathVariable int id) {
        return contestService.getContestById(id);
    }

    @PostMapping
    public Contest createContest(@RequestBody Contest contest) {
        return contestService.createContest(contest);
    }

    @DeleteMapping("/{id}")
    public void deleteContestById(@PathVariable int id) {
        contestService.deleteContestById(id);
    }
}
