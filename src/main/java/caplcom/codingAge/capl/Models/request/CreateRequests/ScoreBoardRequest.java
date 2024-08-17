package caplcom.codingAge.capl.Models.request.CreateRequests;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
public class ScoreBoardRequest {

    private Integer firstTeamId;
    private Integer secondTeamId;
    private Integer strikerId;
    private Integer nonStrikerId;
    private Integer bowlerId;
    private int totalRuns;
    private double overs;
    private int noOfWickets;

}