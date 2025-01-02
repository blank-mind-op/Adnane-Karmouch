package ma.xproce.gestionconference.web;


import lombok.RequiredArgsConstructor;
import ma.xproce.gestionconference.dto.ParticipantDto;
import ma.xproce.gestionconference.service.ParticipantService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class AuthController {
    private final ParticipantService participantService;

    @GetMapping("/login")
    public String loginPage(){
        return "login";
    }

    @GetMapping("/signup")
    public String signupPage(){
        return "signup";
    }

    @PostMapping("/signup")
    public String signup(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam String password
    ){
        ParticipantDto participantDto = ParticipantDto.builder()
                .nom(name)
                .email(email)
                .password(password)
                .build();

        participantService.addParticipant(participantDto);
        return "redirect:login";
    }

    @GetMapping("/")
    public String homePage(Model model){
        ParticipantDto participantDto = participantService.getAuthenticatedMinimalEmployee();
        model.addAttribute("participant", participantDto);

        return "index";
    }

}
