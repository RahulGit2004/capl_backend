package caplcom.codingAge.capl.Services;


import caplcom.codingAge.capl.Models.Player;
import caplcom.codingAge.capl.Models.request.CreateRequests.PlayerRequest;

import java.util.List;

public interface PlayerService {
    Player createPlayer(PlayerRequest playerRequest);
    Player getPlayerById(Integer playerId);
    List<Player> getListOfPlayer();

}
