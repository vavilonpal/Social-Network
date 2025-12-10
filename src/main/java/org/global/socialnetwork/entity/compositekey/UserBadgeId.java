package org.global.socialnetwork.entity.compositekey;

@Embeddable
@Data @NoArgsConstructor @AllArgsConstructor
public class UserBadgeId implements java.io.Serializable {

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "badge_id")
    private Long badgeId;
}
