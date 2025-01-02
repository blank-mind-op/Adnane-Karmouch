package ma.xproce.gestionconference.dto;


import jakarta.persistence.OneToOne;
import lombok.*;
import ma.xproce.gestionconference.dao.entities.Session;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SalleDto {
    private String nom;

    private SessionDto sessionDto;
}
