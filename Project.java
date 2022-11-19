import java.util.*;

public class Project{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double pie=3.141592653589793238;
        
System.out.print("Use this to calculate the radius, circumference, area, or diameter of a circle.  (type 'C' to continue)");
String input=sc.nextLine();
if(input.compareTo("C")==0){
    System.out.print("What would you like to calculate? (Enter 'radius', 'circumference', 'area', diameter')");
    String input1 = sc.nextLine();
    if(input1.compareTo("area")==0){
        System.out.print("Enter the radius");
        int radius = sc.nextInt();
        System.out.print(pie * radius * radius + "This is your area");
    }
    else if(input1.compareTo("radius")==0){
        System.out.print("Enter the circumference");
        int circumference = sc.nextInt();
        System.out.print(circumference/(2*pie) + " " + "This is your radius");
    }
    else if(input1.compareTo("circumference")==0){
        System.out.print("Enter the radius");
        int radius1= sc.nextInt();
        System.out.print(2*pie*radius1+ " " + "This is your circumference");
    }
    else if(input1.compareTo("diameter")==0){
        System.out.print("Enter the radius");
        int radius3 = sc.nextInt();
        System.out.print(2*radius3 + " " + "This is your radius");
    }
else{
    System.out.println("input is not invalid");
}
}
else{
    System.out.println("input is not invalid");
    System.out.print("Use this to calculate the radius, circumference, area, or diameter of a circle.  (type 'C' to continue)");
    }
}}
