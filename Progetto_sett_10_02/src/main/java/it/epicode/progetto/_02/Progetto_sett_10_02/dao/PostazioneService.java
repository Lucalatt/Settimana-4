package it.epicode.progetto._02.Progetto_sett_10_02.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.epicode.progetto._02.Progetto_sett_10_02.entity.Postazione;
import it.epicode.progetto._02.Progetto_sett_10_02.entity.Edificio;
import it.epicode.progetto._02.Progetto_sett_10_02.entity.TipoPostazione;

@Service
public class PostazioneService {
	
	@Autowired
    private PostazioneRepo postazioneRepo;

    public void insertPostazione(Postazione pos) {
        postazioneRepo.save(pos);
        System.out.println("Postazione inserita correttamente!");
    }

    public List<Postazione> getAllPostazioni() {
		return postazioneRepo.getAll();
	}
    public List<Postazione> getFromTipoAndCitta(String tipo, String citta) {
    	return postazioneRepo.findByTipoPostazioneAndCittà(tipo, citta);
    }
    
    public Optional<Postazione> getById(int id) {
		return postazioneRepo.findById(id);
	}
    
    public List<Postazione> getByTipo(String tipo) {
    	return postazioneRepo.findByTipoPostazione(tipo);
    }
    public List<Postazione> getByCitta(String citta) {
    	return postazioneRepo.findByCittaPostazione(citta);
    }
    
}
