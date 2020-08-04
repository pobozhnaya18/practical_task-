package models;

public enum ExperimentalPlaneSpecifications {
    E_LSA("E_LSA", 277, 482, 500, ExperimentalTypes.HYPERSONIC, ClassificationLevel.TOP_SECRET);

    public String model;
    public int maxSpeed;
    public int maxFlightDistance;
    public int maxLoadCapacity;
    public ExperimentalTypes type;
    public ClassificationLevel classificationLevel;

    ExperimentalPlaneSpecifications(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity,
                                    ExperimentalTypes type, ClassificationLevel classificationLevel) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.maxFlightDistance = maxFlightDistance;
        this.maxLoadCapacity = maxLoadCapacity;
        this.type = type;
        this.classificationLevel = classificationLevel;
    }
}
