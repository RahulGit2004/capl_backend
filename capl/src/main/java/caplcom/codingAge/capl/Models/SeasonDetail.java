package caplcom.codingAge.capl.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection ="seasonDetail")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SeasonDetail {

    @Id

    private Integer seasonDetailId;

    private String seasonYear;

    // todo need List<Tournament> and List<Stats>


}
