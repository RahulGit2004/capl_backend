package caplcom.codingAge.capl.Models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document("TeamStats")
@Getter
@Setter
@NoArgsConstructor
public class TeamStats {
    @Id
//    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
//    @ElementCollection
    private List<String> matchesWinning ;
//    @ElementCollection
    private List<String> matchesLooses ;
//    @ElementCollection
    private List<String> matchesDraw ;

}
