package org.global.socialnetwork.entity;

@Entity
@Table(name = "bookmarks")
@Data @Builder @NoArgsConstructor @AllArgsConstructor
public class Bookmark {

    @EmbeddedId
    private BookmarkId id;

    @ManyToOne
    @MapsId("userId")
    private User user;

    @ManyToOne
    @MapsId("postId")
    private Post post;

    @Column(name = "created_at")
    private Instant createdAt;
}
