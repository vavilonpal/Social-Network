CREATE TABLE badges
(
    id          SERIAL PRIMARY KEY,
    code        VARCHAR(50) UNIQUE NOT NULL,
    title       VARCHAR(100)       NOT NULL,
    description TEXT
);