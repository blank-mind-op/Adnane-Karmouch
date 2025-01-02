package ma.xproce.gestionconference.dao.repositories;

import ma.xproce.gestionconference.dao.entities.Conference;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ConferenceRepository extends JpaRepository<Conference,Integer> {

    List<Conference> findConferenceBySpeakerEmail(String email);

    Conference findConferenceByTitre(String titre);

}
