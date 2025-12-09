CREATE TABLE user_skills
(
    user_id  INT REFERENCES users (id) ON DELETE CASCADE,
    skill_id INT REFERENCES skills (id) ON DELETE CASCADE,
    level    INT DEFAULT 1 CHECK (level BETWEEN 1 AND 5),
    PRIMARY KEY (user_id, skill_id)
);