package caplcom.codingAge.capl.Services;

import caplcom.codingAge.capl.Models.SeasonDetail;

public interface SeasonDetailService {
    SeasonDetail updateSeasonDetailBySeasonYear(String seasonYear);

    SeasonDetail getSeasonDetailByTournamentId(Integer tournamentId);
}
