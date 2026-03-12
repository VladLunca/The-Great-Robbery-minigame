 public class Detective extends Person{
    private double succesPercentage;

    public Detective(String name, String nickname, int yearOfBorn, Item[] items, String expertIn, double succes_percentage) {
        super(name, nickname, yearOfBorn, items, expertIn);
        this.succesPercentage = succes_percentage;
    }

    @Override
    public void printBioData() {
        System.out.println("Detective:");
        super.printBioData();
        System.out.println("SUCCES PERCENTAGE: " + succesPercentage);
    }

    public double getSuccesPercentage() {
        return succesPercentage;
    }
}
