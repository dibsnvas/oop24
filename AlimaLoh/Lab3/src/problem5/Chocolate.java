package problem5;

public class Chocolate implements Comparable<Chocolate> {
    private int weight;
    private String name;

    public Chocolate(int weight, String name) {
        this.weight = weight;
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Chocolate " + name + " (" + weight + "g)";
    }

    @Override
    public int compareTo(Chocolate c) {
        return Integer.compare(this.weight, c.weight);
    }
}
