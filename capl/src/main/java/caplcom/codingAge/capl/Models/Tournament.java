package caplcom.codingAge.capl.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document("Tournament")
public class Tournament {
    @Id
    private Integer tournamentId;
    private Integer seasonYear;
    private Integer creatorId;
    private Integer highestScoreBatterId;
    private Integer highestScoreBowlerId;
    private Integer winnerTeam;
    private Date tournamentStartDate;
    private Date tournamentEndDate;
    private String stadiumName;
    private String stadiumAddress;


    private List<Team> teamList;
}
