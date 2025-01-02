package ma.xproce.gestionconference.service;

import lombok.RequiredArgsConstructor;
import ma.xproce.gestionconference.dao.entities.Session;
import ma.xproce.gestionconference.dao.repositories.SessionRepository;
import ma.xproce.gestionconference.dto.SessionDto;
import ma.xproce.gestionconference.mapper.SessionMapper;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class SessionServiceImpl implements SessionService {

    private final SessionRepository sessionRepository;
    private final SessionMapper sessionMapper;

    @Override
    public List<SessionDto> getAllSessions() {
        return sessionRepository.findAll().stream()
                .map(sessionMapper::fromSessionToSessionDto)
                .toList();
    }
}
