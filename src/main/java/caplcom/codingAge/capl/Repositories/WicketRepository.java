package caplcom.codingAge.capl.Repositories;

import caplcom.codingAge.capl.Models.Wicket;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WicketRepository extends MongoRepository<Wicket, Integer> {
    Wicket findByWicketId(Integer wicketId);

    List<Wicket> findByBowlerId(Integer bowlerId);

    List<Wicket> findByBatterId(Integer batterId);
    Wicket findByBatterIdAndTeamId(Integer batterId, Integer teamId);
}
