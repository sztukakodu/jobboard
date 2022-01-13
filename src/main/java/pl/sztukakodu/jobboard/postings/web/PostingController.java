package pl.sztukakodu.jobboard.postings.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.sztukakodu.jobboard.postings.application.PostingService;
import pl.sztukakodu.jobboard.postings.domain.Posting;

import java.util.List;

@RestController
@RequestMapping("/posting")
class PostingController {
    private final PostingService service;

    PostingController(PostingService service) {
        this.service = service;
    }

    @GetMapping
    public List<Posting> getAll() {
        return service.getAll();
    }

    @PostMapping
    public void add(Posting posting) {
        service.add(posting);
    }

}
