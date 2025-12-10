package org.global.socialnetwork.entity;

@Entity
@Table(name = "chain_steps")
@Data @Builder @NoArgsConstructor @AllArgsConstructor
public class ChainStep {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "chain_id")
    private Chain chain;

    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post post;

    @Column(name = "step_number", nullable = false)
    private Integer stepNumber;
}

