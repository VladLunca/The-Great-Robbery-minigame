public class GreatRobberyApp {
    public static void main(String[] args) {
        Item [] criminalItems = new Item[1];
        criminalItems[0] = new Item("gun",10);
        Criminal tim = new Criminal("Tim","Snake",1900,criminalItems,"guns",10);
        criminalItems[0] = new Item("Key",10);
        Criminal martin = new Criminal("Martin","Snake",1910,criminalItems,"keys",20);
        City city = new City();
        Criminal [] criminals = new Criminal[2];
        criminals[0]=tim;
        criminals[1]= martin;
        Gang gang = new Gang(criminals);
        Item[] policeItems = new Item[3];
        policeItems[0]=new Item("gun",10);
        policeItems[1] = new Item ("car",20000);
        policeItems[2]=new Item("phone",10000);
        Detective detectiv =new Detective("George","Sherlock", 1980,policeItems,"Crimes",10 );
        Police police = new Police(detectiv);
        gang.printGangInfo();
        int round = 1;
        do {
            System.out.println("Round "+ round++ + "---------------------------------------------------");
            gang.letsRob(city.getBuildings());
        }while(!police.catchCriminals(gang));



    }
}