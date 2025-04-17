import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] arg){
      Scanner input = new Scanner(System.in);
     /*  System.out.println("Please enter the number and processed .............");
      int weekday=input.nextInt();
       switch (weekday) {
        case 1:
        System.out.println("Today is a Monday"); 
            break;
        case 2:
        System.out.println("Today is a Tuseday");
        break;
        case 3:
        System.out.println("Today is a Wednesday");
        break;
        case 4:
        System.out.println("Today is a Thursday");
        break;
      case 5:
      System.out.println("Today is Friday");
      break;
      case 6:
      System.out.println("Today is Saturday");
      break;
      case 7: 
      System.out.println("Today is a sunday");
      break;
        default:
        System.out.println("You selected a wrong");
            break;
      } 
            */
            


    //Machine start
    System.out.println("Enter the system optional name");
    String name = input.nextLine();
    System.out.println(name);
    String system_option=Character.toUpperCase(name.charAt(0))+name.substring(1);
    switch (system_option) {
        case "Green":
        System.out.println("Start the system");
            break;
            case "Red":
            System.out.println("Stop the system");
            break;
    case"NA":
    System.out.println("System has a pwoer cable issue");
    break;
    case "Yellow":
System.out.println("System has some chip issue");

        
        default:
            break;
    }

        
    }



    }
