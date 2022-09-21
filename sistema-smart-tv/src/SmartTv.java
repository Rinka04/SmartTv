import java.util.Scanner;

public class SmartTv {
    Scanner sc = new Scanner(System.in);
    boolean ligada = false;
    int canal, volume, canalPad;
    
    public void mudarCanal() {
        canal = 0;
    }

    public void canalPadrao(){
        canalPad = 7;
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

    public void volumePadrao() {
        volume = 10;

    }

    public void aumentarVolume() {
        volume++;
    }

    public void diminuirVolume() {
        volume--;
    }

}
