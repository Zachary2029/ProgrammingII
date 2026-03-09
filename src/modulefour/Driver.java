/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package modulefour;

/**
 *
 * @author zqin
 */
import others.StudentOne; //if you want to use StudentOne class in package "others"

public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String personName;
        Student person = new Student(); //first constructor
        person.setName( "Jerry Qin" );
        //Student person= new Student("Jerry","Qin");  // second constructor; no need setName method
        //Student person= new Student("Jerry","Adam","Qin"); //third constructor; no need setName method
       
        personName = person.getName();
        System.out.println("Driver name: "+personName);

    }
    
}
