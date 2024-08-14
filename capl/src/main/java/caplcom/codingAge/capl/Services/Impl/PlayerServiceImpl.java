package caplcom.codingAge.capl.Services.Impl;


import caplcom.codingAge.capl.Models.Player;
import caplcom.codingAge.capl.Models.request.CreateRequests.PlayerRequest;
import caplcom.codingAge.capl.Repositories.PlayerRepository;
import caplcom.codingAge.capl.Services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerServiceImpl implements PlayerService {

    @Autowired
    private PlayerRepository playerRepository;
    @Override
    public Player createPlayer(PlayerRequest playerRequest) {
        Player player = new Player();
        player.setPlayerName(playerRequest.getPlayerName());
        player.setPlayerPhone(playerRequest.getPlayerPhone());
        player.setPlayerEmail(playerRequest.getPlayerEmail());
        player.setPlayerPassword(playerRequest.getPlayerPassword());
        player.setPlayerDob(playerRequest.getPlayerDob());
        player.setPlayerAddress(playerRequest.getPlayerAddress());
        player.setPlayerType(playerRequest.getPlayerType());
        return playerRepository.save(player);
    }
    @Override
    public Player getPlayerById(Integer playerId) {
        return playerRepository.findById(playerId).orElse(null);
    }
    @Override
    public List<Player> getListOfPlayer() {
        return playerRepository.findAll();
    }
}
