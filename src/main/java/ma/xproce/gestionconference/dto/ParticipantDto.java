package ma.xproce.gestionconference.dto;


import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ParticipantDto {

    private String nom;

    private String email;

    private String photo;

    private String password;

    private String genre;
}
