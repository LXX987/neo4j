package movies.spring.data.neo4j.Cache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CacheService {

    @Autowired
    private CacheRepository cacheRepository;
    public CacheEntity.cacheResult findOne(String id){
        return cacheRepository.findById(id).get();
    }

    public CacheEntity.cacheResult save(CacheEntity.cacheResult result){
        return cacheRepository.save(result);
    }

    public List<CacheEntity.cacheResult> queryAll(){
        return cacheRepository.findAll();
    }

    public Boolean existsById(String id){
        return cacheRepository.existsById(id);
    }
}
