package caplcom.codingAge.capl.Services.Impl;

import caplcom.codingAge.capl.Models.Stats;
import caplcom.codingAge.capl.Models.request.CreateRequests.StatsRequest;
import caplcom.codingAge.capl.Models.request.UpdateRequests.UpdateStats;
import caplcom.codingAge.capl.Repositories.StatsRepository;
import caplcom.codingAge.capl.Services.StatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class StatsSeviceImpl implements StatsService {
    @Autowired
    private StatsRepository statsRepository;
    @Override
    public Stats createStats(StatsRequest statsRequest) {
        // need the reason behind this..
    Stats stats = statsRepository.findByPlayerId(statsRequest.getPlayerId());
     if (stats != null){
         stats.setMatchId(statsRequest.getMatchId());
         stats.setTeamId(statsRequest.getTeamId());
         stats.setPlayerId(statsRequest.getPlayerId());
         stats.setTotalRuns(statsRequest.getTotalRuns());
         stats.setStrikeRate(statsRequest.getStrikeRate());
         stats.setEconomyRate(statsRequest.getEconomyRate());
         stats.setTotalBalls(statsRequest.getTotalBalls());
         stats.setTotalFours(statsRequest.getTotalFours());
         stats.setTotalSix(statsRequest.getTotalSix());

         return statsRepository.save(stats);
     }
     else{
         return new Stats();
     }
    }

    @Override
    public Stats getStatsById(Integer statsId) {
//        return statsRepository.findByStatsId(statsId).orElse(null);
        Stats stats = statsRepository.findByStatsId(statsId);
        return Objects.requireNonNullElseGet(stats, Stats::new);

    }

    @Override
    public Stats updateStats(UpdateStats updateStats) {
        // id is not in Stats model..
        Optional<Stats> stats=statsRepository.findById(updateStats.getId());
        if (stats.isPresent()){
            Stats stats1 = new Stats();
            stats1.setMatchId(updateStats.getMatchId());
            stats1.setTeamId(updateStats.getTeamId());
            stats1.setPlayerId(updateStats.getPlayerId());
            stats1.setTotalRuns(updateStats.getTotalRuns());
            stats1.setStrikeRate(updateStats.getStrikeRate());
            stats1.setEconomyRate(updateStats.getEconomyRate());
            stats1.setTotalBalls(updateStats.getTotalBalls());
            stats1.setTotalFours(updateStats.getTotalFours());
            stats1.setTotalSix(updateStats.getTotalSix());
//            stats1.setWickets(updateStats.getWickets());
        }
        return new Stats();
    }

    @Override
    public List<Stats> getAll() {
            return statsRepository.findAll();
    }

}
