package edu.it.services;

import edu.it.model.DatosLlamada;
import edu.it.model.Usuario;

public interface IDiscador {
	DatosLlamada realizarLlamada(Usuario u);
	void emitirMensaje(DatosLlamada datosLlamada);
	void cortar(DatosLlamada datosLlamada);
}
