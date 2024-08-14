package caplcom.codingAge.capl.Models.request.UpdateRequests;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UpdateStats {

    private Integer id;
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
