package caplcom.codingAge.capl.Models.request.UpdateRequests;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UpdateExtras {
    private Integer id;
    private Integer teamId;
    private Integer wideRun;
    private Integer legByRun;
    private Integer noBallRun;
}
