package ma.xproce.gestionconference.service;


import lombok.RequiredArgsConstructor;
import ma.xproce.gestionconference.dao.entities.Participant;
import ma.xproce.gestionconference.dao.repositories.ParticipantRepository;
import ma.xproce.gestionconference.dto.ParticipantDto;
import ma.xproce.gestionconference.mapper.ParticipantMapper;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ParticipantServiceImpl implements ParticipantService{

    private final ParticipantRepository participantRepository;
    private final ParticipantMapper participantMapper;
    private final PasswordEncoder passwordEncoder;

    @Override
    public ParticipantDto addParticipant(ParticipantDto participantDto) {

        Participant participant = participantMapper.fromParticipantDtoToParticipant(participantDto);

        participant.setPassword(passwordEncoder.encode(participant.getPassword()));
        return participantMapper.fromParticipantToParticipantDto(
                participantRepository.save(participant)
        );
    }

    @Override
    public ParticipantDto getAuthenticatedMinimalEmployee() {

        Participant participant1 =(Participant) SecurityContextHolder.getContext()
                .getAuthentication()
                .getPrincipal();
        return participantMapper.fromParticipantToParticipantDto(participant1);
    }
}
