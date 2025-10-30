Week 0 — Prep (tonight / before Week 1 starts)

Goal: repo ready, environment set up.

Tonight (or ASAP, 1–2 hours):

Create GitHub repo dev-transition-portfolio.

Create folders: /springboot-api, /react-frontend, /go-service, /dsa.

Install dev tools:

Java (11/17), Maven, VSCode/IntelliJ

Node.js + npm, yarn (optional)

Go (1.20+)

Postgres or MySQL locally (or Docker)

Docker Desktop / Docker CLI

Create a short README with roadmap outline and commit it.

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

WEEK 2 — JWT Auth + TypeScript basics + continued DSA

Weekly goal: Add JWT auth to Spring Boot; learn TypeScript basics; 8 more DSA problems.

Mon

A: Implement user entity and auth endpoints: POST /auth/register, POST /auth/login. Use BCrypt for password hashing.

B: DSA — Linked List easy (#7).

C: Add JWT filter + security config (Spring Security minimal): secure product endpoints.

Tue

A: Finish JWT flows; test: register → login → access protected endpoint with token.

B: DSA — Stack problem (#8).

C: Add integration test that authenticates and calls protected endpoint.

Wed

A: TypeScript basics: types, interfaces, union types, generics demo. Setup a small TS project ts-playground (tsconfig, npm init).

B: DSA — Queue problem (#9).

C: Write API usage doc showing how to call auth and product endpoints (include JWT example).

Thu

A: TypeScript async/await + fetch usage examples. Build a tiny Node script that calls your Spring Boot API (login + get products).

B: DSA — Recursion problem (#10).

C: Commit and push changes. Tag week2-auth-ts.

Fri

A: Light: refactor code to DTOs and mapping (ModelMapper or manual). Check code hygiene.

B: DSA — Binary search easy (#11).

C: Prepare weekend Go setup.

Sat (5–6 hours)

A: Install Go, create go-service folder, go mod init dev-portfolio-go. Build a minimal Gin/Fiber service with GET /health and POST /echo.

B: DSA — Trees (basic traversal problem #12).

C: Dockerize Spring Boot app (Dockerfile) and run containers locally with Postgres.

Sun (3–4 hours)

A: TypeScript + Node axios example call to Spring Boot secured endpoint (use token in header).

B: DSA — Sliding window / two pointers problem #13.

C: Plan Week 3: React basics + Go REST.

End of Week 2 deliverables: JWT auth in Spring Boot, TypeScript basics + Node call scripts, simple Go service scaffold, ~13 DSA problems done.

WEEK 3 — React (TS) basics + Go REST API (CRUD) + DSA

Weekly goal: Build simple React frontend (TypeScript) consuming your API; create Go CRUD microservice.

Mon

A: Initialize React + TypeScript app (create-react-app my-frontend --template typescript or Vite). Scaffold pages: Login page, Products list page.

B: DSA — LinkedList medium (#14).

C: Create React components skeleton (Header, Auth context).

Tue

A: Implement login flow in React: form, call /auth/login, store JWT in memory (or localStorage for now).

B: DSA — HashMap medium (#15).

C: Implement protected route to Products page that fetches /products.

Wed

A: Go REST: build POST /items, GET /items, GET /items/:id, DELETE /items/:id using Gin or Fiber. Use a simple SQLite or Postgres Docker instance.

B: DSA — Binary tree (inorder traversal) (#16).

C: Add logging and basic error handling to Go service.

Thu

A: React: display products list (with token), add create product form calling POST /products.

B: DSA — Two pointers medium (#17).

C: Setup CORS handling in Spring Boot so React can call API.

Fri

A (light): Add form validation in React (simple input checks). Commit.

B: DSA — Recap easiest missed problems (#18).

C: Prepare Saturday integration tasks.

Sat (5–6 hours)

A: Integrate React UI with Spring Boot backend fully: listing, create, update (if time). Add logout.

B: Create minimal CI script locally (GitHub Actions sample) or at least a shell script to build and run Docker containers for backend + frontend.

C: DSA — Solve 3 medium problems (pick ones you struggled with).

Sun (3–4 hours)

A: Add Dockerfile for React app (build static) and create docker-compose.yml for Spring Boot + Postgres + React static serving (if desired).

B: DSA — Heap / PriorityQueue problem (#19).

C: Update project READMEs and push deployments to GitHub.

End of Week 3 deliverables: React frontend with login + product list, Go CRUD microservice, docker-compose, ~19–22 DSA problems.

WEEK 4 — Improve project, add JWT on React, start System Design basics

Weekly goal: Full-stack polish (JWT in React + secure flows), start system design fundamentals, 8 DSA problems.

Mon

A: React — add role-based UI (if product owner vs regular user). Show/hide actions.

B: DSA — Graph basics (BFS) (#20).

C: Add unit tests for one Spring Boot controller (JUnit + MockMvc).

Tue

A: Add refresh token flow in Spring Boot (if time, simple implementation) or at least handle token expiry client-side gracefully.

B: DSA — Graph DFS problem (#21).

C: Document authentication flow in repo wiki.

Wed

A: System design — read/watch 2 short videos: "How REST APIs scale" and "Caching basics". Write 1-page notes: when to use cache, pros/cons.

B: DSA — Sliding window medium (#22).

C: Add Redis (Docker) as optional cache for product listing (if time, implement simple TTL caching).

Thu

A: Go service: add one useful feature — consume message via HTTP or write to DB; add health endpoint and /metrics (basic).

B: DSA — LinkedList medium (#23).

C: Add CI step in GitHub Actions to run unit tests for Spring Boot.

Fri

A: Light: polish UI styles, mobile responsiveness basics.

B: DSA — Backtracking easy (#24).

C: Push all documentation and tag week4-polish.

Sat (5–6 hours)

A: Prep a deployment: deploy backend to Render/Heroku/ Railway free tier (or provide instructions in README if you cannot deploy). Deploy frontend as static (Netlify/Vercel).

B: DSA — take a 2-hour mock test: 3 problems under time.

C: Prepare resume entries from your project work (3–4 bullet points).

Sun (3–4 hours)

A: System design — draw a simple architecture for your app (one page): client, backend, auth, DB, cache.

B: DSA — Trees medium (#25).

C: Make a small “How to run this project” video (screen record 2–3 mins) or write step-by-step.

End of Week 4 deliverables: Deployed (or runnable) full-stack app, system design notes, ~25–28 DSA problems.

WEEK 5 — Go concurrency basics, advanced TS, more DSA, start targeted interview prep

Weekly goal: Solidify Go fundamentals (goroutines, channels), TypeScript deeper features, 8–10 DSA, begin interview template creation.

Mon

A: Go — concurrency basics: goroutines, channels, mutex. Implement producer/consumer toy program.

B: DSA — Binary search tree problem (#26).

C: Add a section to README describing Go microservice and how it connects.

Tue

A: TypeScript advanced: generics, mapped types, utility types. Refactor a small React helper using generics.

B: DSA — Dynamic programming easy (#27).

C: Add typings to Axios calls and API responses.

Wed

A: Go HTTP middleware: implement logging middleware, error wrapper.

B: DSA — DP medium (#28).

C: Add small health-check and graceful shutdown to Go service.

Thu

A: Security review: review code for common vulnerabilities (no hard-coded secrets, secure config). Replace secrets with env vars and document.

B: DSA — Recency: solve 2 problems you got wrong earlier.

C: Create interview-prep folder with 1-pager "How I explain my projects" notes.

Fri

A: Light: polish 2 resume bullets per project; update LinkedIn headline and summary draft.

B: DSA — Hashing pattern recap (#29).

C: Set 10 target companies and roles (list names + job links if present) — start tailoring resume.

Sat (5–6 hours)

A: Mock technical interview: schedule or do self-interview. Use Pramp or role-play with a friend.

B: DSA — Do a timed 2-problem session.

C: Apply to 10 roles (customized cover/resume where possible).

Sun (3–4 hours)

A: System design — small design: how to scale product listing for 1M requests/day: write 1-page answer (DB sharding, caching, CDN).

B: DSA — Advanced tree/graph (#30).

C: Commit all changes; send 3 recruiter messages on LinkedIn (short, personalized).

End of Week 5 deliverables: Go concurrency sample, advanced TS examples, interview notes, ~35 DSA problems.

WEEK 6 — Focus on medium-hard DSA, mock interviews, polish portfolio, start applying aggressively

Weekly goal: Solve medium DSA set, 2–3 mock interviews, aggressive applications.

Mon

A: DSA heavy — solve 2 LeetCode medium problems under 45–60 minutes each.

B: Review Spring Boot performance tips (indexing, pagination).

C: Add pagination to products endpoint.

Tue

A: System design — read about rate limiting & API gateways; design simple approach.

B: DSA — medium problem 2.

C: Add rate limit middleware or note design in README.

Wed

A: Mock interview #1 (DSA + system design) — record it.

B: DSA — medium problem 3.

C: Fix issues found in mock interview.

Thu

A: React — add better UX: loading states, error handling, retry for auth calls.

B: DSA — medium problem 4.

C: Make sure frontend uses env variables for API URL (for deployment flexibility).

Fri

A: Light: polish README and project screenshots for resume.

B: DSA — review 5 previously solved problems.

C: Apply to 15 jobs (LinkedIn/AngelList/company jobs). Track each application.

Sat (5–6 hours)

A: Mock interview #2 — backend coding + explanation of one of your projects (30–45 min).

B: System design — prepare 5 short answers explaining design tradeoffs for your app.

C: DSA — timed 2-problem session.

Sun (3–4 hours)

A: Go deepening — add database transactions or connection pooling in Go service.

B: DSA — one harder medium problem (#40).

C: Prepare for next week: select top 20 companies and prepare company-specific notes.

End of Week 6 deliverables: polished portfolio, several mock interviews completed, ~45 DSA problems.

WEEK 7 — Final push: refine, interview practice, whiteboard, hiring pipeline

Weekly goal: Be interview-ready: DSA, system design, HR answers, live mock interviews.

Mon

A: DSA — solve 2 timed medium problems.

B: Practice explaining 3 past bugs you fixed (SDET → dev narrative): how you found, fixed, and tests added.

C: Update resume's top section: "Software Engineer (Backend) — Java, Spring Boot, React, Go".

Tue

A: Whiteboard practice: explain product API flow and DB schema on paper for 20 minutes.

B: DSA — problem pair 2.

C: Fix any low-priority issues on GitHub projects (README clarity, add screenshots).

Wed

A: Mock interview #3 with peer or paid service focusing on system design.

B: DSA — problem pair 3.

C: Write 3–4 “STAR” stories for HR behavioral questions (team work, conflict, ownership).

Thu

A: Quick review: Spring Boot (transactions, lazy/eager), Go concurrency notes, React hooks checklist.

B: DSA — review top 20 problems you’ve solved, annotate patterns.

C: Prepare a short 60-second elevator pitch: your story — SDET → dev (have it memorized).

Fri

A: Light — apply to 20 more targeted roles; send follow-ups on prior applications.

B: DSA — light warmup (1 easy, 1 medium).

C: Schedule 3 mock interviews for next week.

Sat (6–7 hours)

A: Live mock interviews (2 back-to-back) including coding + system design.

B: Do a “hireable package” check: resume, GitHub, LinkedIn, deployed links all present and accurate.

C: DSA — final timed set (3 problems in 2 hours).

Sun (3–4 hours)

A: Relaxed review — go over mistakes from mocks; make short flashcards with improvements.

B: Final commit: tag ready-for-interview.

C: Make a shortlist of companies for targeted outreach (include why you fit).

End of Week 7 deliverables: interview-ready package, mock interviews done, ~55 DSA problems.

WEEK 8 — Apply, interview, follow-up, continue iteration

Weekly goal: Interview cycle: live interviews, feedback loops, iterate on weak areas.

Mon–Thu (each day)

A: Continue targeted applications + LinkedIn outreach (1 hour).

B: DSA practice: 1 daily timed medium.

C: If interviews scheduled, focus on company-specific prep; otherwise run mocks.

Fri

A: Light: follow up on applications. Prepare coding environment for interviews (IDE, shortcuts).

B: DSA — review errors this week.

C: Rest & mental prep for weekend interviews.

Sat

A: If interviews scheduled — do them. Otherwise: full-length mock interview (2 hours coding + 45 min system design).

B: Make improvements to code and docs based on interviewer feedback.

C: Plan next 4 weeks after you land interviews — deeper learning or alternative offers.

Sun

A: Reflect on interview feedback, update resume/GitHub accordingly.

B: Keep solving DSA (1–2 problems).

C: Prepare a short plan for Month 3 if you want to deepen Go/TS/React.

End of Week 8 deliverables: multiple applications sent, interviews taken, iterative improvements applied.

BUSY-DAY FALLBACK (when office work consumes time)

If you can only spare 1 hour (or less) on a weekday:

30 min: DSA (one easy problem + write notes)

30 min: Micro task: README update, commit, or a tiny UI fix
If you can spare 2 hours:

60 min: Block A compressed (read or code one small feature)

60 min: DSA (1 medium or 2 easy)

Always keep weekend catch-up slots reserved.

Resources (quick list)

DSA: LeetCode, NeetCode lists, G4G for patterns

Java/Spring Boot: official Spring guides (start.spring.io), Baeldung articles (for reference)

Go: Go by Example, official Go docs, Gin docs

React/TS: React docs, TypeScript docs, Vite or Create React App templates

Docker deploy: official Docker docs; Render/Heroku/Railway for free deployments

Mock interviews: Pramp, Interviewing.io, peers, or paid platforms

(You don’t need to visit all now — pick one authoritative resource per tech and stick to it.)