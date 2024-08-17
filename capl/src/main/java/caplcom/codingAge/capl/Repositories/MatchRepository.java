package caplcom.codingAge.capl.Repositories;

import caplcom.codingAge.capl.Models.Match;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MatchRepository extends MongoRepository<Match, Integer> {
    List<Match> findAllByFirstTeamId(Integer teamId);

    Match findByMatchId(String id);
}
