package caplcom.codingAge.capl.Models.request.UpdateRequests;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class UpdateScoreBoardRequest {

    private Integer firstTeamId;
    private Integer strikerId;
    private Integer nonStrikerId;
    private Integer bowlerId;
    private int totalRuns;
    private double overs;
    private int noOfWickets;
}
