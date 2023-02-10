package it.epicode.progetto._02.Progetto_sett_10_02.entity;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.context.annotation.Scope;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "postazioni")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Scope("prototype")
@Builder
public class Postazione {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	
	@Enumerated(EnumType.STRING)
	private TipoPostazione tipo;
	
	private int maxOccupanti;
	
	@ManyToOne
	@JoinColumn(name = "edificio_id")
	private Edificio edificio;
	
	@ManyToOne
	@JoinColumn(name = "postazione")
	private Set<Prenotazione> prenotazioni;
	private boolean isLibero;
	
	
	

}
