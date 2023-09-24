package LogicaGrafos;

public class Arista {
    private Persona persona1;
    private Persona persona2;
    private int peso;

    public Arista(Persona persona1, Persona persona2) {
        this.persona1 = persona1;
        this.persona2 = persona2;
        this.peso = calcularSimilaridad(persona1, persona2);
    }

    public int getPeso() {
        return peso;
    }

    public Persona getPersona1() {
        return persona1;
    }

    public Persona getPersona2() {
        return persona2;
    }

    private int calcularSimilaridad(Persona p1, Persona p2) {
        // Implementa la fórmula de similaridad aquí
        // similaridad(i, j) = |di − dj | + |mi − mj | + |ei − ej | + |ci − cj |
        // ...

        return 0; // Reemplaza con la fórmula real
    }
}
