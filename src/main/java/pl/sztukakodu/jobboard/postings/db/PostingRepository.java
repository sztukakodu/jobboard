package pl.sztukakodu.jobboard.postings.db;

import pl.sztukakodu.jobboard.postings.domain.Posting;

import java.util.List;
import java.util.Optional;

public interface PostingRepository {
    List<Posting> findAll();

    Optional<Posting> findById(Long id);

    Posting save(Posting posting);

    void deleteById(Long id);
}
