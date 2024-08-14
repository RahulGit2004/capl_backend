package caplcom.codingAge.capl.Repositories;

import caplcom.codingAge.capl.Models.ScoreBoard;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ScoreBoardRepository extends MongoRepository<ScoreBoard, Integer> {

    ScoreBoard findByFirstTeamId (Integer firstTeamId);

    List<ScoreBoard> findAllByFirstTeamId(Integer firstTeamId);
}
