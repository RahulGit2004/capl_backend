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
@Document(collection = "Extras")
public class Extras {
    @Id
    private Integer id;
    private Integer teamId;
    private Integer wideRun;
    private Integer legByRun;
    private Integer noBallRun;
}
