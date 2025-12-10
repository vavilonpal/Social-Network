CREATE TABLE user_badges
(
    user_id     INT REFERENCES users (id) ON DELETE CASCADE,
    badge_id    INT REFERENCES badges (id) ON DELETE CASCADE,
    obtained_at TIMESTAMP DEFAULT NOW(),
    PRIMARY KEY (user_id, badge_id)
);