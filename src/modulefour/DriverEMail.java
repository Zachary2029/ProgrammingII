/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modulefour;

/**
 *
 * @author ZQIN
 */
public class DriverEMail {
    public static void main(String[] args) {
        String[] emailAddresses = new String[5];
        emailAddresses[0] = "aab@gmail.com";
        emailAddresses[1] = "dcf@gmail.com";
        emailAddresses[2] = "lkjh@gmail.com";
        emailAddresses[3] = "ert@gmail.com";
        emailAddresses[4] = "asde@gmail.com";
        String[] emailAdd = {"he@yahoo.com", "bill@yahoo.com"};
        EMail e1 = new EMail("Bob", new Date(02, 03, 2004), "Hello",
        emailAddresses);
        EMail e2 = new EMail("Bob", new Date(10, 23, 2021), "Hello",
        emailAdd);
        EMail e3 = new EMail("Bob", new Date(07, 15, 2014), "Hello",
        emailAddresses);
        System.out.println(e1+"\n");
        System.out.println(e2+"\n");
        System.out.println(e3+"\n");
          
    } 
}
