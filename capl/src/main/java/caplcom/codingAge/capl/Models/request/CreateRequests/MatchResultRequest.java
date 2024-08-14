package caplcom.codingAge.capl.Models.request.CreateRequests;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class MatchResultRequest {
    private Integer tournamentId;
    private Integer firstTeamId;
    private Integer secondTeamId;
    private String matchDate;
    private String matchTime;
    private String tossWon;
    private String tossSelected;
    private String ScoreCard;
}
