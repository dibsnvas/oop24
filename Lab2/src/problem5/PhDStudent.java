package problem5;

public class PhDStudent extends Person {
    private String researchTopic;

    public PhDStudent(String name, int age, String researchTopic) {
        super(name, age);
        this.researchTopic = researchTopic;
    }

    @Override
    public void assignPet(Animal pet) {
        if (pet instanceof Dog) {
            throw new IllegalArgumentException("PhD students cannot have dogs.");
        }
        super.assignPet(pet);
    }

    @Override
    public String getOccupation() {
        return "PhD Student researching " + researchTopic;
    }
}
