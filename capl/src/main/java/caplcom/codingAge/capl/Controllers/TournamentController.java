package caplcom.codingAge.capl.Controllers;

import caplcom.codingAge.capl.Models.Tournament;
import caplcom.codingAge.capl.Models.request.CreateRequests.TournamentRequest;
import caplcom.codingAge.capl.Services.TournamentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/capl/tournament")
public class TournamentController {
    @Autowired
    private TournamentService tournamentService;

    @PostMapping("/create/tournament")
    public Tournament createTournament(@RequestBody TournamentRequest tournamentRequest){
        return tournamentService.createTournament(tournamentRequest);
    }

    @GetMapping("/findByTournamentId")
    public Tournament findByTournamentById(@RequestParam Integer tournamentId){
        return tournamentService.findByTournamentById(tournamentId);
    }

    @GetMapping("/findTournamentBySeasonYear")
    public Tournament findTournamentBySeasonYear(@RequestParam Integer tournamentSeasonYear){
        return tournamentService.findTournamentBySeasonYear(tournamentSeasonYear);
    }

    @PutMapping("/addTeamsInTournament")
    public Tournament addTeamsInTournament(@RequestParam Integer tournamentId , Integer teamId){
        return tournamentService.addTeamsInTournament(tournamentId , teamId);
    }

    @PutMapping("/removeTeamsFromTournament")
    public Tournament removeTeamsFromTournament(@RequestParam Integer tournamentId , Integer teamId){
        return tournamentService.removeTeamsFromTournament(tournamentId , teamId);
    }

//    public List<Matches> getAllMatchesByTournamentId(@RequestParam Integer tournamentId){
//        return tournamentService.getAllMatchesByTournamentId(tournamentId);
//    }


}
