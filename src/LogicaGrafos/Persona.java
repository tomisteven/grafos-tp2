package LogicaGrafos;

import java.util.ArrayList;
import java.util.List;

public class Persona {

	public int idPersona;
	public String nombre;
	private List<Interes> intereses;


	Persona(String nombre, int idPersona, int dI, int eI, int mI, int cI){
		this.nombre = nombre;
		this.idPersona = idPersona;
		this.intereses = new ArrayList<>();
		Interes deportivo = new Interes("Deportivo", dI);
		Interes espectaculo = new Interes("Espectaculo", eI);
		Interes musical = new Interes("Musical", mI);
		Interes ciencia = new Interes("Ciencia", cI);
		this.intereses.add(deportivo);
		this.intereses.add(espectaculo);
		this.intereses.add(musical);
		this.intereses.add(ciencia);

	}

	public void agregarInteres(Interes interes) {
        this.intereses.add(interes);
    }

	public List<Interes> getIntereses() {
        return intereses;
    }

	public String getInfoCompleta() {
		String info = "";
		info += "" + this.nombre + " - ";
		for (Interes interes : this.intereses) {
			info += interes.getValor() + " - " ;
		}
		info += "";
		return info;
	}
}
