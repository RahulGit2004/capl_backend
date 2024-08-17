package caplcom.codingAge.capl.Services;

import caplcom.codingAge.capl.Models.ScoreBoard;
import caplcom.codingAge.capl.Models.request.CreateRequests.ScoreBoardRequest;
import caplcom.codingAge.capl.Models.request.UpdateRequests.UpdateScoreBoardRequest;

import java.util.List;

public interface ScoreBoardService {

    ScoreBoard createScoreBoard(ScoreBoardRequest scoreBoardRequest);

    ScoreBoard getScoreBoardById(Integer scoreBoardId);

    ScoreBoard getScoreBoardByTeamId(Integer firstTeamId,Integer secondTeamId);

    ScoreBoard editScoreBoard(UpdateScoreBoardRequest updateScoreBoardRequest);

    List<ScoreBoard> getListOfScoreBoard();
}
