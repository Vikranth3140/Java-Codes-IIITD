package Q4;

public class Main {
    public static void main(String[] args) {
        TicketDispensor dispenser = TicketDispensor.getInstance();

        Ticket t1 = dispenser.dispenseTicket("bumperCars");
        Ticket t2 = dispenser.dispenseTicket("rollerCoaster");
        Ticket t3 = dispenser.dispenseTicket("ferrisWheel");

        System.out.format("Ticket 1: %s \n", t1.toString());
        System.out.format("Ticket 2: %s \n", t2.toString());
        System.out.format("Ticket 3: %s \n", t3.toString());
    }
}