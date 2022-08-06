package nicolas.components;

import nicolas.dto.Compra;

public class GrabadorDeCompraSQL implements GrabadorDeCompra {
	@Override
	public void grabar(Compra compra) {
		String sql ="insert into compra(cliente,modelo) values (" +compra.cliente + "'," + compra.autoModelo+ "')";
		System.out.println("Grabando SQL...");
		System.out.println(sql);
	}
	
}
