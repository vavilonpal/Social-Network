package org.global.socialnetwork.entity.compositekey;

@Embeddable
@Data @NoArgsConstructor @AllArgsConstructor
public class UserSkillId implements java.io.Serializable {

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "skill_id")
    private Long skillId;
}
