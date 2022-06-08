package movies.spring.data.neo4j.api;

import movies.spring.data.neo4j.Author.AuthorEntity;
import movies.spring.data.neo4j.Author.AuthorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AuthorController {
    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping("/getAuthorByAuthorId")
    List<AuthorEntity> getAuthorByAuthorName(@RequestParam("AuthorId") String AuthorId) {
        return authorService.findByAuthorId(AuthorId);
    }
}
