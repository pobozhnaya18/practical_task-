package Planes;

import models.ClassificationLevel;
import models.ExperimentalPlaneSpecifications;
import models.ExperimentalTypes;

public class ExperimentalPlane extends Plane{

    private ExperimentalTypes type;
    private ClassificationLevel classificationLevel;

    public ExperimentalPlane(ExperimentalPlaneSpecifications experimentalPlaneSpecifications) {
        super(experimentalPlaneSpecifications);
        this.type = experimentalPlaneSpecifications.type;
        this.classificationLevel = experimentalPlaneSpecifications.classificationLevel;
    }

    public ClassificationLevel getClassificationLevel(){
        return classificationLevel;
    }

    public void setClassificationLevel(ClassificationLevel classificationLevel){
        this.classificationLevel = classificationLevel;
    }

    @Override
    public String toString() {
        return "experimentalPlane{" +
                "model='" + getModel() + '\'' +
                '}';
    }
}
