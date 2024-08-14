package caplcom.codingAge.capl.Services;


import caplcom.codingAge.capl.Models.Player;
import caplcom.codingAge.capl.Models.Team;
import caplcom.codingAge.capl.Models.request.CreateRequests.TeamRequest;
import caplcom.codingAge.capl.Models.request.UpdateRequests.UpdateTeamRequest;

import java.util.List;

public interface TeamService {
    Team createTeam(TeamRequest teamRequest);

    Team getTeamById(Integer teamId);

    Team getTeamByCreatorId(Integer creatorId);

    Team updateTeamDetails(UpdateTeamRequest updateTeamRequest);

    List<Player> getListOfPlayers(Integer teamId);

    boolean addPlayerInTeam(Integer teamId, Integer playerId);

    List<Team> getListOfTeam();

    boolean removePlayerFromTeam(Integer teamId, Integer playerId);
}
