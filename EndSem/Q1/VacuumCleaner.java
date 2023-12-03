package Q1;

import java.io.Serial;
import java.io.Serializable;

class VacuumCleaner extends Cleaner implements Serializable {
    @Serial
    private static final long serialVersionUID = 42L;
    private String modelID;
    private static final int no_of_models = 1000;
    private final Motor motor;

    public VacuumCleaner(String modelID) {
        this.motor = new Motor();
        this.modelID = modelID;
    }

    @Override
    public void clean() {
        System.out.print("Motor is cleaning");
    }

    static class Motor implements Rotator, Serializable {
        @Serial
        private static final long serialVersionUID = 20L;

        @Override
        public void rotate() {
            System.out.print("Motor is rotating");
        }
    }
}