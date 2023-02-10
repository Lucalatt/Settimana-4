package it.epicode.progetto._02.Progetto_sett_10_02.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.epicode.progetto._02.Progetto_sett_10_02.entity.Utente;

@Service
public class UtenteService {
	@Autowired
    private UtenteRepo utenteRepo;

    public void insertUtente(Utente u) {
        utenteRepo.save(u);
        System.out.println("Utente inserito correttamente!");
    }
    
    public Optional<Utente> getById(int id) {
		return utenteRepo.findById(id);
	}

}