package ma.xproce.gestionconference.dao.entities;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Session {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nom;

    @OneToOne
    private Salle salle;


    @OneToMany(mappedBy = "session")
    private List<Conference> conferences;


    @OneToOne
    private Moderateur moderateur;
}
