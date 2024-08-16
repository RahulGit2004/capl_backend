package caplcom.codingAge.capl.Services.Impl;

import caplcom.codingAge.capl.Models.Tournament;
import caplcom.codingAge.capl.Models.request.CreateRequests.TournamentRequest;
import caplcom.codingAge.capl.Repositories.TournamentRepository;
import caplcom.codingAge.capl.Services.TournamentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TournamentServiceImpl implements TournamentService {

    @Autowired
    private TournamentRepository tournamentRepository;

    @Override
    public Tournament createTournament(TournamentRequest tournamentRequest) {
        return tournamentRepository.save(tournamentRequest);
    }

    @Override
    public Tournament findByTournamentById(Integer tournamentId) {
        return tournamentRepository.findByTournamentById(tournamentId);
    }

    @Override
    public Tournament findTournamentBySeasonYear(Integer tournamentSeasonYear) {
        return tournamentRepository.findTournamentBySeasonYear(tournamentSeasonYear);
    }

    @Override
    public Tournament addTeamsInTournament(Integer tournamentId , Integer teamId) {
        return tournamentRepository.addTeamsInTournament(tournamentId , teamId);
    }

    @Override
    public Tournament removeTeamsFromTournament(Integer tournamentId, Integer teamId) {
//        return tournamentRepository.removeTeamsFromTournament(tournamentId , teamId);
        return  new Tournament();
    }

//    @Override
//    public List<Matches> getAllMatchesByTournamentId(Integer tournamentId) {
//        return tournamentRepository.getAllMatchesByTournamentId(tournamentId);
//    }


}
