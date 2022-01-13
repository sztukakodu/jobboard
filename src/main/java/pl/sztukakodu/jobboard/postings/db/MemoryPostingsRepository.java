package pl.sztukakodu.jobboard.postings.db;

import org.springframework.stereotype.Repository;
import pl.sztukakodu.jobboard.postings.domain.Posting;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Repository
class MemoryPostingsRepository implements PostingsRepository {
    private final Map<String, Posting> postings = new ConcurrentHashMap<>();

    @Override
    public List<Posting> findAll() {
        return List.copyOf(postings.values());
    }

    @Override
    public void save(Posting posting) {
        postings.put("newId", posting);
    }
}
