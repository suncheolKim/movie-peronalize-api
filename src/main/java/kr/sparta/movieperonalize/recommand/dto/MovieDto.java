package kr.sparta.movieperonalize.recommand.dto;

import lombok.Getter;

@Getter
public class MovieDto {
    private Long id;
    private String title;
    private String originalTitle;
    private String year;
    private String country;
    private String ageRatings;
    private String genre;
    private String runtime;
    private String releaseDate;
    private String director;
    private String description;
    private String actors;
}
