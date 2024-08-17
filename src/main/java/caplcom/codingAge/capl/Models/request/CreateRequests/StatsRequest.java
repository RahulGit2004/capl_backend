package caplcom.codingAge.capl.Models.request.CreateRequests;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class StatsRequest {

    private Integer matchId;
    private Integer teamId;
    private Integer playerId;
    private int totalRuns;
    private double strikeRate;
    private double economyRate;
    private double totalBalls;
    private int totalFours;
    private int totalSix;
}
