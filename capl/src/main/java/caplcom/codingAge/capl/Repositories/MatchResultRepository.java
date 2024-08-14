package caplcom.codingAge.capl.Repositories;

import caplcom.codingAge.capl.Models.MatchResult;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MatchResultRepository extends MongoRepository<MatchResult, Integer> {
    MatchResult findByMatchId(Integer matchId);


    List<MatchResult> findByFirstTeamId(Integer teamId);

    List<MatchResult> findBySecondTeamId(Integer teamId);
}
