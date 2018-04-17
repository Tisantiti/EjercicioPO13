package datos;

public abstract class Pisos {
	private String direccion;
	private int metrosCuadrados;
	private String descripcion;
	private int precioMetroC;
	
	public Pisos(String direccion, int metrosCuadrados, String descripcion, int precioMetroC) {
		super();
		this.direccion = direccion;
		this.metrosCuadrados = metrosCuadrados;
		this.descripcion = descripcion;
		this.precioMetroC = precioMetroC;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getMetrosCuadrados() {
		return metrosCuadrados;
	}

	public void setMetrosCuadrados(int metrosCuadrados) {
		this.metrosCuadrados = metrosCuadrados;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getPrecioMetroC() {
		return precioMetroC;
	}

	public void setPrecioMetroC(int precioMetroC) {
		this.precioMetroC = precioMetroC;
	}
	
	//Un método que calcule el precio de la vivienda, 
	//si es de protección oficial será el precio 
	//por metro cuadrado por los metros del piso aplicándole 
	//el porcentaje rebajado. En el caso de viviendas libres, 
	//se calcula en función del precio por los metros cuadrados y sumándole el interés.
	
	public abstract double precioVivienda();
	public abstract double beneficioInmoviliaria();

	
}
