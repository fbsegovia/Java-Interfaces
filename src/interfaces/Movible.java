package interfaces;

/*un interfaz es una coleccion de metodos abtractos*/
public interface Movible {

	/*Los atributos en las interfaces son siempre constantes*/
	/*es decir, son public y final*/
	int CONSTANTE =0;
	
	/*No importa que no lo declaremos p�blico
	los m�todos de una interface siempre son publicos*/
	public void moverseLento();
	void moverserRapido();
}
