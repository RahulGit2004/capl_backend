package caplcom.codingAge.capl.Repositories;


import caplcom.codingAge.capl.Models.Team;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TeamRepository extends MongoRepository<Team, Integer> {

    Team findByTeamCreatorId(Integer creatorId);

    Team findByTeamNickName(String teamNickName);
}
