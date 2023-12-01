package Q4;

public class TicketDispensor {
    private static TicketDispensor dispensor = null;
    private int sNo = 0;

    public static TicketDispensor getInstance() {
        if (dispensor == null) {
            dispensor = new TicketDispensor();
        }
        return dispensor;
    }

    private TicketDispensor() {
        System.out.println("Creating a ticket dispensor");
    }

    public Ticket dispenseTicket(String type) {
        if (type == null) {
            return null;
        } else if (type.equals("bumperCars")) {
            this.sNo++;
            return new BumperCarsTicket(sNo);
        } else if (type.equals("rollerCoaster")) {
            this.sNo++;
            return new RollerCoasterRideTicket(sNo);
        } else if (type.equals("ferrisWheel")) {
            this.sNo++;
            return new FerrisWheelTicket(sNo);
        } else {
            return null;
        }
    }
}