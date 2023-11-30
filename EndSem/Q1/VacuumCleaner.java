package Q1;

import java.io.Serializable;

class VacuumCleaner extends Cleaner implements Serializable {

    private String modelID;
    private static final int no_of_models = 1000;
    private final Motor motor;

    public VacuumCleaner(String modelID) {
        this.motor = new Motor();
        this.modelID = modelID;
    }

    @Override
    public void clean() {
        System.out.printf("Motor is cleaning");
    }

    class Motor implements Rotator, Serializable {

        @Override
        public void rotate() {
            System.out.printf("Motor is rotating");
        }
    }

    public VacuumCleaner(Motor motor) {
        this.motor = motor;
    }

    public String getModelID() {
        return modelID;
    }

    public void setModelID(String modelID) {
        this.modelID = modelID;
    }

    public Motor getMotor() {
        return motor;
    }
}