public class ForLoop {
public static void main(String[] arg){

    for(int i=0; i <10; i++){
System.out.println("Hi");
    }

    //Reverse number 
    for(int x =5; x >=0;x--){

        System.out.println(x);
    }
      
    for(int d =1 ; d <=5 ; d ++){
              System.out.println("Day :      " + d);
              for(int y =9 ; y <=17 ; y++){
System.out.println(" "  + y  + "  - " + (y+1));
              }

    }

    int a =3, b=6;
    int result =(~a &b) |  (a & ~b);

    System.out.println(result);

    int x = 5;

int y = 10;

int z = (x++ > 5 && y-- < 10) ? x-- : y;
System.out.println(x);
System.out.println(y);
}










}
