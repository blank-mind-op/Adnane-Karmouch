package ma.xproce.gestionconference.service;

import ma.xproce.gestionconference.dao.entities.Conference;
import ma.xproce.gestionconference.dto.ConferenceDto;

import java.util.List;

public interface ConferenceService {

    public ConferenceDto addConference(ConferenceDto conferenceDto);

    public List<ConferenceDto> findConferenceBySpeakerMail(String email);

    public Conference fromConferenceDtoToConferenceService(ConferenceDto conferenceDto);

    public List<ConferenceDto> getAllConferences();

    public Boolean removeConference(ConferenceDto conferenceDto);

}
