package Entidades;

public abstract class Pez extends Animal{
	
	protected TipoAgua tipoAgua;

	
	//Sobrescribimos el metodo comer y lo implementamos.
	@Override
	public void comer(Object comida) {

		switch (tama�o) {
		case PEQUE�O://Al no poner un brak se ejecutara el siguiente caso
		case MEDIANO://por lo que los casos PEUQE�O Y MEDIANO tendran la misma onpcion.
			if(comida instanceof Placton){
				//"instanceof" devuelve de forma booleana si la comida es Placton
				System.out.println("Soy el pez "+nombre+" y voy a comer placton.");
			}else{
				System.out.println("Como pez "+tama�o+" solo como placton.");
			}
			break;
		case GRANDE:
			if(comida instanceof Pez){
				// ""Casteamos"" los atributos de comida a Pez para poder usarlos como una entidad
				//ya que no tenemos acceso a traves del m�todo a sus atributos.
				Pez pezComida =(Pez)comida;
				System.out.println("Soy el pez "+nombre+"y voy a comeme al pez "+pezComida.nombre+".");
			}else{
				System.out.println("Como pez "+tama�o+" solo como peces.");
			}
			break;
		}
	}


	@Override
	public String toString() {
		return "Pez [tipoAgua=" + tipoAgua + ", peso=" + peso + ", tama�o=" + tama�o + ", nombre=" + nombre + "]";
	}
	
	
}
