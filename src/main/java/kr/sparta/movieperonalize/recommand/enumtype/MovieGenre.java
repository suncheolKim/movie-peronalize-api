package kr.sparta.movieperonalize.recommand.enumtype;

import lombok.Getter;

@Getter
public enum MovieGenre {
    ACTION("액션"),
    ADVENTURE("모험"),
    ANIMATION("애니메이션"),
    COMEDY("코미디"),
    CRIME("범죄"),
    DISASTER("재난"),
    DRAMA("드라마"),
    FAMILY("가족"),
    FANTASY("판타지"),
    GROWTH("성장"),
    HISTORICAL("역사"),
    HORROR("공포"),
    MYSTERY("미스터리"),
    ROMANCE("로맨스"),
    SF("SF"),
    SEKAI("세카이"),
    THRILLER("스릴러");

    private final String korean;

    MovieGenre(String korean) {
        this.korean = korean;
    }
}
