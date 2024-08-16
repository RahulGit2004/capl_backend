package caplcom.codingAge.capl.Models;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection ="MatchResult")
public class MatchResult {
    @Id
//    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private Integer matchId;
    private Integer tournamentId;
    private Integer firstTeamId;
    private Integer secondTeamId;
    private String matchDate;
    private String matchTime;
    private String tossWon;
    private String tossSelected;
    private String ScoreCard;
}
