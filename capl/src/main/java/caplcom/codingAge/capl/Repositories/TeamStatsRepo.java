package caplcom.codingAge.capl.Repositories;

import caplcom.codingAge.capl.Models.TeamStats;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamStatsRepo extends MongoRepository<TeamStats,Integer> {
    TeamStats findByTeamId(Integer teamId);
}
