import java.util.*;

import javax.xml.stream.events.EndDocument;

public class Project{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
System.out.print("Use this to calculate the radius, circumference, area, or diameter of a circle.  (type 'C' to continue)");
String input=sc.nextLine();
if(input=="C"){
    System.out.print("What would you like to calculate? (Enter 'radius', 'circumference', 'area', diameter')");
}
else{
    System.out.println("input is invalid");
    System.out.print("What would you like to calculate? (Enter 'radius', 'circumference', 'area', diameter')");
}
    }
}  