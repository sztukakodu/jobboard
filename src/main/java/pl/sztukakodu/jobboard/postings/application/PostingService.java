package pl.sztukakodu.jobboard.postings.application;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.sztukakodu.jobboard.postings.db.PostingRepository;
import pl.sztukakodu.jobboard.postings.domain.Posting;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class PostingService {
    private final PostingRepository repository;

    public List<Posting> getAll() {
        return repository.findAll();
    }

    public Optional<Posting> getById(Long id) {
        return repository.findById(id);
    }

    public Posting add(Posting posting) {
        return repository.save(posting);
    }

    public Optional<Posting> update(Long id, Posting newPosting) {
        return repository.findById(id)
            .map(posting -> {
                newPosting.setId(id);
                return repository.save(newPosting);
            });
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
