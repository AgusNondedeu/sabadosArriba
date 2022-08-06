package edu.it.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Compra {
	@Id
	public String id;
	public String cliente;
	public String autoModelo;
}
