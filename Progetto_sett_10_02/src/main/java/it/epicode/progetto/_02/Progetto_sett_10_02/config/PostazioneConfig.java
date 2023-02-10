package it.epicode.progetto._02.Progetto_sett_10_02.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import it.epicode.progetto._02.Progetto_sett_10_02.entity.Edificio;
import it.epicode.progetto._02.Progetto_sett_10_02.entity.Postazione;
import it.epicode.progetto._02.Progetto_sett_10_02.entity.TipoPostazione;


@Configuration
@PropertySource("classpath:application.properties")
public class PostazioneConfig {
	@Bean
    public Postazione pos() {
		Postazione pos = new Postazione();
        return pos;
    }
}
