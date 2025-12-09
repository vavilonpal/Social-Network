CREATE TABLE post_reactions
(
    user_id       INT REFERENCES users (id) ON DELETE CASCADE,
    post_id       INT REFERENCES posts (id) ON DELETE CASCADE,
    reaction_type VARCHAR(20) NOT NULL, -- like, clap, fire
    created_at    TIMESTAMP DEFAULT NOW(),
    PRIMARY KEY (user_id, post_id)
);