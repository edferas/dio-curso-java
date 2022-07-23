public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();


        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume TV: " + smartTv.volume);


        System.out.println("Canal antes de mudar: " + smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("Canal após mudar: " + smartTv.canal);

        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume TV: " + smartTv.volume);
        


        smartTv.ligar();
            System.out.println("Novo status -> TV ligada? " + smartTv.ligada);

        smartTv.desligar();
            System.out.println("Novo status -> TV ligada? " + smartTv.ligada);
    
    }
}
