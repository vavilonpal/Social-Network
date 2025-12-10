CREATE TABLE followers
(
    follower_id INT REFERENCES users (id) ON DELETE CASCADE,
    followee_id INT REFERENCES users (id) ON DELETE CASCADE,
    created_at  TIMESTAMP DEFAULT NOW(),
    PRIMARY KEY (follower_id, followee_id)
);