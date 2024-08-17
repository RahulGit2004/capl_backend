package caplcom.codingAge.capl.Services;

import caplcom.codingAge.capl.Models.Extras;
import caplcom.codingAge.capl.Models.request.CreateRequests.ExtrasRequest;
import caplcom.codingAge.capl.Models.request.UpdateRequests.UpdateExtras;

import java.util.List;

public interface ExtrasService {
    Extras createExtras(ExtrasRequest extrasRequest);

    Extras getExtrasById(Integer id);

    List<Extras> getExtrasByTeamId(Integer teamId);

    Extras updateExtrasById(UpdateExtras updateExtras);
}
