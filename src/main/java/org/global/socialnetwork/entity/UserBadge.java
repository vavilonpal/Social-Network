package org.global.socialnetwork.entity;

@Entity
@Table(name = "user_badges")
@Data @Builder @NoArgsConstructor @AllArgsConstructor
public class UserBadge {

    @EmbeddedId
    private UserBadgeId id;

    @ManyToOne
    @MapsId("userId")
    private User user;

    @ManyToOne
    @MapsId("badgeId")
    private Badge badge;

    @Column(name = "obtained_at")
    private Instant obtainedAt;
}
