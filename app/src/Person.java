public abstract class Person {
    private String name;
    private String nickname;
    private int yearOfBorn;
    private Item [] items;
    private String expertIn;

    public Person(String name, String nickname, int yearOfBorn, Item[] items, String expertIn) {
        this.name = name;
        this.nickname = nickname;
        this.yearOfBorn = yearOfBorn;
        this.items = items;
        this.expertIn = expertIn;
    }

    public String getName() {
        return name;
    }

    public String getNickname() {
        return nickname;
    }
    public void printBioData(){
        System.out.println("Name: " + name);
        System.out.println("Nickname: " + nickname);
        System.out.println("Year of born: " + yearOfBorn);
        System.out.println("Expert in: " + expertIn);
        System.out.println("Items:");
        for(Item item : items){
            System.out.println(item);
        }
    }
}
