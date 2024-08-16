package caplcom.codingAge.capl.Repositories;

import caplcom.codingAge.capl.Models.Tournament;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TournamentRepository extends MongoRepository<Tournament, Integer> {

    Tournament findByTournamentId(Integer tournamentId);

    Tournament findBySeasonYear(Integer tournamentSeasonYear);

//    Tournament addTeamsInTournament(Integer tournamentId , Integer teamId);

}
