/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modulefive;

/**
 *
 * @author ZQIN
 */
public class DriverEmployee {
    public static void main(String[] args) {

        // Create Hourly Employee
        HourlyEmployee hourlyEmp = new HourlyEmployee(
                "John", "Doe", "123-45-6789", 40, 20.5);

        // Create Salaried Employee
        SalariedEmployee salariedEmp = new SalariedEmployee(
                "Jane", "Smith", "987-65-4321", 80000, 5000);

        // Display info
        System.out.println("=== Hourly Employee ===");
        System.out.println(hourlyEmp);

        System.out.println("\n=== Salaried Employee ===");
        System.out.println(salariedEmp);

        // Modify values
        hourlyEmp.setWorkedHours(45);
        salariedEmp.setStock(7000);

        System.out.println("\n=== After Updates ===");
        System.out.println(hourlyEmp);
        System.out.println(salariedEmp);
    }
}
