# backend-mvp

## MVP1 (1차 목표)

### 목표
프론트-백엔드-DB 연결을 완주하고, 배포까지 가능한 기본 게시판을 구현한다.
인증(JWT)과 권한(작성자만 수정/삭제), 페이징/검색 등 백엔드 기본기를 증명한다.

### 포함 기능
- 회원가입 / 로그인 (JWT)
- 내 정보 조회
- 게시글 CRUD
- 게시글 목록 페이징
- 게시글 검색(제목 or 제목+내용)
- 권한 체크(작성자만 수정/삭제)

### 제외 기능 (MVP2로)
- 댓글
- 파일 업로드
- 좋아요/조회수
- 관리자 기능
- 마크다운 에디터

## IA (Information Architecture)

### Public
- / : 홈
- /login : 로그인
- /signup : 회원가입
- /posts : 게시글 목록
- /posts/{id} : 게시글 상세

### Private (로그인)
- /posts/new : 게시글 작성
- /posts/{id}/edit : 게시글 수정 (작성자만)
- /me : 내 정보 / 내가 작성한 게시글

## API Specification (v1)

### Auth
- POST /api/auth/signup : 회원가입
- POST /api/auth/login : 로그인 (JWT 발급)
- GET /api/me : 내 정보 조회

### Posts
- GET /api/posts : 게시글 목록 (페이징/검색)
- GET /api/posts/{id} : 게시글 상세
- POST /api/posts : 게시글 작성
- PUT /api/posts/{id} : 게시글 수정 (작성자만)
- DELETE /api/posts/{id} : 게시글 삭제 (작성자만)

## Database Schema

### users
- id (BIGINT, PK)
- email (VARCHAR, UNIQUE)
- password_hash (VARCHAR)
- name (VARCHAR)
- created_at (DATETIME)
- updated_at (DATETIME)

### posts
- id (BIGINT, PK)
- user_id (BIGINT, FK -> users.id)
- title (VARCHAR)
- content (TEXT)
- created_at (DATETIME)
- updated_at (DATETIME)
- deleted_at (DATETIME, nullable)

