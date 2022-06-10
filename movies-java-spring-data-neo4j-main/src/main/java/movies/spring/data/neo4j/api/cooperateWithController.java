package movies.spring.data.neo4j.api;

import movies.spring.data.neo4j.Author.AuthorEntity;
import movies.spring.data.neo4j.CooperateWith.cooperateWithService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class cooperateWithController {
    private final cooperateWithService cooperateWithService;

    public cooperateWithController(movies.spring.data.neo4j.CooperateWith.cooperateWithService cooperateWithService) {
        this.cooperateWithService = cooperateWithService;
    }

    @GetMapping("/getCooperationByName")
    List<AuthorEntity> findCooperationByAuthorName(@RequestParam("authorName") String authorName) {
        System.out.println("test" + authorName);
        return cooperateWithService.findCooperationByAuthorName(authorName);
    }
}
