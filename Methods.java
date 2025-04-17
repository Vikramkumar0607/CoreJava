public class Methods {
     public static void main(String arg[]){
        Computer c = new Computer();
       c.playMusic();
      String str= c.getMePen(11);
      System.out.println(str);
     }
}

class Computer{
    public  void playMusic(){
        System.out.println("Play the computer Music");
       

     }
     public String getMePen(int cost){
          
        if(cost >10) {
 return("Pen cost " + cost);
        }  else {
            return ("Pen cost is a " +cost);
        }

     }
     
    }




