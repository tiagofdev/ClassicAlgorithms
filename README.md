#  Classic Algorithms Web App

## 1. 📘 Overview

### 🎯 Purpose
This web application provides an interactive platform for exploring classic computer science algorithms. Each algorithm includes:
- A brief explanation of its purpose and logic
- A sample input/output example
- Java source code implementation
- A live testing interface where users can input variables and see results

### 🏗️ System Architecture
The project is structured into two main components:
- **Frontend (Angular)**: Handles user interface, input collection, and result display.
- **Backend (Spring Boot)**: Processes algorithm logic and returns computed results.

**Data Flow**:
1. User inputs variables via Angular UI
2. Angular sends data to Spring Boot via REST API
3. Spring Boot executes the algorithm and returns the result
4. Angular displays the result to the user

### 👥 Target Audience
- **Students and Educators** exploring algorithmic concepts interactively

---

!imgs/[img_4.png](img_4.png)
!imgs/[img_1.png](img_1.png)
!imgs/[img_2.png](img_2.png)
!imgs/[img_3.png](img_3.png)


## 2. 🚀 Getting Started

### 🔧 Dependencies and Prerequisites

| Component     | Required Version |
|---------------|------------------|
| Java          | 17               |
| Maven         | 3.9.x            |
| Node.js       | 18.x             |
| npm           | 10.x             |
| Angular CLI   | 17.x             |

### 🖥️ Environment Setup

- **IDE Recommendations**:
  - Backend: IntelliJ IDEA or Eclipse
  - Frontend: Visual Studio Code

- **OS Compatibility**:
  - Windows 10/11
  - macOS Monterey or later
  - Linux (Ubuntu 20.04+)

### 📦 Setting up your project

#### Backend (Spring Boot)


```bash
cd springboot-folder
mvn clean install
mvn package
mvn spring-boot:run
```

#### Frontend (Angular)
```bash
cd angular-folder
npm install
ng build --prod
ng serve
```

Visit http://localhost:4200 to access the app.


