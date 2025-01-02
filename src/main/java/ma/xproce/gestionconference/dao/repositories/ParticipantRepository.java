package ma.xproce.gestionconference.dao.repositories;

import ma.xproce.gestionconference.dao.entities.Participant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ParticipantRepository extends JpaRepository<Participant, Integer> {

    Optional<Participant> findByEmail(String email);
}
