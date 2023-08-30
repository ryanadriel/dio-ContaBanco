public class User {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

    System.out.println("TV ligada? " + smartTv.on);

    smartTv.online();
        System.out.println("Novo Status -> TV ligada? " + smartTv.on);

    System.out.println("Canal atual: " + smartTv.chanel);
    
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
            System.out.println("Volume: " + smartTv.volum);

        smartTv.switchCanal(9);
            System.out.println("troca de canal para: " + smartTv.chanel);

        System.out.println("Canal atual: " + smartTv.chanel);

        smartTv.offline();
            System.out.println("Novo Status -> TV ligada? " + smartTv.on);

    }
}
