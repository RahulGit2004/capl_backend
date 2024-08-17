package caplcom.codingAge.capl.Models.request.CreateRequests;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class WicketRequest {

    private Integer batterId;
    private Integer bowlerId;
    private Integer teamId;
    private Integer fielderId;
    private String wicketDescription;

}
