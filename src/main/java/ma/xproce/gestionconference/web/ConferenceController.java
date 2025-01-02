package ma.xproce.gestionconference.web;


import lombok.RequiredArgsConstructor;
import ma.xproce.gestionconference.dao.entities.Participant;
import ma.xproce.gestionconference.dao.entities.Session;
import ma.xproce.gestionconference.dao.entities.Speaker;
import ma.xproce.gestionconference.dto.ConferenceDto;
import ma.xproce.gestionconference.service.ConferenceService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class ConferenceController {

    private final ConferenceService conferenceService;

    @GetMapping("/conferences")
    public String allConferences(Model model){
        model.addAttribute("conferences",conferenceService.getAllConferences());

        return "conferences";

    }

    @GetMapping("/conferences/add-conference")
    public String addConferenceForm(Model model){
        model.addAttribute("newConference",new ConferenceDto());

        return "add-conference";
    }

    @PostMapping("/conferences/add-conference")
    public String addConference(
            @ModelAttribute ConferenceDto newConference,
            @RequestParam String sessionName,
            @RequestParam String speakerName
    ){
        Participant speaker = new Speaker();
        speaker.setNom(speakerName);

        Session session = new Session();
        session.setNom(sessionName);
        
        newConference.setSpeaker(speaker);
        newConference.setSession(session);

        conferenceService.addConference(newConference);
        
        return "redirect:/conferences";
    }
}
