package datos;

public class Libres extends Pisos {
	
	private int tipoInteres;
	
	public Libres(String direccion, int metrosCuadrados, String descripcion, int precioMetroC, int tipoInteres) {
		super(direccion, metrosCuadrados, descripcion, precioMetroC);
		this.tipoInteres = tipoInteres;
	}

	@Override
	public double precioVivienda() {
		
		return getPrecioMetroC() * (getMetrosCuadrados()*2) + (getPrecioMetroC() * (getMetrosCuadrados()*2) * tipoInteres / 100);
	}

	@Override
	public double beneficioInmoviliaria() {
		double total = precioVivienda();
		return (total * tipoInteres / 100);
	}

}
