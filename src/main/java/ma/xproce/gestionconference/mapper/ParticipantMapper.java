package ma.xproce.gestionconference.mapper;


import ma.xproce.gestionconference.dao.entities.Participant;
import ma.xproce.gestionconference.dto.ParticipantDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ParticipantMapper {

    private final ModelMapper mapper = new ModelMapper();

    public ParticipantDto fromParticipantToParticipantDto(Participant participant){
        return mapper.map(participant, ParticipantDto.class);
    }

    public Participant fromParticipantDtoToParticipant(ParticipantDto participantDto){
        return mapper.map(participantDto, Participant.class);
    }

}
