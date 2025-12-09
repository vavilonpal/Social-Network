CREATE TABLE chain_steps
(
    id          SERIAL PRIMARY KEY,
    chain_id    INT REFERENCES chains (id) ON DELETE CASCADE,
    post_id     INT REFERENCES posts (id) ON DELETE CASCADE,
    step_number INT NOT NULL,
    UNIQUE (chain_id, step_number)
);