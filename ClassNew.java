public class ClassNew {
     public static void main(String[] arg) {
        int n1=6 ;
        int n2 =8;
        Calcutor cal = new Calcutor();  
        cal.add(n1, n2);
 //System.out.println(result);


     }
}
class Calcutor {
    public  int add (int x , int y){
        int r =x+y;
        System.out.println(r);
        return r;

    }

}