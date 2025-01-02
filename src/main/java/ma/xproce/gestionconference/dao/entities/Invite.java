package ma.xproce.gestionconference.dao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Invite extends Participant{

    private String affiliation;


    @OneToMany(mappedBy = "invite")
    private List<Inscription> inscriptions;
}
