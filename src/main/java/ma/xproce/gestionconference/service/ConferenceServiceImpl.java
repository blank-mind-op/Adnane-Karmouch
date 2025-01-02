package ma.xproce.gestionconference.service;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import ma.xproce.gestionconference.dao.entities.Conference;
import ma.xproce.gestionconference.dao.entities.Participant;
import ma.xproce.gestionconference.dao.entities.Session;
import ma.xproce.gestionconference.dao.entities.Speaker;
import ma.xproce.gestionconference.dao.repositories.*;
import ma.xproce.gestionconference.dto.ConferenceDto;
import ma.xproce.gestionconference.mapper.ConferenceMapper;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class ConferenceServiceImpl implements ConferenceService{

    private final SessionRepository sessionRepository;
    private final CommentaireRepository commentaireRepository;
    private final SpeakerRepository speakerRepository;
    private final ParticipantRepository participantRepository;

    private final ConferenceMapper conferenceMapper;
    private final ConferenceRepository conferenceRepository;

    @Override
    public ConferenceDto addConference(ConferenceDto conferenceDto) {

        Conference conference = conferenceMapper.fromConferencceDtoToCOnference(conferenceDto);

        sessionRepository.save(conference.getSession());

        participantRepository.save(conferenceDto.getSpeaker());

        conference = conferenceRepository.save(conference);

        return conferenceMapper.fromConferenceToConferenceDto(conference);
    }

    @Override
    public List<ConferenceDto> findConferenceBySpeakerMail(String email) {

        List<Conference> conferences = conferenceRepository.findConferenceBySpeakerEmail(email);

        return conferences.stream()
                .map(conferenceMapper::fromConferenceToConferenceDto)
                .toList();
    }

    @Override
    public Conference fromConferenceDtoToConferenceService(ConferenceDto conferenceDto) {

        Session session = sessionRepository.findById(conferenceDto.getSession().getId())
                .orElseThrow(()-> new EntityNotFoundException("Session Not found"));

        Participant speaker = participantRepository.findById(conferenceDto.getSpeaker().getId())
                .orElseThrow(()->new EntityNotFoundException("Speaker not found"));


        return Conference.builder()
                .id(null)
                .titre(conferenceDto.getTitre())
                .date(conferenceDto.getDate())
                .heureDebut(conferenceDto.getHeureDebut())
                .heureFin(conferenceDto.getHeureFin())
                .description(conferenceDto.getDescription())
                .session(session)
                .speaker(speaker)
                .build();

    }

    @Override
    public List<ConferenceDto> getAllConferences() {

        List<Conference> conferences = conferenceRepository.findAll();
        return conferences.stream()
                .map(conferenceMapper::fromConferenceToConferenceDto)
                .toList();
    }



    @Override
    public Boolean removeConference(ConferenceDto conferenceDto) {

        Conference conference = fromConferenceDtoToConferenceService(conferenceDto);
        try{
            conferenceRepository.delete(conference);
        }catch (Exception E){
            return false;
        }
        return null;
    }
}
