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

    // Resto de métodos (como obtener aristas, etc.)
}
