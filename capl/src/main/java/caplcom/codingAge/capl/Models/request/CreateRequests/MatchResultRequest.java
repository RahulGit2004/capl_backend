package caplcom.codingAge.capl.Models.request.CreateRequests;

import caplcom.codingAge.capl.Models.ScoreBoard;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Time;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
public class MatchResultRequest {
    private String matchId;
    private String firstTeamTotalRuns;
    private String firstTeamTotalWickets;
    private String secondTeamTotalRuns;
    private String secondTeamTotalWickets;
    private String winnerTeam;
    private String manOfTheMatch;
}
