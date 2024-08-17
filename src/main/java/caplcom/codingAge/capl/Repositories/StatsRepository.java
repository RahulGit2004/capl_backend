package caplcom.codingAge.capl.Repositories;

import caplcom.codingAge.capl.Models.Stats;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface StatsRepository extends MongoRepository<Stats,Integer> {

    Stats findByPlayerId(Integer playerId);
    Stats findByStatsId(Integer statsId);
}
