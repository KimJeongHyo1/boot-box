package com.sh.app.genre.entity;

import jakarta.persistence.*;
import lombok.*;
import com.sh.app.movie.entity.Movie;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "genre")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Genre {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "seq_genre_id_generator")
    @SequenceGenerator(
            name = "seq_genre_id_generator",
            sequenceName = "seq_genre_id",
            initialValue = 1,
            allocationSize = 1
    )
    private Long id;
    @Column(nullable = false)
    private String genreList;

}
