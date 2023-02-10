package it.epicode.progetto._02.Progetto_sett_10_02.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import it.epicode.progetto._02.Progetto_sett_10_02.entity.Utente;

public interface UtenteRepo extends JpaRepository<Utente, Integer> {

}
