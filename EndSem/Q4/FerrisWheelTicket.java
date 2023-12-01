package Q4;

class FerrisWheelTicket extends Ticket {
    public FerrisWheelTicket(int sNo) {
        super(sNo);
    }

    @Override
    public int getsNo() {
        return super.getsNo();
    }

    @Override
    public String toString() {
        return String.format("S.No: %d for ferris wheel", super.getsNo());
    }
}