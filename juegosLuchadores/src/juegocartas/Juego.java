
package juegocartas;

import java.util.Random;

public class Juego {
    
    protected Jugador jugador1;
    protected Jugador jugador2;
    protected Random random;

    public Juego(Jugador jugador1, Jugador jugador2) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.random = new Random();
        
        
    }

    public void jugar() {
        // Determinar quién ataca primero con un lanzamiento de dado
        int resultadoDadoJugador1 = lanzarDado();
        int resultadoDadoJugador2 = lanzarDado();

        if (resultadoDadoJugador1 > resultadoDadoJugador2) {
            System.out.println(jugador1.getNombre() + " atacará primero.");
        } else {
            System.out.println(jugador2.getNombre() + " atacará primero.");
            // Intercambiar jugadores para mantener consistencia en el código
            Jugador temp = jugador1;
            jugador1 = jugador2;
            jugador2 = temp;
        }

        // Iniciar los turnos
        for (int turno = 1; turno <= 3; turno++) {
            System.out.println("Turno " + turno + ":");
            System.out.println("--------------");
            realizarAtaque();
            intercambiarJugadores();
        }

        // Determinar al ganador al final del juego
        determinarGanador();
    }

    private void intercambiarJugadores() {
        // Intercambiar jugadores al final de cada turno
        Jugador temp = jugador1;
        jugador1 = jugador2;
        jugador2 = temp;
    }

    private int lanzarDado() {
        return random.nextInt(6) + 1; // Resultado entre 1 y 6
    }

    private void realizarAtaque() {
        Carta cartaAtacante = jugador1.seleccionarCartaAleatoria();
        Carta cartaDefensora = jugador2.seleccionarCartaAleatoria();

        System.out.println(jugador1.getNombre() + " ataca con " + cartaAtacante.getElemento() +
                " y " + jugador2.getNombre() + " defiende con " + cartaDefensora.getElemento() + ".");

        int ataque = cartaAtacante.getFuerza();
        cartaDefensora.recibirAtaque(ataque);

        System.out.println("¡Ataque exitoso! " + jugador2.getNombre() +
                " pierde " + ataque + " puntos de vida.");

        // Mostrar el estado de los jugadores después de cada turno
        mostrarEstado();
    }

    private void mostrarEstado() {
        System.out.println("Estado actual:");
        System.out.println(jugador1);
        System.out.println(jugador2);
        System.out.println();
    }

    private void determinarGanador() {
        System.out.println("Fin del juego. Resultado final:");
        System.out.println(jugador1);
        System.out.println(jugador2);

        int vidaJugador1 = calcularVidaTotal(jugador1);
        int vidaJugador2 = calcularVidaTotal(jugador2);

        if (vidaJugador1 > vidaJugador2) {
            System.out.println(jugador1.getNombre() + " es el ganador.");
        } else if (vidaJugador1 < vidaJugador2) {
            System.out.println(jugador2.getNombre() + " es el ganador.");
        } else {
            System.out.println("¡Es un empate!");
        }
    }

    private int calcularVidaTotal(Jugador jugador) {
        int vidaTotal = 0;
        for (Carta carta : jugador.getMazo()) {
            vidaTotal += carta.getVida();
        }
        return vidaTotal;
    }
        
    
}
