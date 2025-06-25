# 🗣️ Voice-Powered Expense Tracker with Yandex Alice

**Project:** Backend for a Yandex Alice skill that manages finances with Telegram integration and AI analytics.

## ✨ Key Features
- **Voice control** via Yandex Alice:
  - "Add 500 rubles for groceries"
  - "Show my spending from yesterday"
- **AI-powered insights** with Mistral RAG:
  - Context-aware responses ("You usually spend 300 rub on coffee, today it's 500")
  - Spending pattern analysis
- **Telegram linking**:
  - Secure account binding via verification codes
  - On-demand expense reports in Telegram
- **Microservice architecture**:
  - API Gateway (Spring Boot)
  - Expense Service (Java)
  - Context Service (Python + Qdrant)
  - Telegram Bot Service (Python)

## 🛠️ Tech Stack
- **Core**: Java 17 (Spring Boot), Python (FastAPI)
- **AI**: Mistral API, Qdrant vector DB
- **Data**: PostgreSQL, Redis
- **Integrations**: Yandex Dialogs API, Telegram Bot API
- **Infra**: Docker, GitHub Actions CI/CD

