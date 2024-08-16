package caplcom.codingAge.capl.Services;

import caplcom.codingAge.capl.Models.MatchResult;
import caplcom.codingAge.capl.Models.Tournament;
import caplcom.codingAge.capl.Models.request.CreateRequests.TournamentRequest;

import java.util.List;

public interface TournamentService {

    Tournament createTournament(TournamentRequest tournamentRequest);

    Tournament findByTournamentId(Integer tournamentId);

    Tournament findBySeasonYear(Integer tournamentSeasonYear);

    Tournament addTeamsInTournament(Integer tournamentId , Integer teamId);

    boolean removeTeamFromTournament(Integer tournamentId, Integer teamId);

//    List<MatchResult> getAllMatchesByTournamentId(Integer tournamentId);

}
