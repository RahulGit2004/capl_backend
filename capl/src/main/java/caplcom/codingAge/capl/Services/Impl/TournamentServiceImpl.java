package caplcom.codingAge.capl.Services.Impl;

import caplcom.codingAge.capl.Models.Team;
import caplcom.codingAge.capl.Models.Tournament;
import caplcom.codingAge.capl.Models.request.CreateRequests.TournamentRequest;
import caplcom.codingAge.capl.Repositories.TournamentRepository;
import caplcom.codingAge.capl.Services.TournamentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TournamentServiceImpl implements TournamentService {

    @Autowired
    private TournamentRepository tournamentRepository;

    @Autowired
    private TeamServiceImpl teamService;

    @Override
    public Tournament createTournament(TournamentRequest tournamentRequest) {
        Tournament tournament = new Tournament();
        tournament.setTournamentName(tournamentRequest.getTournamentName());
        tournament.setTournamentStartDate(tournamentRequest.getTournamentStartDate());
        tournament.setTournamentEndDate(tournamentRequest.getTournamentEndDate());
        tournament.setSeasonYear(tournamentRequest.getSeasonYear());
        tournament.setStadiumName(tournamentRequest.getStadiumName());
        tournament.setStadiumAddress(tournamentRequest.getStadiumAddress());
        tournament.setCreatorId(tournamentRequest.getCreatorId());
        return tournamentRepository.save(tournament);
    }

    @Override
    public Tournament findByTournamentId(Integer tournamentId) {
        return tournamentRepository.findByTournamentId(tournamentId);
    }

    @Override
    public Tournament findBySeasonYear(Integer tournamentSeasonYear) {
        return tournamentRepository.findBySeasonYear(tournamentSeasonYear);
    }

    @Override
    public Tournament addTeamsInTournament(Integer tournamentId , Integer teamId) {
        Tournament tournament = findByTournamentId(tournamentId);

        if (tournament != null){
            TeamServiceImpl teamService = new TeamServiceImpl();
            Team team1 = teamService.getTeamById(teamId);
            if (team1 != null){
                Team team = teamService.getTeamById(teamId);
                tournament.getTeamList().add(team);
                return tournamentRepository.save(tournament);
            }
        }
        return new Tournament();
    }

    @Override
    public boolean removeTeamFromTournament(Integer tournamentId, Integer teamId) {
        Tournament tournament = findByTournamentId(tournamentId);
        if(tournament != null){
            for(Team team : getListOfTeamsOfTournament(tournamentId)){
                if(team.getId().equals(teamId)){
                    getListOfTeamsOfTournament(teamId).remove(team);
                    tournamentRepository.save(tournament);
                    return true;
                }
            }
        }
        return false;
    }

//    @Override
//    public List<MatchResult> getAllMatchesByTournamentId(Integer tournamentId) {
//        MatchResultService matchResultService = new MatchResultServiceImpl();
//        matchResultService.getMatchByTournament()
//        return List.of();
//    }


    List<Team> getListOfTeamsOfTournament(Integer tournamentId){
        Tournament tournament = findByTournamentId(tournamentId);
        if (tournament != null){
            return tournament.getTeamList();
        }
        return new ArrayList<>();
    }

}
