package pl.sztukakodu.jobboard.postings.web;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import pl.sztukakodu.jobboard.postings.application.PostingService;
import pl.sztukakodu.jobboard.postings.domain.Posting;

import java.util.List;

// TODO: add validation
@AllArgsConstructor
@RestController
@RequestMapping("/postings")
class PostingController {
    private final PostingService service;

    @GetMapping
    public List<Posting> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Posting getById(@PathVariable Long id) {
        return service.getById(id)
            .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public Posting add(@RequestBody Posting posting) {
        return service.add(posting);
    }

    @PutMapping("/{id}")
    public Posting update(@PathVariable Long id, @RequestBody Posting posting) {
        return service.update(id, posting)
            .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.deleteById(id);
    }
}
