public class Jaeger {

    private String modelName;
    private int generation;
    private boolean isDestroyed;

    // SOZDAJU CONSTRUCTORY S PEREGRUZKOY METODOV
    public Jaeger(String modelName, int generation, boolean isDestroyed) {
        this.modelName = modelName;
        this.generation = generation;
        this.isDestroyed = isDestroyed;
    }
    public Jaeger() {
        this.modelName = "Default modelname";
        this.generation = 1;
        this.isDestroyed = false;
    }

    public String getModelName() {
        return modelName;
    }
    public int getGeneration() {
        return generation;
    }
    public boolean getIsDestroyed() {
        return isDestroyed;
    }

    public void speak() {
        System.out.println("I'm " + modelName + ", " + generation + ".th generation.\n");
        System.out.println("It is reported that I was destroyed. It's " + isDestroyed + ".\n");
    }
    public void call() {
        System.out.println("Base, it's " + modelName + ". Answer!\n");
    }
} 