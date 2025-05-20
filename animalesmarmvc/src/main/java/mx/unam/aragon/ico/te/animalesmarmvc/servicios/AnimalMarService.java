package mx.unam.aragon.ico.te.animalesmarmvc.servicios;

import mx.unam.aragon.ico.te.animalesmarmvc.modelos.AnimalMarino;
import mx.unam.aragon.ico.te.animalesmarmvc.repositorios.AnimalMarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnimalMarService {
    @Autowired
    private AnimalMarRepository animalMarRepository;

    public boolean guardarAnimalMarino(AnimalMarino animalMarino){
        AnimalMarino result = animalMarRepository.save(animalMarino);
        return result != null;
    }

    public AnimalMarino getAnimalMarino(Integer id){
        return animalMarRepository.getById(id);
    }
}
