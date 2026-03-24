package com.nagadharsai.airesumeanalyzer.service;

import com.nagadharsai.airesumeanalyzer.dto.AnalysisRequest;
import com.nagadharsai.airesumeanalyzer.dto.AnalysisResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ResumeAnalysisService {

    public AnalysisResponse analyzeResume(AnalysisRequest request) {

        String resumeText = request.getResumeText() == null ? "" : request.getResumeText().toLowerCase();
        String jobDescription = request.getJobDescription() == null ? "" : request.getJobDescription().toLowerCase();

        List<String> strengths = new ArrayList<>();
        List<String> missingSkills = new ArrayList<>();
        List<String> suggestions = new ArrayList<>();

        int score = 50;

        if (resumeText.contains("java")) {
            strengths.add("Strong Java relevance detected");
            score += 10;
        } else if (jobDescription.contains("java")) {
            missingSkills.add("Java");
        }

        if (resumeText.contains("spring boot")) {
            strengths.add("Spring Boot experience identified");
            score += 10;
        } else if (jobDescription.contains("spring boot")) {
            missingSkills.add("Spring Boot");
        }

        if (resumeText.contains("react")) {
            strengths.add("React experience identified");
            score += 10;
        } else if (jobDescription.contains("react")) {
            missingSkills.add("React");
        }

        if (resumeText.contains("microservices")) {
            strengths.add("Microservices background detected");
            score += 10;
        } else if (jobDescription.contains("microservices")) {
            missingSkills.add("Microservices");
        }

        if (resumeText.contains("aws")) {
            strengths.add("AWS experience identified");
            score += 10;
        } else if (jobDescription.contains("aws")) {
            missingSkills.add("AWS");
        }

        if (missingSkills.isEmpty()) {
            suggestions.add("Resume aligns well with the provided job description");
        } else {
            suggestions.add("Add stronger evidence for missing or underrepresented skills");
            suggestions.add("Quantify project outcomes and business impact");
            suggestions.add("Tailor summary and experience sections toward the job description");
        }

        if (score > 100) {
            score = 100;
        }

        return new AnalysisResponse(score, strengths, missingSkills, suggestions);
    }
}
