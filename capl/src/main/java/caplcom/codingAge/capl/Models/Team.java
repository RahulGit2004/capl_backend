package caplcom.codingAge.capl.Models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document("Teams")
@Getter
@Setter
@NoArgsConstructor
public class Team {
    @Id
//    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private Integer teamCreatorId;
    private String teamName;
    private String teamNickName;
    private String teamProfilePhotoUrl;
    private Integer teamCaptainId;
    private String teamCoachName;
//    @ElementCollection
    private List<Player> playerList;
    //list of Matches, players, winningMatch, LoosingMatch, drawMatch


}
