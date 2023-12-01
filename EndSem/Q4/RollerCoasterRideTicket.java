package Q4;

class RollerCoasterRideTicket extends Ticket {
    public RollerCoasterRideTicket(int sNo) {
        super(sNo);
    }

    @Override
    public int getsNo() {
        return super.getsNo();
    }

    @Override
    public String toString() {
        return String.format("S.No: %d for roller coaster ride", super.getsNo());
    }
}
