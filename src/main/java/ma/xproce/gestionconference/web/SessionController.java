package ma.xproce.gestionconference.web;


import lombok.RequiredArgsConstructor;
import ma.xproce.gestionconference.dao.repositories.SessionRepository;
import ma.xproce.gestionconference.service.SessionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class SessionController {

    private final SessionService sessionService;

    @GetMapping("/sessions")
    public String allSessions(Model model){
        model.addAttribute("allSessions",sessionService.getAllSessions());
        return "all-sessions";
    }
}
