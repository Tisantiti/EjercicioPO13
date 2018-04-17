package datos;

public class ProteccionOficial extends Pisos {
	
	private String entidad;
	private int rebaja;
	
	public ProteccionOficial(String direccion, int metrosCuadrados, String descripcion, int precioMetroC, String entidad, int rebaja) {
		super(direccion, metrosCuadrados, descripcion, precioMetroC);
		this.entidad = entidad;
		this.rebaja = rebaja;
	}

	@Override
	public double precioVivienda() {
		
		return getPrecioMetroC() * (getMetrosCuadrados()*2) -((getMetrosCuadrados()*2) * rebaja / 100);
	}

	@Override
	public double beneficioInmoviliaria() {
		double total = precioVivienda();
		if(entidad.equalsIgnoreCase("pública")) 
			return (total * 0 / 100);
		else if(entidad.equalsIgnoreCase("privada"))
			return (total * 10 / 100);
		
		return 0;
	}

}
