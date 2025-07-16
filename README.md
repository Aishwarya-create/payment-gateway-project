# 💳 Payment Gateway Backend System (Java + Spring Boot)

This is a **backend payment gateway system** that simulates the essential functionalities required to process online payments for merchants. It supports operations like **merchant onboarding**, **order creation**, **payment processing**, and **webhook handling** — all built using **Java 11**, **Spring Boot**, and **MySQL**.

> 🎯 The project is designed to demonstrate clean backend architecture, secure API communication, and real-world transactional workflows — making it an ideal project to showcase production-grade backend development skills.

---

## 🚀 Key Features

- ✅ Merchant registration with secure API key & secret generation  
- ✅ Order creation with currency, amount, and status tracking  
- ✅ Simulated payment processing (e.g., UPI, Card, Wallet)  
- ✅ Webhook triggering on successful payment events  
- ✅ Logging of webhook delivery details  
- ✅ DTO-based architecture with service-layer abstraction  
- ✅ API-key-based security layer using custom filters

---

## 🧠 Tech Stack

- **Language**: Java 17 
- **Framework**: Spring Boot  
- **Database**: MySQL (JPA/Hibernate)  
- **Libraries**: Lombok, Spring Web, Spring Security  
- **Tools**: Postman, Swagger (optional), Docker-ready structure  
- **Architecture**: RESTful layered service design

---

## 🛠️ Modules Overview

| Module       | Description |
|--------------|-------------|
| **Merchant** | Onboard new merchants and issue API keys securely |
| **Order**    | Create and manage merchant orders |
| **Payment**  | Process payment transactions for orders |
| **Webhook**  | Notify merchants of payment status via callbacks |
| **Security** | Validate API keys through request headers (`X-API-KEY`) |

---

## 📂 Project Structure
