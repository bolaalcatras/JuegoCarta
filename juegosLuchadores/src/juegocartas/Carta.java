
package juegocartas;

public class Carta {
    
    protected String elemento;
    protected int vida;
    protected int defensa;
    protected int fuerza;

    public Carta(String elemento, int fuerza) {
        this.elemento = elemento;
        this.vida = 1000;
        this.defensa = 200;
        this.fuerza = fuerza;
    }

    public String getElemento() {
        return elemento;
    }

    public int getVida() {
        return vida;
    }

    public int getDefensa() {
        return defensa;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void recibirAtaque(int ataque) {
        int dano = Math.max(0, ataque - defensa);
        vida = Math.max(0, vida - dano);
    }

    @Override
    public String toString() {
        return elemento + " - Vida: " + vida + ", Defensa: " + defensa;
    }

}
   
    

