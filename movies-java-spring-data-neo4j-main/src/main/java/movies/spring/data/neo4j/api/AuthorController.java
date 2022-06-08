package movies.spring.data.neo4j.api;

import movies.spring.data.neo4j.Author.AuthorEntity;
import movies.spring.data.neo4j.Author.AuthorService;
import movies.spring.data.neo4j.movies.MovieDetailsDto;
import movies.spring.data.neo4j.movies.MovieResultDto;
import movies.spring.data.neo4j.movies.MovieService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class AuthorController {
    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping("/getAuthorByAuthorName")
    List<AuthorEntity> getAuthorByAuthorName(@RequestParam("AuthorId") String AuthorId) {
        return authorService.findByAuthorName(AuthorId);
    }
}
