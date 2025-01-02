package ma.xproce.gestionconference.security;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import ma.xproce.gestionconference.dao.entities.Participant;
import ma.xproce.gestionconference.dao.repositories.ParticipantRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class ParticipantDetailsService implements UserDetailsService {

    public final ParticipantRepository participantRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Participant participant = participantRepository.findByEmail(email)
                .orElseThrow(()->new EntityNotFoundException("Participant Not Found"));
        return participant;
    }
}
