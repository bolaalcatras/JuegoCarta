
package juegocartas;

import java.util.Random;

public class Jugador {
    
    protected String nombre;
    protected Carta[] mazo;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.mazo = new Carta[5];
        inicializarMazo();
    }

    private void inicializarMazo() {
        mazo[0] = new Carta("Rayo", 300);
        mazo[1] = new Carta("Fuego", 200);
        mazo[2] = new Carta("Agua", 250);
        mazo[3] = new Carta("Tierra", 180);
        mazo[4] = new Carta("Viento", 220);
    }

    public Carta[] getMazo() {
        return mazo;
    }

    public String getNombre() {
        return nombre;
    }

    public Carta seleccionarCartaAleatoria() {
        return mazo[new Random().nextInt(5)];
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(nombre).append(":\n");
        for (Carta carta : mazo) {
            stringBuilder.append("   ").append(carta).append("\n");
        }
        return stringBuilder.toString();
    }

}

    
    