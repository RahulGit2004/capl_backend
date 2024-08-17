package caplcom.codingAge.capl.Models.request.UpdateRequests;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateMatchRequest {
    private Integer matchId;
    private Integer creatorId;
    private Integer matchDate;
    private Integer matchTime;
    private double overs;
    private Integer tossWonTeamId;
    private String selectionOfTossWinningTeam;
}
