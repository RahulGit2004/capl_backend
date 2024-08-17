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
@Document(collection ="TeamStat")
@NoArgsConstructor
@AllArgsConstructor
public class TeamStats {
    @Id
    private Integer id;
    private Integer teamId;
    private List<Match> matchWinning;
    private List<Match> matchLosing;
    private List<Match> matchDrawn;
}
