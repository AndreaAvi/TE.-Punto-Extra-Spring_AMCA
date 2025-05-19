package mx.unam.aragon.ico.te.animalesmarmvc.controladores;

import mx.unam.aragon.ico.te.animalesmarmvc.modelos.AnimalMarino;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Logger;

@Controller
@RequestMapping("/enciclopedia/")
public class AnimalesMarController {
    @GetMapping("/home/")
    public String home(){
        return "home";
    }

    @GetMapping("/animal-marino/")
    public String artista(Model model){
        AnimalMarino animalMarino = new AnimalMarino(
                "Ballena Azul (Balaenoptera musculus)",
                25.0,
                "0-500 m",
                "filtrador",
                "océanos de todo el mundo",
                "aletas y movimiento caudal",
                80,
                "En peligro",
                "https://es.wikipedia.org/wiki/Ballena_azul",
                "https://cdn0.expertoanimal.com/es/posts/4/3/6/alimentacion_de_la_ballena_azul_20634_600.jpg"
        );

        model.addAttribute("animalMarino",animalMarino);
        return "animal-marino";
    }
}
