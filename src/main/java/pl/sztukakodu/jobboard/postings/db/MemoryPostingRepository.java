package pl.sztukakodu.jobboard.postings.db;

import org.springframework.stereotype.Repository;
import pl.sztukakodu.jobboard.postings.domain.Posting;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@Repository
class MemoryPostingRepository implements PostingRepository {
    private final AtomicLong SEQ = new AtomicLong(0L);
    private final Map<Long, Posting> postings = new ConcurrentHashMap<>();

    @Override
    public List<Posting> findAll() {
        return List.copyOf(postings.values());
    }

    @Override
    public Optional<Posting> findById(Long id) {
        return Optional.ofNullable(postings.get(id));
    }

    @Override
    public Posting save(Posting posting) {
        if (posting.getId() == null) {
            posting.setId(SEQ.incrementAndGet());
        }
        postings.put(posting.getId(), posting);
        return posting;
    }

    @Override
    public void deleteById(Long id) {
        postings.remove(id);
    }
}
