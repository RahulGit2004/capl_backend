package caplcom.codingAge.capl.Services;

import caplcom.codingAge.capl.Models.Tournament;
import caplcom.codingAge.capl.Models.request.CreateRequests.TournamentRequest;

public interface TournamentService {

    Tournament createTournament(TournamentRequest tournamentRequest);

    Tournament findByTournamentById(Integer tournamentId);

    Tournament findTournamentBySeasonYear(Integer tournamentSeasonYear);

    Tournament addTeamsInTournament(Integer tournamentId , Integer teamId);

    Tournament removeTeamsFromTournament(Integer tournamentId, Integer teamId);

//    List<Tournament> getAllMatchesByTournamentId(Integer tournamentId);
}
