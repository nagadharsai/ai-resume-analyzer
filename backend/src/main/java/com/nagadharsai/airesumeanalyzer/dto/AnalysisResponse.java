package com.nagadharsai.airesumeanalyzer.dto;

import java.util.List;

public class AnalysisResponse {

    private int matchScore;
    private List<String> strengths;
    private List<String> missingSkills;
    private List<String> suggestions;

    public AnalysisResponse() {
    }

    public AnalysisResponse(int matchScore, List<String> strengths, List<String> missingSkills, List<String> suggestions) {
        this.matchScore = matchScore;
        this.strengths = strengths;
        this.missingSkills = missingSkills;
        this.suggestions = suggestions;
    }

    public int getMatchScore() {
        return matchScore;
    }

    public void setMatchScore(int matchScore) {
        this.matchScore = matchScore;
    }

    public List<String> getStrengths() {
        return strengths;
    }

    public void setStrengths(List<String> strengths) {
        this.strengths = strengths;
    }

    public List<String> getMissingSkills() {
        return missingSkills;
    }

    public void setMissingSkills(List<String> missingSkills) {
        this.missingSkills = missingSkills;
    }

    public List<String> getSuggestions() {
        return suggestions;
    }

    public void setSuggestions(List<String> suggestions) {
        this.suggestions = suggestions;
    }
}
