package caplcom.codingAge.capl.Repositories;

import caplcom.codingAge.capl.Models.Tournament;
import caplcom.codingAge.capl.Models.request.CreateRequests.TournamentRequest;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TournamentRepository extends MongoRepository<Tournament, Integer> {

    Tournament save(TournamentRequest tournamentRequest);

    Tournament findByTournamentById(Integer tournamentId);

    Tournament findTournamentBySeasonYear(Integer tournamentSeasonYear);

    Tournament addTeamsInTournament(Integer tournamentId , Integer teamId);

    Tournament removeTeamsFromTournament(Integer tournamentId, Integer teamId);

//    List<Matches> getAllMatchesByTournamentId(Integer tournamentId);
}
