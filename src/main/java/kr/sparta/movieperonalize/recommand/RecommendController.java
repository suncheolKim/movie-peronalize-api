package kr.sparta.movieperonalize.recommand;

import kr.sparta.movieperonalize.recommand.dto.MovieDto;
import kr.sparta.movieperonalize.recommand.enumtype.MovieGenre;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class RecommendController {
    private final RecommandService recommandService;

    public RecommendController(RecommandService recommandService) {
        this.recommandService = recommandService;
    }

    @GetMapping("/movies/genre/{genre}")
    public List<MovieDto> getMoviesByGenre(@PathVariable MovieGenre genre) {
        return recommandService.getMoviesByGenre(genre)
                .collectList()
                .block();
    }
}
