
public class PruebaJuego {

    public static void main(String[] args) {

        Carta cartas[] = new Carta[10];
        Carta mazoJugador1[] = new Carta[5];
        Carta mazoJugador2[] = new Carta[5];

        Carta cartaA = new Carta(500, 900, 3, 1, 2, 2, 0,2);
        Carta cartaB = new Carta(400, 800, 1, 4, 1, 3, 4,1);
        Carta cartaC = new Carta(900, 400, 2, 1, 2, 5, 2,4);
        Carta cartaD = new Carta(700, 800, 3, 2, 3, 4, 3,3);
        Carta cartaE = new Carta(800, 700, 2, 1, 2, 4, 2,5);
        Carta cartaF = new Carta(300, 900, 1, 4, 2, 3, 5,1);
        Carta cartaG = new Carta(500, 600, 3, 3, 3, 4, 2,4);
        Carta cartaH = new Carta(800, 700, 3, 4, 2, 1, 3,3);
        Carta cartaI = new Carta(700, 1000, 1, 1, 1, 2, 1,2);
        Carta cartaJ = new Carta(600, 700, 5, 1, 3, 1, 2,1);

         int mazoGeneral[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = mazoGeneral.length - 1; i > 0; i--) {
            int x = (int) Math.floor(Math.random() * (i + 1));
            int tempora = mazoGeneral[i];
            mazoGeneral[i] = mazoGeneral[x];
            mazoGeneral[x] = tempora;
        }

        for (int i = 0; i < mazoGeneral.length; i++) {
            cartas[i] = obtenerCartaSegunIndice(mazoGeneral[i]);
        }

        System.out.println("MAZO JUGADOR 1");
        for (int k = 0; k < mazoJugador1.length; k++) {
            mazoJugador1[k] = cartas[k];
            System.out.println(mazoJugador1[k]);
        }

        System.out.println("\nMAZO JUGADOR 2");
        for (int i = 0; i < mazoJugador2.length; i++) {
            mazoJugador2[i] = cartas[i + 5];
            System.out.println(mazoJugador2[i]);
        }

        // Ataque por índice
        int indiceAtaque = 0;
        System.out.println("\natacando con indice " + indiceAtaque);
        mazoJugador1[indiceAtaque].ataqueEspecial(mazoJugador2[indiceAtaque]);

        // Mostrar resultados
        System.out.println("\nRESULTADOS");
        int sumaDefJugador1 = sumarDefensaMazo(mazoJugador1);
        int sumaDefJugador2 = sumarDefensaMazo(mazoJugador2);

        System.out.println("Suma de DEF del Jugador 1: " + sumaDefJugador1);
        System.out.println("Suma de DEF del Jugador 2: " + sumaDefJugador2);

        if (sumaDefJugador1 > sumaDefJugador2) {
            System.out.println("Jugador 1 gana");
        } else if (sumaDefJugador1 < sumaDefJugador2) {
            System.out.println("Jugador 2 gana");
        } else {
            System.out.println("Empate");
        }
    }

    private static Carta obtenerCartaSegunIndice(int indice) {
        switch (indice) {
            case 0:
                return new Carta(500, 900, 3, 1, 2, 2, 4,2);
            case 1:
                return new Carta(400, 800, 1, 4, 1, 3, 1,1);
            case 2:
                return new Carta(900, 400, 2, 1, 2, 5, 2,4);
            case 3:
                return new Carta(700, 800, 3, 2, 3, 4, 3,3);
            case 4:
                return new Carta(800, 700, 2, 1, 2, 4, 2,5);
            case 5:
                return new Carta(300, 900, 1, 4, 2, 3, 5,1);
            case 6:
                return new Carta(500, 600, 3, 3, 3, 4, 2,4);
            case 7:
                return new Carta(800, 700, 3, 4, 2, 1, 3,3);
            case 8:
                return new Carta(700, 1000, 1, 1, 1, 2, 1,2);
            case 9:
                return new Carta(600, 700, 5, 1, 3, 1, 2,1);
            default:
                return null;
        }
    }

    private static int sumarDefensaMazo(Carta[] mazo) {
        int sumaDef = 0;
        for (Carta carta : mazo) {
            sumaDef += carta.getDef();
        }
        return sumaDef;
    }
}