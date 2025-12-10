package org.global.socialnetwork.entity;

@Entity
@Table(name = "chains")
@Data @Builder @NoArgsConstructor @AllArgsConstructor
public class Chain {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private User author;

    private String title;

    private String description;

    @Column(name = "created_at")
    private Instant createdAt;

    @OneToMany(mappedBy = "chain", cascade = CascadeType.ALL)
    private List<ChainStep> steps;
}

