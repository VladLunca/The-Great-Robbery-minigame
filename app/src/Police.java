import java.util.Random;

public class Police {
    private final Detective detective;
    public Police(Detective detective) {
        this.detective = detective;
    }
    private boolean areCriminalsCaught()
    {
        Random randNumber = new Random();
        return detective.getSuccesPercentage() > randNumber.nextDouble(0,100.0);
    }
    public boolean catchCriminals(Gang gang)
    {
        if(areCriminalsCaught())
        {
            System.out.println("Stolen amount: " + gang.getRobbedValue() + " was returned.");
            System.out.println("The criminals have been caught.");
            return true;
        }
        else
        {
            System.out.println("Stolen amount: " + gang.getRobbedValue() + " was not recovered. The criminals escaped.");
            return false;
        }

    }
}
