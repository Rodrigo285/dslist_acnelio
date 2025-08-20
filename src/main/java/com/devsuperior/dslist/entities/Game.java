package com.devsuperior.dslist.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb_game")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Game {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", length = 50, nullable = false)
    private String title;

    @Column(name = "game_year", nullable = false)
    private Integer year;

    @Column(name = "genre", length = 50, nullable = false)
    private String genre;

    @Column(name = "platforms", length = 50, nullable = false)
    private String platforms;

    @Column(name = "score", nullable = false)
    private Double score;

    @Column(name = "img_url", nullable = false)
    private String imgUrl;

    @Column(name = "short_description", length = 254, nullable = false)
    private String shortDescription;

    @Column(name = "long_description", length = 1000, nullable = false)
    private String longDescription;


}
