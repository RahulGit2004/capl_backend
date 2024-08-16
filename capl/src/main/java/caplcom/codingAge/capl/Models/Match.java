package caplcom.codingAge.capl.Models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection ="Match")
@Getter
@Setter
@NoArgsConstructor
public class Match {
    @Id
    private Integer id;
    private Integer tournamentId;
    private Integer creatorId;
    private Integer firstTeamId;
    private Integer secondTeamId;
    private Integer matchDate;
    private Integer matchTime;
    private double overs;
    private Integer tossWonTeamId;
    private String selectionOfTossWinningTeam;
    // add Scoreboard scoreBoard object for match
}
