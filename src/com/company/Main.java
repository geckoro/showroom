package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;
        Showroom obj = new Showroom("Showroomul lui giku");
        do {
            System.out.println("\nMENU== Type the digit for your desired action:\n1. Add a vehicle;\n2. Sell a vehicle;");
            System.out.println("3. Update the prices of all vehicles;\n4. Show all the vehicles that are in stock.");
            System.out.println("9. Leave");
            System.out.println("Input here:");
            try {
                choice = in.nextInt();
                in.nextLine();
            } catch (Exception e) {
                System.out.println("Something went wrong");
            }
            switch(choice) {
                case 1:
                    String input = "", nume, marca, price;
                    do {
                        System.out.println("I need the name, the model and the price of the vehicle you want to add.");
                        nume = in.nextLine();
                        marca = in.nextLine();
                        price = in.nextLine();
                        System.out.printf("TO BE ADDED: %s, %s, $%f", nume, marca, Float.parseFloat(price));
                        System.out.println("\nIs this right? Type 0 to finish, anything else otherwise.");
                        input = in.nextLine();
                    } while(!input.equals("0"));
                    obj.addVehicle(nume, marca, Float.parseFloat(price));
                    break;
                case 2:
                    int stock = obj.getSize();
                    if(stock == 0) {
                        System.out.println("There are no cars in stock.");
                        break;
                    }
                    System.out.printf("I need the ID of the vehicle you want to sell (0-%d)", obj.getSize()-1);
                    boolean ok = false;
                    do {
                        String idSell = in.nextLine();
                        if(Integer.parseInt(idSell) >= 0 && Integer.parseInt(idSell) < obj.getSize()) {
                            obj.sellVehicle(Integer.parseInt(idSell));
                            ok = true;
                        }
                        else {
                            System.out.println("Wrong ID, try again\n");
                        }
                    } while (!ok);
                    break;
                case 3:
                    System.out.println("I need the percentage that you want to apply to the prices (0-100)");
                    ok = false;
                    do {
                        String percentage = in.nextLine();
                        if(Integer.parseInt(percentage) >=0 && Integer.parseInt(percentage)<=100) {
                            obj.update(Integer.parseInt(percentage));
                            ok = true;
                        }
                        else {
                            System.out.println("Wrong percentage, try again\n");
                        }
                    } while (!ok);
                    break;
                case 4:
                    obj.printStock();
                    System.out.println("Press ENTER to get back to the menu...");
                    in.nextLine();
                    break;
                case 9:
                    System.out.println("The MENU will close, thank you for your services.");
                    break;
                default:
                    System.out.println("There is no option for that digit, try again.");
                    break;
            }
        } while (choice != 9);
    }
}
