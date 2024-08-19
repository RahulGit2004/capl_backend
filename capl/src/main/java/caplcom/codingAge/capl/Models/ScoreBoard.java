package caplcom.codingAge.capl.Models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document(collection ="scoreboard")
@Getter
@Setter
@NoArgsConstructor
public class ScoreBoard {

    @Id
    private String id;
    private String firstTeamId;
    private String secondTeamId;
    private String strikerId;
    private String nonStrikerId;
    private String bowlerId;
    private int totalRuns;
    private double overs;
    private int noOfWickets;
<<<<<<< HEAD
    private List <Stats> statsList;
    private List <Extras> extrasList;
=======
    private List <Stats> statsList = new ArrayList<>();
     // we have need list of Extras here...
    Extras extras;
>>>>>>> 6e51f5924794f7818ff7a5585a12c680d8fb2538
}
