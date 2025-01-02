package ma.xproce.gestionconference.dao.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.*;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Speaker extends Participant{

    private String lienProfil;


}
