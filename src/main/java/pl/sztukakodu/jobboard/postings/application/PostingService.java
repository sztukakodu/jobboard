package pl.sztukakodu.jobboard.postings.application;

import org.springframework.stereotype.Service;
import pl.sztukakodu.jobboard.postings.db.PostingsRepository;
import pl.sztukakodu.jobboard.postings.domain.Posting;

import java.util.List;

@Service
public class PostingService {
    private final PostingsRepository repository;

    public PostingService(PostingsRepository repository) {
        this.repository = repository;
    }

    public List<Posting> getAll() {
        return repository.findAll();
    }

    public void add(Posting posting) {
        repository.save(posting);
    }

}
