package ma.xproce.gestionconference.dto;


import lombok.*;
import ma.xproce.gestionconference.dao.entities.Commentaire;
import ma.xproce.gestionconference.dao.entities.Participant;
import ma.xproce.gestionconference.dao.entities.Session;
import ma.xproce.gestionconference.dao.entities.Speaker;

import java.time.LocalDate;
import java.util.List;


@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ConferenceDto {
    private String titre;

    private LocalDate date;

    private Integer heureDebut;

    private Integer heureFin;

    private String description;

    private Session session;

    private Participant speaker;

}
