public class Usuario {

    public static void main(String[] args) throws Exception {
        
        // Cria uma nova instância de SmartTv
        SmartTv smartTv = new SmartTv();

        // Exibe o status inicial da TV
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume Atual :" +smartTv.volume);

        // Exibe o status inicial da TV
        System.out.println("Canal atual : " + smartTv.canal);


        System.out.println("TV Ligada? : " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

        //Muda o Canal
        smartTv.mudarCanal(10);
        System.out.println("Canal atual : " + smartTv.canal);
        

        // Liga a TV
        smartTv.ligar();
        System.out.println("Novo Status -> TV Ligada? : " + smartTv.ligada);
        
        // DesLiga a TV

        smartTv.desligar();
        System.out.println("Novo Status -> TV Ligada? : " + smartTv.ligada);
    } 
}
