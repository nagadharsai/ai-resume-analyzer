package com.nagadharsai.airesumeanalyzer.controller;

import com.nagadharsai.airesumeanalyzer.dto.AnalysisRequest;
import com.nagadharsai.airesumeanalyzer.dto.AnalysisResponse;
import com.nagadharsai.airesumeanalyzer.service.ResumeAnalysisService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/resume")
@CrossOrigin(origins = "*")
public class ResumeAnalysisController {

    private final ResumeAnalysisService resumeAnalysisService;

    public ResumeAnalysisController(ResumeAnalysisService resumeAnalysisService) {
        this.resumeAnalysisService = resumeAnalysisService;
    }

    @GetMapping("/health")
    public ResponseEntity<String> healthCheck() {
        return ResponseEntity.ok("AI Resume Analyzer backend is running");
    }

    @PostMapping("/analyze")
    public ResponseEntity<AnalysisResponse> analyzeResume(@RequestBody AnalysisRequest request) {
        AnalysisResponse response = resumeAnalysisService.analyzeResume(request);
        return ResponseEntity.ok(response);
    }
}
