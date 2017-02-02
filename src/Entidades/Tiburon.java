package Entidades;

public class Tiburon extends Pez{

	public Tiburon(){
		tama�o = Tama�o.GRANDE;
		tipoAgua = TipoAgua.SALADA;
	}

	@Override
	public void comer(Object comida) {
		if(comida instanceof Animal){
			Animal comidaAnimal = (Animal)comida;
			System.out.println("Soy el tiburon "+nombre+
					" y me voy a comer al Animal "+comidaAnimal.nombre+".");
		}else{
			System.out.println("Los tiburones solo comemos animales.");
		}
	}
	
	
	
}
