public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada ? " + smartTv.ligada);
        System.out.println("Volume atual: " + smartTv.volume);
        System.out.println("Canal atual: " + smartTv.canal);
        

        System.out.println("Canal atual: " + smartTv.canal);

        smartTv.mudarCanal(120);

        System.out.println("Canal atual: " + smartTv.canal); 
       
    }
}
