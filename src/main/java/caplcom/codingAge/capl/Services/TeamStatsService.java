package caplcom.codingAge.capl.Services;

import caplcom.codingAge.capl.Models.TeamStats;
import caplcom.codingAge.capl.Models.request.CreateRequests.TeamStatsRequest;

public interface TeamStatsService {
    public TeamStats getTeamStatsById(Integer Id);
    public TeamStats getTeamStatsByTeamId(Integer teamId);
    public TeamStats createMatchTeamStats(TeamStatsRequest teamStatsRequest);
    public TeamStats editMatchTeamStats(Integer teamId);
}
