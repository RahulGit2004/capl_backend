package caplcom.codingAge.capl.Services.Impl;

import caplcom.codingAge.capl.Models.SeasonDetail;
import caplcom.codingAge.capl.Repositories.SeasonDetailRepository;
import caplcom.codingAge.capl.Services.SeasonDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SeasonDetailServiceImpl implements SeasonDetailService {

    @Autowired
    private SeasonDetailRepository seasonDetailRepository;

    @Override
    public SeasonDetail updateSeasonDetailBySeasonYear(String seasonYear) {
        SeasonDetail seasonDetail = seasonDetailRepository.findBySeasonYear(seasonYear);
        if (seasonDetail != null) {
            // what things are update I don't have idea
        }
        
        return new SeasonDetail();
    }

    // need Tournament class for below method.

    @Override
    public SeasonDetail getSeasonDetailByTournamentId(Integer tournamentId) {
        return null;
    }
}
