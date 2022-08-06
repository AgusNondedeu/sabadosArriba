package edu.it.repository;

import org.mockito.Mockito;

import edu.it.dto.CompraDTO;

public class GrabadorDeCompraSQL_O_JSON implements GrabadorDeCompra {
	private GrabadorDeCompra paraSQL;
	private GrabadorDeCompra paraJSON;
	
	public static GrabadorDeCompraSQL_O_JSON build() {
		return new GrabadorDeCompraSQL_O_JSON(); 
	}
	
	private GrabadorDeCompraSQL_O_JSON() {
		// paraSQL = Mockito.mock(GrabadorDeCompra.class);
		// paraJSON = Mockito.mock(GrabadorDeCompra.class);
	}
	
	public GrabadorDeCompraSQL_O_JSON agregarGrabadorSQL(GrabadorDeCompra g) {
		this.paraSQL = g;
		return this;
	}
	
	public GrabadorDeCompraSQL_O_JSON agregarGrabadorJSON(GrabadorDeCompra g) {
		this.paraJSON = g;
		return this;
	}

	@Override
	public void grabar(CompraDTO compra) {
		try {
			paraSQL.grabar(compra);
		}
		catch (Exception ex) {
			paraJSON.grabar(compra);
		}
	}
}
