package ma.xproce.gestionconference.service;

import ma.xproce.gestionconference.dao.entities.Session;
import ma.xproce.gestionconference.dto.SessionDto;

import java.util.List;

public interface SessionService {

    public List<SessionDto> getAllSessions();
}
