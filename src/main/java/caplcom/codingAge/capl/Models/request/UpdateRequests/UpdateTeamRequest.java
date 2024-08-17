package caplcom.codingAge.capl.Models.request.UpdateRequests;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class UpdateTeamRequest {
    private Integer teamId;
    private Integer creatorId;
    private String teamName;
    private String teamNickName;
    private String teamProfilePhotoUrl;
    private Integer teamCaptainId;
    private String teamCoachName;
}
