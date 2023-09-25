package LogicaGrafos;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Grafo {
    private List<Persona> personas;
    private List<Arista> aristas;



   public Grafo() {
        this.personas = new ArrayList<>();
        this.aristas = new ArrayList<>();

   }

    public void construirAristas() {
        for (int i = 0; i < personas.size(); i++) {
            for (int j = i + 1; j < personas.size(); j++) {
                Persona persona1 = personas.get(i);
                Persona persona2 = personas.get(j);
                Arista arista = new Arista(persona1, persona2);
                this.aristas.add(arista);
            }
        }
    }

    public void obtenerAristas() {
    	for (Arista arista : aristas) {
			//imprimir las aristas y personas que estan conectadas
    		System.out.println(arista.getPersona1().nombre + " esta conectado con " + arista.getPersona2().nombre);
		}
    }

    public ArrayList<String> getInfoPersonaCompleta() {
        ArrayList<String> arrayDePersonas = new ArrayList<>();
        for (Persona persona : personas) {
            arrayDePersonas.add(persona.getInfoCompleta());
        }
        return arrayDePersonas;
    }

    public ArrayList<String> getPersonasInArray() {
        ArrayList<String> nombres = new ArrayList<>();
        String info = "";
        for (Persona persona : personas) {
            info += persona.nombre + " tiene los siguientes intereses: \n";
            for (Interes interes : persona.getIntereses()) {
                info += interes.getNombre() + " con valor " + interes.getValor() + "\n" ;
            }
        }
        nombres.add(info);
        return nombres;
    }

    public void crearPersona(String nombre, int idPersona, int dI, int eI, int mI, int cI) {
        Persona persona = new Persona(nombre, idPersona, dI, eI, mI, cI);
        this.personas.add(persona);
    }

}
