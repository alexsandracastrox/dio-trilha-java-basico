    public class SmartTv {

    static boolean ligada=false;
    static int canal=1;
    static int volume = 25;

    public void mudarCanal(int novoCanaL){
    canal = novoCanaL;   
    
   }
    
   public void aumentarCanal(){
    canal++;
}
    public void diminuirCanal(){
        canal--;
    }

    public void aumentarVolume(){

    volume++;
    System.out.println("Aumentando o volume para:" + volume);

    //volume = volume + 1;
    }
    public void diminuirVolume(){

    volume--;
    System.out.println("Diminuindo o volume para:" + volume);
    }


    
    public static void ligar (){

    ligada=true;
}
    public static void desligar(){
    ligada=false;


}
    
}
