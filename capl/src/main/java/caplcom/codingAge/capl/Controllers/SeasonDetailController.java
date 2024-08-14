package caplcom.codingAge.capl.Controllers;

import caplcom.codingAge.capl.Models.SeasonDetail;
import caplcom.codingAge.capl.Services.SeasonDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/api/v1/season/details")
public class SeasonDetailController {

    @Autowired
    private SeasonDetailService seasonDetailService;

    //

//    public SeasonDetail createSeasonDetail() {
//        return seasonDetailService.createSeasonDetail();
//    }

    @PutMapping("/update/season/details")
    public SeasonDetail updateSeasonDetailBySeasonYear (@RequestParam String seasonYear) {
        return seasonDetailService.updateSeasonDetailBySeasonYear(seasonYear);
    }

    @GetMapping("/season/detail/by/tournament")
    public SeasonDetail getSeasonDetailByTournamentId (@RequestParam Integer tournamentId) {
        return seasonDetailService.getSeasonDetailByTournamentId(tournamentId);
    }
}
