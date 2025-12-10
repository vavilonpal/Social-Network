package org.global.socialnetwork.entity;

@Entity
@Table(name = "user_skills")
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class UserSkill {

    @EmbeddedId
    private UserSkillId id;

    @ManyToOne
    @MapsId("userId")
    private User user;

    @ManyToOne
    @MapsId("skillId")
    private Skill skill;

    private Integer level;
}

