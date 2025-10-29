WEEK 1 — Java + Spring Boot fundamentals + DSA base + JS basics

Weekly goal: Build a working CRUD Spring Boot API skeleton; solve 10 DSA problems; learn JS basics.

Mon — Day 1

Block A: Java refresher — throw away notes (interfaces, OOP, collections). Implement small examples: Map, List, Stream filtering (30–45 min). Create new Maven Spring Boot project using start.spring.io (REST template). Build Product model. (Rest of Block: scaffold controllers/services/repositories skeleton).

Block B: DSA — Arrays & Strings problem #1 on LeetCode (easy). Write problem approach in dsa/README.md.

Block C: Write README for springboot-api describing planned endpoints.

Tue — Day 2

A: Spring Boot: Controllers → implement GET /products and GET /products/{id} backed by in-memory list; test with Postman. Add basic DTOs.

B: DSA — Arrays problem #2 (easy). Note time complexity.

C: Add Maven dependencies: Spring Web, Spring Data JPA (but use in-memory H2 for now). Commit.

Wed — Day 3

A: JPA basics: create Product entity and ProductRepository (H2). Implement POST /products. Validate request body (use @Valid).

B: DSA — Strings problem #3 (easy-medium).

C: Add unit test skeleton for controller (JUnit 5).

Thu — Day 4

A: Service layer, Exception handling (@ControllerAdvice), add PUT /products and DELETE /products/{id}. Manual testing in Postman.

B: DSA — HashMap pattern problem #4.

C: Create application.properties for H2, add simple sample data runner.

Fri — Day 5 (2 hours)

A (8–9 PM): Java concurrency basics overview (threads vs executor) — read summary and a tiny example.

B (9–10 PM): DSA — HashMap problem #5.

C: Commit and push all Week1 code. Tag week1-springboot.

Sat — Day 6 (4–6 hours)

A (4 hrs): Add persistence with Postgres/MySQL (Dockerize DB or local). Migrate from H2 to Postgres. Test CRUD.

B (1–2 hrs): Create README for API (endpoints, sample requests). Add swagger dependency and configure Swagger UI (basic).

Deliverable: working Spring Boot CRUD app with Postgres, Swagger, and tests.

Sun — Day 7 (3–4 hours)

A: JavaScript fundamentals — variables, let/const, functions, arrow functions, async/await, promises. Try quick Node REPL examples.

B: DSA — Two pointers/sliding window problem (#6).

C: Plan Week 2 tasks, write goals: "Add Auth skeleton (JWT) & start TypeScript basics."

End of Week 1 deliverables: Spring Boot CRUD app (Postgres), 6 DSA problems solved documented, JS basics notes.