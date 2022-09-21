public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();
        
        smartTv.volumePadrao();
        smartTv.diminuirVolume();
        smartTv.canalPadrao();
        smartTv.canal = 15;

        System.out.println("Canal Padrão:  " + smartTv.canalPad);

        System.out.println("Canal Atual:  " + smartTv.canal);
        
        System.out.println("TV Ligada?  " + smartTv.ligada);

        System.out.println("Volume Atual:  " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status -> Tv Ligada? "  + smartTv.ligada);

        
    }
}
