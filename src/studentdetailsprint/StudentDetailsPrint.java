/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentdetailsprint;

/**
 *
 * @author shena
 */
import java.util.Scanner;
// change wednesday
public class StudentDetailsPrint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // array of object declaration
        Student[] list = new Student[3];
        Scanner in = new Scanner(System.in);
         for(int i=0; i<list.length;i++)//3 times
         {  System.out.println("Enter Details:");
             String n = in.next();
           int a = in.nextInt();
          Student s1 = new Student(n,a);
          list[i]=s1;
         }
         //read the data in the array object list
         for(int i =0; i< list.length ; i++){
            System.out.println(list[i].getName() + " " + list[i].getAge());
         }
        
    }
    
}
