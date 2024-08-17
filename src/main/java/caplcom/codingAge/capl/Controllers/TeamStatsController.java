package caplcom.codingAge.capl.Controllers;

import caplcom.codingAge.capl.Models.TeamStats;
import caplcom.codingAge.capl.Models.request.CreateRequests.TeamStatsRequest;
import caplcom.codingAge.capl.Services.TeamStatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/capl/teamstats")
public class TeamStatsController {
    @Autowired
    private TeamStatsService teamStatsService;

    @GetMapping("/seebyid")
    // what we are getting here...
    public TeamStats getTeamStatsById(@RequestParam Integer id){
      return teamStatsService.getTeamStatsById(id);
    }
    @GetMapping("/seebyTeamid")
    /// same here
    public TeamStats getTeamStatsByTeamId(@RequestParam Integer teamId){
        return teamStatsService.getTeamStatsByTeamId(teamId);
    }
/*
    @GetMapping("/seeWonMatchesById")
    public TeamStats getWinMatchesById(@RequestParam Integer id){
        return teamStatsService.getWinMatchesById(id).get();
    }


    @GetMapping("/seeWonMatchesByTeamId")
    public TeamStats getWinMatchesByTeamId(@RequestParam Integer TeamId){
        return teamStatsService.getWinMatchesByTeamId(TeamId).get();
    }

    @GetMapping("/seeLooseMatchesByTeamId")
    public TeamStats getLooseMatchByTeamId(@RequestParam Integer TeamId){
        return teamStatsService.getLooseMatchByTeamId(TeamId).get();
    }

   @GetMapping("/seeDrawnMatchesByTeamId")
   public TeamStats getDrawnMatchesByTeamId(@RequestParam Integer TeamId){
      return teamStatsService.getDrawnMatchesByTeamId(TeamId).get();
    }

 */

    @PostMapping("/createMatchTeamStats")
    // need to use proper naming convention
    public TeamStats createMatchTeamStats(@RequestBody TeamStatsRequest teamStatsRequest) {
        return teamStatsService.createMatchTeamStats(teamStatsRequest);
    }

    @PutMapping("/editmatchTeamStats")
    public TeamStats editMatchTeamStats(@RequestParam Integer teamId){
        return teamStatsService.editMatchTeamStats(teamId);
    }
/*
    @PutMapping("/addWonMatches")
    public TeamStats addWinsmatches(@RequestParam Integer teamId){
        return teamStatsService.addWinsmatches(teamId);
    }

    @PutMapping("/addDrawMatches")
    public TeamStats addDrawnMatches(@RequestParam Integer teamId){
        return teamStatsService.addDrawnMatches(TeamId);
    }

 */

}
