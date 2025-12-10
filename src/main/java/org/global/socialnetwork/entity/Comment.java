package org.global.socialnetwork.entity;

@Entity
@Table(name = "comments")
@Data @Builder @NoArgsConstructor @AllArgsConstructor
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post post;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private User author;

    private String content;

    @Column(name = "created_at")
    private Instant createdAt;
}

