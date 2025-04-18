

public class MethodOverLoad {
     public static void  main (String arg []){
Calcutor cal = new Calcutor();
String result = cal.add(5,7,"name");
System.out.println(result);


     }
}

class Calcutor{

    //Method overloading is method name same but parements are different.
    
        public int add(int x , int y, int z ){
     return x+y+z;
    
        }
        public int add (int x, int y){
            return x+y;
        }

        public String add (int x, int y , String z){
        
 return String.valueOf(x+y) +  z;
 t

        }
    }



