package caplcom.codingAge.capl.Models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("scoreboard")
@Getter
@Setter
@NoArgsConstructor
public class ScoreBoard {

    @Id
    private Integer id;
    private Integer firstTeamId;
    private Integer secondTeamId;
    private Integer strikerId;
    private Integer nonStrikerId;
    private Integer bowlerId;
    private int totalRuns;
    private double overs;
    private int noOfWickets;
    // List of stats
    // Extras extras
}
