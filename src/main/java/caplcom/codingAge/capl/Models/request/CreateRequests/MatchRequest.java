package caplcom.codingAge.capl.Models.request.CreateRequests;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class MatchRequest {
    private Integer tournamentId;
    private Integer creatorId;
    private Integer firstTeamId;
    private Integer secondTeamId;
    private Integer matchDate;
    private Integer matchTime;
    private double overs;
}
