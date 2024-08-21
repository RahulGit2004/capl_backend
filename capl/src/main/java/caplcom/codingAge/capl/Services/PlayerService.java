package caplcom.codingAge.capl.Services;


import caplcom.codingAge.capl.Models.Player;
import caplcom.codingAge.capl.Models.request.CreateRequests.PlayerRequest;

import java.util.List;

public interface PlayerService {
    Player createPlayer(PlayerRequest playerRequest);
    Player getPlayerById(String playerId);
    List<Player> getListOfPlayer();
    Player saveUpdates(Player player);
<<<<<<< HEAD

    String getEconomyRate(String playerId);

    String getStikeRate(String playerId);
=======
    int getAllFoursByPlayerId(String playerId);
    int getAllSixByPlayerId(String playerId);
>>>>>>> fb51bb03294b94678d54e26bc3b1d5da3d3bb17e
}
