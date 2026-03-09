/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package modulefour;

/**
 *
 * @author zqin
 */
import others.StudentOne;

public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String personName;
        StudentOne person = new StudentOne();
        //Student person= new Student("Jerry","Qin");
        person.setName( "Jerry Qin" );
       
        personName = person.getName();
        System.out.println("Driver name: "+personName);

    }
    
}
