package pl.sztukakodu.jobboard.postings.db;

import pl.sztukakodu.jobboard.postings.domain.Posting;

import java.util.List;

public interface PostingsRepository {
    List<Posting> findAll();
    void save(Posting posting);
}
