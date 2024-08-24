package caplcom.codingAge.capl.Models;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.sql.Time;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection ="MatchResult")
public class MatchResult {
    @Id
    private String id;
    private String matchId;
    private String firstTeamTotalRuns;
    private String firstTeamTotalWickets;
    private String secondTeamTotalRuns;
    private String secondTeamTotalWickets;
    private String winnerTeam;
    private String manOfTheMatch;
}
