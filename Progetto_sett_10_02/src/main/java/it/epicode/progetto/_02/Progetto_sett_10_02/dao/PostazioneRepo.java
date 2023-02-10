package it.epicode.progetto._02.Progetto_sett_10_02.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.epicode.progetto._02.Progetto_sett_10_02.entity.Postazione;

@Repository
public interface PostazioneRepo extends JpaRepository<Postazione, Integer> {

}
