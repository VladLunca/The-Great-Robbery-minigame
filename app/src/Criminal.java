public class Criminal extends Person {
    private double succesPercentage;

    public Criminal(String name, String nickname, int yearOfBorn, Item[] items, String expertIn, double succes_percentage) {
        super(name, nickname, yearOfBorn, items, expertIn);
        this.succesPercentage = succes_percentage;
    }

    @Override
    public void printBioData() {
        System.out.println("Criminal:");
        super.printBioData();
        System.out.println("Succes percentage: " + succesPercentage);
    }

    public double getSuccesPercentage() {
        return succesPercentage;
    }
}
