package caplcom.codingAge.capl.Repositories;

import caplcom.codingAge.capl.Models.SeasonDetail;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeasonDetailRepository extends MongoRepository<SeasonDetail, Integer> {
    SeasonDetail findBySeasonYear(String seasonYear);
}
