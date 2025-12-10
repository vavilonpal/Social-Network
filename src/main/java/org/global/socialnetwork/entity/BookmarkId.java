package org.global.socialnetwork.entity;

@Embeddable
@Data @NoArgsConstructor @AllArgsConstructor
public class BookmarkId implements java.io.Serializable {

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "post_id")
    private Long postId;
}