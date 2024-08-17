package caplcom.codingAge.capl.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection ="seasonDetail")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SeasonDetail {

    @Id
    private String seasonDetailId;

    private String seasonYear;
    private List<Tournament> tournamentList;
    private List<Stats> statsList;




}
