public class Usuario {
    public static void main(String[] args) throws Exception {
       SmartTv smartTv = new SmartTv();
       smartTv.mudarCanal(13);

       System.out.println("TV ligada? " + smartTv.ligada);
       System.out.println("Canal Atual : " + smartTv.canal);
       System.out.println("Volume atual : " + smartTv.volume);
       

    smartTv.ligar ();
    System.out.println("TV ligada? " + smartTv.ligada);
    }
    
}
