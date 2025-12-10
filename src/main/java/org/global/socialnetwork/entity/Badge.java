package org.global.socialnetwork.entity;

@Entity
@Table(name = "badges")
@Data @Builder @NoArgsConstructor @AllArgsConstructor
public class Badge {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String code;

    private String title;

    private String description;
}

