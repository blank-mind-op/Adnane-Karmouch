package ma.xproce.gestionconference.dao.entities;


import jakarta.persistence.*;
import lombok.*;
import ma.xproce.gestionconference.dao.entities.enums.InscriptionStatus;

import java.time.LocalDate;


@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Inscription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private LocalDate date;

    @Enumerated(EnumType.STRING)
    private InscriptionStatus status;

    private Integer prix;


    @ManyToOne
    private Invite invite;
}
