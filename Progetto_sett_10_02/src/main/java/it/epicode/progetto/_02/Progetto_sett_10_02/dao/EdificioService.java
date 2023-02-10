package it.epicode.progetto._02.Progetto_sett_10_02.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.epicode.progetto._02.Progetto_sett_10_02.entity.Edificio;

@Service
public class EdificioService {
	
	@Autowired
    private EdificioRepo edificioRepo;

    public void insertEdificio(Edificio e) {
        edificioRepo.save(e);
        System.out.println("Edificio inserito correttamente!");
    }
    
    public Optional<Edificio> getById(int id) {
		return edificioRepo.findById(id);
	}

}
