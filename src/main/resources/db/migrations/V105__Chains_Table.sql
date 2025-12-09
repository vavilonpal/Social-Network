CREATE TABLE chains
(
    id          SERIAL PRIMARY KEY,
    author_id   INT          REFERENCES users (id) ON DELETE SET NULL,
    title       VARCHAR(255) NOT NULL,
    description TEXT,
    created_at  TIMESTAMP DEFAULT NOW()
);