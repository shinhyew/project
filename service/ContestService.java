package com.example.joinup2.service;

import com.example.joinup2.entity.Contest;
import com.example.joinup2.repository.ContestRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContestService {

    private final ContestRepository contestRepository;

    public ContestService(ContestRepository contestRepository) {
        this.contestRepository = contestRepository;
    }

    public List<Contest> getAllContests() {
        return contestRepository.findAll();
    }

    public Contest getContestById(int id) {
        return contestRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Contest not found"));
    }

    public Contest createContest(Contest contest) {
        return contestRepository.save(contest);
    }

    public void deleteContestById(int id) {
        contestRepository.deleteById(id);
    }
}

