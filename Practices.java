// Question 1 write a program to sum three number in java

// public class Practiceset{
//     public static void main(String args[]){
//         int val1=5;
//         int val2=9;
//         int val3=6;
//         int sum = (val1+ val2+ val3);
//         System.out.println(sum);
//     }

// }

// Question-2 : Write a program to calculate cgpa using marks of three subject (out of 100) 

// public class Practiceset{
//     public static void main(String args[]){
//         int subject1 =78;
//         int subject2=80;
//         int subject3=99;
//         int cgpa=(subject1+subject2+subject3)/30;
//         System.out.println(cgpa);
//     }
// }

// question-3:Write a  java program which ask the user to center her/his name and greet them with "hello <name> ,have a good day"text

// import java.util.Scanner;

// public class Practiceset{
//     public static void main(String args[]){
//         System.out.print("what is your name");
//         Scanner sc =new Scanner(System.in);
//         String name =sc.next();
//         System.out.println("hello"+ name +" have a good day");

//     }
// }

// question-4: Write a java program to conver kilometer to miles

// public class Practicesset{
//     public static void main(String args[]){
//         fl
//     }

// }

// Question-5: Write a program to select a whether a number
//  entered by the user is integer or not.
// import java.util.Scanner;

// public class Practiceset{
//     public static void main(String args[]){
//         System.out.println("enter the any number:");
//         Scanner sc = new Scanner(System.in);
//         System.out.println(sc.hasNextInt());
//     }
// }


//write a program to calculate percentage of a given student in cbsc board
//his marks from 5 subject must be taken as input from the keyboard (marks are out of 100).
 import java.util.Scanner;
public class Practices{

    public static void main(String args[]){
        Scanner scan =new Scanner(System.in);
        System.out.println("enter your math marks");
        int math= scan.nextInt();
        System.out.println("enter your physics marks:");
        int physics=scan.nextInt();
        System.out.println("enter your english marks:");
        int english=scan.nextInt();
        System.out.println("enter your bio marks:");
        int bio=scan.nextInt();
        System.out.println("enter your hindi marks:");
        int hindi=scan.nextInt();
        float percentage=((math+physics+english+bio+hindi)/500.0f)*100;
        System.out.println("percentage:");
        System.out.println(percentage);

    }
}