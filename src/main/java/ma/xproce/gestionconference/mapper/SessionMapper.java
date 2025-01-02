package ma.xproce.gestionconference.mapper;


import ma.xproce.gestionconference.dao.entities.Session;
import ma.xproce.gestionconference.dto.SessionDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class SessionMapper {

    public final ModelMapper modelMapper = new ModelMapper();

    public SessionDto fromSessionToSessionDto(Session session){
        return modelMapper.map(session, SessionDto.class);
    }

    public Session fromSessionDtoToSession(SessionDto sessionDto){
        return modelMapper.map(sessionDto, Session.class);
    }
}
