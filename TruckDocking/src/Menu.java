import java.util.Scanner;

public class Menu {

    Terminal terminal = new Terminal();

    Van van;
    LightTruck truck;
    Heavytruck heavytruck;

    public Menu() {

        boolean isprogramRunning = true;

        while (isprogramRunning == true) {

        System.out.println("\nShow docked vehicles at Terminal (Option: 1) \n\nChoose a vehicle to arrive at the Terminal \nOption 2: Van \nOption 3: Truck \nOption 4: Heavy truck \nWrite '0' to stop the program ");
        Scanner sc = new Scanner(System.in);
        int i = Integer.parseInt(sc.nextLine());
        int vehicletype;
        int weight;

            switch (i) {

                case 0:
                    if(isprogramRunning = false);
                    break;

                case 1:
                    System.out.println("Show current terminal capacity");
                    terminal.showVehicleToTerminal();
                    System.out.println("Do you wish to add vehicles to the terminal? Y/N ");
                    String question = sc.nextLine();
                            if(question.equalsIgnoreCase("Y")) {
                                break;
                            }
                            else if(question.equalsIgnoreCase("N")) {
                                break;
                            }
                            else {
                                isprogramRunning = false;
                                break;
                            }
                case 2:
                    System.out.println("Give the Van a weight in KG");
                    vehicletype = 2;
                    weight = sc.nextInt();
                    //van = new Van(weight);
                    terminal.checkweight(vehicletype, weight);
                    //terminal.lastplats.add(van);
                    break;

                case 3:
                    System.out.println("Give the Truck a weight in KG");
                    vehicletype = 3;
                    weight = sc.nextInt();
                    //truck = new LightTruck(weight);
                    terminal.checkweight(vehicletype, weight);
                    break;

                case 4:
                    System.out.println("Give the Truck a weight in KG");
                    vehicletype = 4;
                    weight = sc.nextInt();
                    heavytruck = new Heavytruck(weight);
                    terminal.checkweight(vehicletype, weight);
                    break;

                default:
                    System.out.println("System Error");
                    break;
            }

        }

    }



}
