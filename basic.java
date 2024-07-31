import java.net.CacheRequest;
import java.util.Scanner;

/**
 * basic
 */
public class basic {


    public static void Declaration(){   
        // Declaration
        String name = "Amish";
        System.out.println(name);
    }



    public static void TakingInput(){

        Scanner sc = new Scanner(System.in);
        
        /* used when print only one word  */
        // System.out.print("Enter name1 value: ");String name1 = sc.next();
        // System.out.println(name1);

        /* used when print one line  */
        System.out.print("Enter name2 value: ");String name2 = sc.nextLine();
        System.out.println(name2);
    }



    public static void Concatenation(){

        String a1 = "Amish";
        String b1 = "Kumar";

        // concatenation of two string or more 
        String c1 = a1 + " " + b1;
        System.out.println(c1);
    }



    public static void StringLength(){

        String d1 = "Amish Kumar";
        // find any string length we used : .length() function
        System.out.println(d1.length());
    }



    public static void AccessCharofString(){

        String d1 = "Amish Kumar";
        
        // when access any string character value we used : .charAt(i)
        for (int i=0; i<d1.length(); i++){
            System.out.println(d1.charAt(i));
        }
    }



    public static void main(String[] args) {
        // Declaration();

        // TakingInput();

        // Concatenation();

        // StringLength();

        // AccessCharofString();

        /* Given function which you need. */

    }
}