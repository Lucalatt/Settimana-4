package it.epicode.progetto._02.Progetto_sett_10_02.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import it.epicode.progetto._02.Progetto_sett_10_02.entity.Utente;


@Configuration
@PropertySource("classpath:application.properties")
public class UtenteConfig {
	
	@Bean
    public Utente u() {
        Utente u = new Utente();
        return u;
    }

}
