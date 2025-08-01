package src;

public class Pet {

    private final String name;

    private boolean clean;

    public Pet(String name) {
        this.name = name;
        this.clean = false;
    }

    public boolean isClean() {
        return clean;
    }

    public String getName() {
        return name;
    }

    public void setClean(boolean clean) {
        this.clean = clean;
    }
}
