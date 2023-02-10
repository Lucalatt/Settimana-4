package it.epicode.progetto._02.Progetto_sett_10_02.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import it.epicode.progetto._02.Progetto_sett_10_02.entity.Prenotazione;
import it.epicode.progetto._02.Progetto_sett_10_02.entity.Utente;

@Configuration
@PropertySource("classpath:application.properties")
public class PrenotazioneConfig {

	@Bean
	public Prenotazione p() {
		Prenotazione p = new Prenotazione();
		return p;
	}

}
