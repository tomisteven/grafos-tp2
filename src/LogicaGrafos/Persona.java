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
	}

	public void agregarInteres(Interes interes) {
        this.intereses.add(interes);
    }

	public List<Interes> getIntereses() {
        return intereses;
    }




}
