package kr.sparta.movieperonalize.recommand;

import kr.sparta.movieperonalize.recommand.dto.MovieDto;
import kr.sparta.movieperonalize.recommand.enumtype.MovieGenre;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class RecommendController {
    private final RecommendService recommendService;

    public RecommendController(RecommendService recommendService) {
        this.recommendService = recommendService;
    }

    @GetMapping("/movies/genre/{genre}")
    public List<MovieDto> getMoviesByGenre(@PathVariable MovieGenre genre) {
        return recommendService.getMoviesByGenre(genre);
    }
}
