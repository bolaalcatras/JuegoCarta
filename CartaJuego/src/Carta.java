
    public class Carta {
    
    private int def;
    private int atk;
    private int fuego;
    private int viento;
    private int rayo;
    private int tierra;
    private int agua;
    private int poderEspecial;

    public Carta() {
    }

    public Carta(int def, int atk, int fuego, int viento, int rayo, int tierra, int agua, int poderEspecial) {
        this.def = def;
        this.atk = atk;
        this.fuego = fuego;
        this.viento = viento;
        this.rayo = rayo;
        this.tierra = tierra;
        this.agua = agua;
        this.poderEspecial = poderEspecial;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getFuego() {
        return fuego;
    }

    public void setFuego(int fuego) {
        this.fuego = fuego;
    }

    public int getViento() {
        return viento;
    }

    public void setViento(int viento) {
        this.viento = viento;
    }

    public int getRayo() {
        return rayo;
    }

    public void setRayo(int rayo) {
        this.rayo = rayo;
    }

    public int getTierra() {
        return tierra;
    }

    public void setTierra(int tierra) {
        this.tierra = tierra;
    }

    public int getAgua() {
        return agua;
    }

    public void setAgua(int agua) {
        this.agua = agua;
    }

    public int getPoderEspecial() {
        return poderEspecial;
    }

    public void setPoderEspecial(int poderEspecial) {
        this.poderEspecial = poderEspecial;
    }

    @Override
    public String toString() {
        return "    Carta    \nDef: " + def + "\nAtk: " + atk + "\n    PODERES    " +
               "\nFuego: " + fuego + "\nViento: " + viento + "\nRayo: " + rayo +
               "\nTierra: " + tierra + "\nAgua: " + agua + "\nPoder Especial: " + poderEspecial;
    }

    public void ataqueEspecial(Carta jugador2) {
        int poderJugador1 = this.poderEspecial + this.agua + this.fuego + this.viento + this.tierra;
        int poderJugador2 = jugador2.getPoderEspecial() + jugador2.getAgua() + jugador2.getFuego() +
                            jugador2.getViento() + jugador2.getTierra();

        if (poderJugador1 > poderJugador2) {
            System.out.println("ataque Especial exitoso Jugador 1 gana el ataque.");
            jugador2.setDef(Math.max(0, jugador2.getDef() - this.atk));
            System.out.println("Vida restante del Jugador 2: " + jugador2.getDef());
        } else if (poderJugador1 < poderJugador2) {
            System.out.println("ataque Especial exitoso Jugador 2 gana el ataque.");
            this.setDef(Math.max(0, this.getDef() - jugador2.getAtk()));
            System.out.println("vida restante del Jugador 1: " + this.getDef());
        } else {
            System.out.println("el Ataque Especial termina en empate.");
        }
    }
}
  
