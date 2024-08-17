package caplcom.codingAge.capl.Services;


import caplcom.codingAge.capl.Models.MatchResult;
import caplcom.codingAge.capl.Models.request.CreateRequests.MatchResultRequest;
import caplcom.codingAge.capl.Models.request.UpdateRequests.UpdateMatchResult;

import java.util.List;

public interface MatchResultService {
    MatchResult getMatchById(Integer matchId);

    List<MatchResult> getMatchByTeamId(Integer teamId);

    MatchResult createMatchResult(MatchResultRequest matchResultRequest);

    MatchResult editMatchResult(UpdateMatchResult updateMatchResult);
}
