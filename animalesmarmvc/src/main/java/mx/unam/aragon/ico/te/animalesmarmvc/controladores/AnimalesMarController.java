package mx.unam.aragon.ico.te.animalesmarmvc.controladores;

import mx.unam.aragon.ico.te.animalesmarmvc.modelos.AnimalMarino;
import mx.unam.aragon.ico.te.animalesmarmvc.repositorios.AnimalMarRepository;
import mx.unam.aragon.ico.te.animalesmarmvc.servicios.AnimalMarService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/enciclopedia/")
public class AnimalesMarController {
    @Autowired
    private AnimalMarService animalMarService;
    @Autowired
    private AnimalMarRepository animalMarRepository;

    @GetMapping("/home/")
    public String home(){
        return "home";
    }

    @GetMapping("/animal-marino/")
    public String artista(Model model){
        AnimalMarino animalMarino = new AnimalMarino(
                1,
                "Ballena Azul (Balaenoptera musculus)",
                25.0,
                "0-500 m",
                "Filtrador",
                "Océanos de todo el mundo",
                "Aletas y movimiento caudal",
                80,
                "En peligro",
                "https://es.wikipedia.org/wiki/Ballena_azul",
                "https://cdn0.expertoanimal.com/es/posts/4/3/6/alimentacion_de_la_ballena_azul_20634_600.jpg"
        );

        model.addAttribute("animalMarino",animalMarino);
        return "animal-marino";
    }

    @GetMapping("/nuevo")
    public String nuevo(Model model){
        model.addAttribute("animalMarino",new AnimalMarino(
                0,
                "Nautilus",
                0.25,
                "200-700 m",
                "Carnívoro",
                "Océanos Indo-Pacífico",
                "Propulsión por chorro de agua",
                20,
                "Preocupación menor",
                "https://es.wikipedia.org/wiki/Nautilo",
                "https://www.muyinteresante.com/wp-content/uploads/sites/5/2023/02/18/63f0c70a4cfd4.jpeg"
        ));
        return "animal-marino-forms";
    }

    @PostMapping("/guardar")
    public String guardar(
            @ModelAttribute AnimalMarino animalMarino
    ){
        LoggerFactory.getLogger(getClass()).info("Se ha guardado un animal marino: " + animalMarino);
        animalMarService.guardarAnimalMarino(animalMarino);
        return "redirect:/enciclopedia/nuevo?exito";
    }

    @GetMapping("/animal-marino/{id}")
    public String animalMarino(@PathVariable Integer id, Model model){
        model.addAttribute("animalMarino",animalMarService.getAnimalMarino(id));
        return "animal-marino";
    }
}
