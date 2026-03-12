public class Item {
        private String name;
        private int value;
        Item(String name, int value) {
            this.name = name;
            this.value = value;
        }
        public  String toString(){
            return ("item: " + name + " value: " + value);
        }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }
}
