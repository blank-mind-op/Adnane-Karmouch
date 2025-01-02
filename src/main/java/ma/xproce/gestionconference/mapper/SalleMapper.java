package ma.xproce.gestionconference.mapper;


import ma.xproce.gestionconference.dao.entities.Salle;
import ma.xproce.gestionconference.dto.SalleDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class SalleMapper {
    private final ModelMapper mapper = new ModelMapper();

    public SalleDto fromSalleToSalleDto(Salle salle){
        return mapper.map(salle, SalleDto.class);
    }

    public Salle fromSalleDtoToSalle(SalleDto salleDto){
        return mapper.map(salleDto, Salle.class);
    }
}
