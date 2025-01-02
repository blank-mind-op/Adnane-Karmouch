package ma.xproce.gestionconference.mapper;



import ma.xproce.gestionconference.dao.entities.Conference;
import ma.xproce.gestionconference.dto.ConferenceDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ConferenceMapper {

    private final ModelMapper mapper = new ModelMapper();

    public ConferenceDto fromConferenceToConferenceDto(Conference conference){
        return mapper.map(conference, ConferenceDto.class);
    }

    public Conference fromConferencceDtoToCOnference(ConferenceDto conferenceDto){
        return  mapper.map(conferenceDto,Conference.class);
    }


}
