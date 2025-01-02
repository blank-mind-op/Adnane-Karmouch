package ma.xproce.gestionconference.service;

import ma.xproce.gestionconference.dao.repositories.ParticipantRepository;
import ma.xproce.gestionconference.dto.ParticipantDto;

public interface ParticipantService {

    public ParticipantDto addParticipant(ParticipantDto participantDto);
    public ParticipantDto getAuthenticatedMinimalEmployee();
}
