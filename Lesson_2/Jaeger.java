public class Jaeger {

    private String modelName;
    private int generation;
    private boolean isDestroyed;

    public void setModelName(String modelName) {
        if(modelName.isEmpty()) {
            System.out.println("You did not enter any modelname. Make input.");
        } else {
        this.modelName = modelName;
        }
    }
    public String getModelName() {
        return modelName;
    }

    public void setGeneration(int generation) {
        if(generation<1) {
            System.out.println("Such generation does not exist. Check input.");
        } else {
        this.generation = generation;
        }
    }
    public int getGeneration() {
        return generation;
    }

    public void setIsDestroyed(boolean isDestroyed) {
        this.isDestroyed = isDestroyed;
    }
    public boolean getIsDestroyed() {
        return isDestroyed;
    }

    public void setModelNameAndGenerationAndIsDestroyed(String modelName, int generation, boolean isDestroyed) {
        this.modelName = modelName;
        this.generation = generation;
        this.isDestroyed = isDestroyed;
    }

    public void speak() {
        System.out.println("I'm " + modelName + ", " + generation + ".th generation.\n");
        System.out.println("It is reported that I was destroyed. It's " + isDestroyed + ".\n");
    }
    public void call() {
        System.out.println("Base, it's " + modelName + ". Answer!\n");
    }
} 