import java.util.Scanner;

public class SmartTv {
   Scanner sc = new Scanner (System.in);
    boolean ligada = false;
    int canal, volume;
    

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

    public void aumentarCanal() {
        canal++;
    }

    public void diminuirCanal() {
        canal--;
    }

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        desligada = false;
    }

    public void aumentarVolume() {
        volume++;
    }

    public void diminuirVolume() {
        volume--;
    }
}
