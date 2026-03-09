/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modulefour;

/**
 *
 * @author zqin
 */
public class Student {
    private String studentName;
    
    public Student(){
        studentName="";
    }
    
       public Student(String firstName, String lastName){
        studentName= firstName+" "+lastName;
    }
    
    public Student(String firstName, String middleName, String lastName){
        studentName= firstName+" "+middleName+" "+lastName;
    }
    
    

    public void setName( String name )
    {
       studentName = name;
    }

    public String getName()
    {
       return studentName;
    }
  
}
