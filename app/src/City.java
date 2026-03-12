public class City {
    private Building[] buildings = new Building[4];

    public City() {
       Item []bankItems = new Item[2];
       bankItems[0]=new Item("money",10000);
       bankItems[1]=new Item("safe",5022200);
       buildings[0]=new Building("Bank",bankItems);

        Item []houseItems = new Item[2];
        houseItems[0]=new Item("scissors",100);
        houseItems[1]=new Item("laptop",500);
        buildings[1]=new Building("House",houseItems);

        Item []officeItems = new Item[2];
        officeItems[0]=new Item("stapler",120);
        officeItems[1]=new Item("printer",1000);
        buildings[2]=new Building("Office",officeItems);

        Item []hospitalItems = new Item[2];
        hospitalItems[0]=new Item("nurse uniform",120);
        hospitalItems[1]=new Item("hospital bed",1000);
        buildings[3]=new Building("Hospital",hospitalItems);



    }
    public Building[] getBuildings() {
        return buildings;
    }
}
