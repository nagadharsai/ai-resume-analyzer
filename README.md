# 🚀 AI Resume Analyzer

AI Resume Analyzer is a full-stack application designed to evaluate resumes, identify skill gaps, and match candidate profiles against job descriptions.

---

## 📌 Overview

This project simulates a real-world hiring assistant system. It analyzes resume content against job requirements and provides:

- Match score
- Strengths in the resume
- Missing skills
- Actionable suggestions for improvement

---

## 🧠 Features

- 📊 Resume vs Job Description Matching
- 🎯 Skill Gap Identification
- 💡 Intelligent Suggestions
- ⚡ REST API built with Spring Boot
- 🌐 Frontend-ready architecture (React planned)

---

## 🏗️ Architecture

Frontend (React)  
↓  
Spring Boot REST API  
↓  
Resume Analysis Service  
↓  
Rule-Based Analysis Engine  
↓  
Response (Score + Insights)

---

## 🛠️ Tech Stack

**Backend**
- Java
- Spring Boot
- Maven

**Frontend (Planned)**
- React

**Other**
- REST APIs
- JSON-based communication

---

## 📂 Project Structure

backend/  
src/main/java/com/nagadharsai/airesumeanalyzer/  
controller/  
service/  
dto/  
AiResumeAnalyzerApplication.java  

src/main/resources/  
application.properties  

frontend/  
docs/

---

## 🔗 API Endpoints

### Health Check

GET /api/resume/health

### Analyze Resume

POST /api/resume/analyze

#### Sample Request

```json
{
  "resumeText": "Experienced Java developer with Spring Boot and AWS...",
  "jobDescription": "Looking for a Java developer with Spring Boot and Microservices experience..."
}

#### Sample Response

```json
{
  "matchScore": 80,
  "strengths": ["Strong Java relevance detected"],
  "missingSkills": ["Microservices"],
  "suggestions": ["Add stronger evidence for missing skills"]
}
