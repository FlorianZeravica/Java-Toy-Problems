import java.util.Scanner;
 
public class Main {
     
    public static void main(String argsp[]) {
     
        String userInput;
        Scanner s = new Scanner(System.in);
        System.out.print("Bitte eine ganze Zahl eingeben: ");
         
        do {
            userInput = String.valueOf(s.next());
            if(tryParseInt(userInput)) {
                int userNumber = Integer.parseInt(userInput);
                 
                for(int teiler = 1; teiler <= userNumber; teiler ++) {
                         
                    if(userNumber % teiler == 0) {
                    System.out.println(teiler);
                    }
                }
            }
            else {
                System.out.print("Dies ist keine ganze Zahl, bitte eine ganze Zahl eingeben: ");
            }
        } while(!tryParseInt(userInput));
        s.close();
    }           
     
    static boolean tryParseInt(String userInput) {  
         try {
             Integer.parseInt(userInput);  
             return true;  
         } catch (NumberFormatException e) {             
             return false;
         }
    }
}