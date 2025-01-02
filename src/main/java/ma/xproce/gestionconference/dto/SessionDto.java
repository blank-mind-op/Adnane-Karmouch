package ma.xproce.gestionconference.dto;

import lombok.*;
import ma.xproce.gestionconference.dao.entities.Conference;
import ma.xproce.gestionconference.dao.entities.Moderateur;
import ma.xproce.gestionconference.dao.entities.Salle;

import java.util.List;


@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SessionDto {

    private String nom;

    private Salle salle;

}
