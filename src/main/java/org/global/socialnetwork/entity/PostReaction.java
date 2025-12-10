package org.global.socialnetwork.entity;

@Entity
@Table(name = "post_reactions")
@Data @Builder @NoArgsConstructor @AllArgsConstructor
public class PostReaction {

    @EmbeddedId
    private PostReactionId id;

    @ManyToOne
    @MapsId("userId")
    private User user;

    @ManyToOne
    @MapsId("postId")
    private Post post;

    @Column(name = "reaction_type")
    private String reactionType;

    @Column(name = "created_at")
    private Instant createdAt;
}
