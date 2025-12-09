CREATE TABLE users (
                       id SERIAL PRIMARY KEY,
                       username VARCHAR(50) UNIQUE NOT NULL,
                       email VARCHAR(120) UNIQUE NOT NULL,
                       password_hash TEXT NOT NULL,
                       avatar_url TEXT,
                       bio TEXT,
                       created_at TIMESTAMP DEFAULT NOW()
);