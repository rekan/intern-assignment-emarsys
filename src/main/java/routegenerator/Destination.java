package routegenerator;

public class Destination {
    private String name;
    private Destination dependency;

    public Destination(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Destination getDependency() {
        return dependency;
    }

    public void setDependency(Destination dependency) {
        this.dependency = dependency;
    }
}
