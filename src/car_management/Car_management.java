package car_management;

import java.util.Scanner;

class function {

    Scanner object = new Scanner(System.in);
    String choice;
    String carName;
    String carModel;
    String carBrand;
    String carcolor;
    String engineCapacity;
    String country;

    void importCar() {
        System.out.println("<== Enter Details For Importing ==>");
        System.out.print("Enter Your Car Name : ");
        carName = object.nextLine();
        System.out.print("Enter Your Car Model : ");
        carModel = object.nextLine();
        System.out.print("Enter Your Car Brand : ");
        carBrand = object.nextLine();
        System.out.print("Enter Your Car Color : ");
        carcolor = object.nextLine();
        System.out.print("Enter Engine Capacity : ");
        engineCapacity = object.nextLine();
        System.out.print("Enter Country Name : ");
        country = object.nextLine();
        System.out.println("Your " + carName + " will imported from pakistan to " + country);
    }

    void mainMenu() {

        System.out.println("<= Welcome To Car Import & Export Management System =>");
        System.out.println("1) Import A Car");
        System.out.println("2) Export A Car");
        System.out.println("3) Show Record");
        System.out.println("4) Custom Duty Charges");
        System.out.print("Enter Your Choice : ");
        choice = object.nextLine();
        if (choice.equals("1")) {
            importCar();
        } else if (choice.equals("2")) {
            System.out.println("export");
        } else if (choice.equals("3")) {
            System.out.println("record");
        } else if (choice.equals("4")) {
            System.out.println("cutom");
        } else {
            System.out.println("invalid choice !1");
        }
    }
}

public class Car_management {

    public static void main(String[] args) {
        
        
        
        function a = new function();
        a.mainMenu();
        System.out.println("hi");
    }

}
