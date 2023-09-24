package LogicaGrafos;

import java.util.ArrayList;
import java.util.List;

public class Grafo {
    private List<Persona> personas;
    private List<Arista> aristas;

    public Grafo() {
        this.personas = new ArrayList<>();
        this.aristas = new ArrayList<>();

    }

    public void agregarPersona(Persona persona) {
       this.personas.add(persona);
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
//    public List<Arista> getAristas() {
//        return aristas;
//    }

    public void obtenerAristas() {
    	for (Arista arista : aristas) {
			//imprimir las aristas y personas que estan conectadas
    		System.out.println(arista.getPersona1().nombre + " esta conectado con " + arista.getPersona2().nombre);
		}
    }


    public static void main(String[] args) {
		Grafo g = new Grafo();
        Persona p1 = new Persona("Juan", 20, 1, 1, 1, 1);
        Persona p2 = new Persona("Maria", 30, 1, 1, 1, 1);
        Persona p3 = new Persona("Pedro", 40, 1, 1, 1, 1);
        Persona p4 = new Persona("Luis", 50, 1, 1, 1, 1);
        Persona p5 = new Persona("Ana", 60, 1, 1, 1, 1);

        g.agregarPersona(p1);
        g.agregarPersona(p2);
        g.agregarPersona(p3);
        g.agregarPersona(p4);
        g.agregarPersona(p5);


        g.construirAristas();

        g.obtenerAristas();

	}
}
