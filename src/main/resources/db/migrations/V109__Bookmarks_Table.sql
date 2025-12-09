CREATE TABLE bookmarks
(
    user_id    INT REFERENCES users (id) ON DELETE CASCADE,
    post_id    INT REFERENCES posts (id) ON DELETE CASCADE,
    created_at TIMESTAMP DEFAULT NOW(),
    PRIMARY KEY (user_id, post_id)
);