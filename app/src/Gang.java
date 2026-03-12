import java.util.Random;

public class Gang {
    private Criminal []criminals;
    private Random randomNumber = new Random();
    private double robbedValue = 0;

    public Gang(Criminal[] criminals) {
        this.criminals = criminals;
    }

    public double getRobbedValue()
    {
        return robbedValue;
    }
    public void printGangInfo()
    {
        for(Criminal crim : criminals)
        {
            crim.printBioData();
        }
    }
    private boolean isSuccessfulRobbery()
    {
        double totalCriminalPercentage = 0;
        for (Criminal criminal : criminals)
            totalCriminalPercentage += criminal.getSuccesPercentage();
        return randomNumber.nextDouble(0,100) < totalCriminalPercentage;
    }
    public void letsRob(Building[] buildings)
    {
       int rand = randomNumber.nextInt(0,4);
       Building b= buildings[rand];
            if(isSuccessfulRobbery())
            {
                System.out.println("Robbery was successful in " + b.getBuildingName());
                System.out.println("They stolen the following items: ") ;
                for(Item i : b.getItems())
                {
                    System.out.println(i.getName());
                    robbedValue += i.getValue();
                }
            }
            else {
                System.out.println("Robbery was not successful.");
            }
    }
}
