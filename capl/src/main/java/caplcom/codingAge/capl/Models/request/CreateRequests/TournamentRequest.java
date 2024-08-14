package caplcom.codingAge.capl.Models.request.CreateRequests;

import caplcom.codingAge.capl.Models.Team;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TournamentRequest {
    private Integer tournamentId;
    private Integer seasonYear;
    private Integer creatorId;
    private Date tournamentStartDate;
    private Date tournamentEndDate;
    private String stadiumName;
    private String stadiumAddress;


    private List<Team> teamList;
}
