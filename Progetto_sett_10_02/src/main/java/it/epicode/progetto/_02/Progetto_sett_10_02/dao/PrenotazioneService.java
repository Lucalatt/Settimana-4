package it.epicode.progetto._02.Progetto_sett_10_02.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.epicode.progetto._02.Progetto_sett_10_02.entity.Prenotazione;

@Service
public class PrenotazioneService {
	
	@Autowired
    private PrenotazioneRepo prenotazioneRepo;

    public void insertPrenotazione(Prenotazione pre) {
        prenotazioneRepo.save(pre);
        System.out.println("Prenotazione inserita correttamente!");
    }

}
