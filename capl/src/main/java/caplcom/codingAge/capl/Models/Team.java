package caplcom.codingAge.capl.Models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection ="Teams")
@Getter
@Setter
@NoArgsConstructor
public class Team {
    @Id
    private String teamId;
    private String teamCreatorId;
    private String teamName;
    private String teamNickName;
    private String teamProfilePhotoUrl;
    private String teamCaptainId;
    private String teamCoachName;
    private List<Player> playerList;
    private List<Match> matchList;
    // here we need List<TeamStats>


}
