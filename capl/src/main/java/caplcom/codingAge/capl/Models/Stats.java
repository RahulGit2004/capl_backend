package caplcom.codingAge.capl.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@Document
@AllArgsConstructor
@NoArgsConstructor


public class Stats {
    @Id
    private Integer statsId;

    private Integer matchId;
    private Integer teamId;
    private Integer playerId;
    private int totalRuns;
    private double strikeRate;
    private double economyRate;
    private double totalBalls;
    private int totalFours;
    private int totalSix;
    private List<Wicket> wickets;

}
