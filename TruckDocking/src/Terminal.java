import java.util.ArrayList;

public class Terminal {

    DockA dock1 = new DockA();
    DockB dock2 = new DockB();
    DockC dock3 = new DockC();
    DockD dock4 = new DockD();
    DockE dock5 = new DockE();


    ArrayList<Vehicle> lastplats = new ArrayList<>();

    @Override
    public String toString() {
        return lastplats.toString();
    }

    public void checkweight(int vehicletype, int weight) {

        if (vehicletype == 2) {
            System.out.println("You have access to Dock: A,B ");
            Van van = new Van(weight); // kombinerar vikten och typen i en ny variabel

            if (dock1.lastkaj1.size() == 0) {
                System.out.println("Cleared for Dock A");
                dock1.lastkaj1.add(van);
            } else if (dock2.lastkaj2.size() == 0) {
                System.out.println("Cleared for Dock B");
                dock2.lastkaj2.add(van);
            } else if (dock1.lastkaj1.size() == 1 && dock2.lastkaj2.size() == 1) {
                System.out.println("All Gates full! Proceed to Terminal transfer area");
                lastplats.add(van);
            } else {
                System.out.println("System Error");
            }

        }



        // First IF iteration
        if(vehicletype == 3 && weight > 5000 && weight < 9000) {
            System.out.println("You have access to Dock: C,D ");
            LightTruck truck = new LightTruck(weight);

            if (dock3.lastkaj3.size() == 0) {
                System.out.println("Cleared for Dock C");
                dock3.lastkaj3.add(truck);

            } else if (dock4.lastkaj4.size() == 0) {
                System.out.println("Cleared for Dock D");
                dock4.lastkaj4.add(truck);

            } else if (dock3.lastkaj3.size() == 1 && dock4.lastkaj4.size() == 1) {
                System.out.println("All Gates full! Proceed to Terminal transfer area");
                lastplats.add(truck);
            }
        }

            // Second IF iteration
            if (vehicletype == 3 && weight <= 5000) {
                System.out.println("You have access to Dock: A,C,D ");
                LightTruck truck = new LightTruck(weight);

                if (dock1.lastkaj1.size() == 0) {
                    System.out.println("Cleared for Dock A");
                    dock1.lastkaj1.add(truck);
                } else if (dock3.lastkaj3.size() == 0) {
                    System.out.println("Cleared for Dock C");
                    dock3.lastkaj3.add(truck);
                } else if (dock4.lastkaj4.size() == 0) {
                    System.out.println("Cleared for Dock D");
                    dock4.lastkaj4.add(truck);
                } else if (dock1.lastkaj1.size() == 1 && dock3.lastkaj3.size() == 1 && dock4.lastkaj4.size() == 1) {
                    System.out.println("All Gates full! Proceed to Terminal transfer area");
                    lastplats.add(truck);
                }

                // Third IF iteration
            }

                if (vehicletype == 3 && weight > 9000) {
                System.out.println("You are very heavy: Go to Dock E! ");
                LightTruck truck = new LightTruck(weight);

                if(dock5.lastkaj5.size() == 0) {
                    System.out.println("Cleared for Dock E");
                    dock5.lastkaj5.add(truck);
                }
                else if(dock5.lastkaj5.size() != 0) {
                    System.out.println("All Gates full! Proceed to Terminal transfer area");
                    lastplats.add(truck);
                }

                }



        // Forth IF iteration
        if (vehicletype == 4 && weight > 9000) {
            System.out.println("You have access to Dock: E ");
            Heavytruck heavytruck = new Heavytruck(weight);

            if (dock5.lastkaj5.size() == 0) {
                System.out.println("Cleared for Dock E");
                dock5.lastkaj5.add(heavytruck);
            }
            else if(dock5.lastkaj5.size() != 0) {
                System.out.println("Gate E is full! Proceed to Terminal transfer area");
            }
        }


        // Fifth IF iteration
        if (vehicletype == 4 && weight <= 9000) {
            System.out.println("You have access to Dock: D,E ");
            Heavytruck heavytruck = new Heavytruck(weight);
            if(dock4.lastkaj4.size() == 0) {
                System.out.println("Cleared for Dock D");
                dock4.lastkaj4.add(heavytruck);
            }
            else if(dock5.lastkaj5.size() == 0) {
                System.out.println("Cleared for Dock E");
                dock5.lastkaj5.add(heavytruck);
            }
            else if(dock4.lastkaj4.size() != 0 && dock5.lastkaj5.size() != 0) {
                System.out.println("All Gates full! Go to Terminal transfer area");
                lastplats.add(heavytruck);
            }
        }


    }


    public void showVehicleToTerminal() {

        for (int i = 0; i < lastplats.size(); i++) {
            System.out.println("Terminal Transfer Area: " + lastplats.get(i).toString() + "Parking Position: " + i );
        }
        for (int i = 0; i < dock1.lastkaj1.size(); i++) {
            System.out.println("Dock A: " + dock1.lastkaj1.get(i).toString());
        }
        for (int i = 0; i < dock2.lastkaj2.size(); i++) {
            System.out.println("Dock B: " + dock2.lastkaj2.get(i).toString());
        }
        for (int i = 0; i < dock3.lastkaj3.size(); i++) {
            System.out.println("Dock C: " + dock3.lastkaj3.get(i).toString());
        }
        for (int i = 0; i < dock4.lastkaj4.size(); i++) {
            System.out.println("Dock D: " + dock4.lastkaj4.get(i).toString());
        }
        for (int i = 0; i < dock5.lastkaj5.size(); i++) {
            System.out.println("Dock E: " + dock5.lastkaj5.get(i).toString());
        }

    }

    class DockA {

        ArrayList<Vehicle> lastkaj1 = new ArrayList<>(1);

        @Override
        public String toString() {
            return "Dock A";
        }

    }

}
    class DockB {

        ArrayList<Vehicle> lastkaj2 = new ArrayList<>(1);


        @Override
        public String toString() {
            return "Dock B";
        }

    }

    class DockC {

        ArrayList<Vehicle> lastkaj3 = new ArrayList<>(1);


        @Override
        public String toString() {
            return "Dock C";
        }

    }

    class DockD {

        ArrayList<Vehicle> lastkaj4 = new ArrayList<>(1);


        @Override
        public String toString() {
            return "Dock D";
        }

    }

class DockE {

    ArrayList<Vehicle> lastkaj5 = new ArrayList<>(1);

    @Override
    public String toString() {
        return "Dock E";
    }

}