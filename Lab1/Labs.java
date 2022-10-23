import java.util.Random;

public class Labs extends Building implements  NumberIdentification {
    private int numberOfPeople;
    private int numberOfPoweroutlet;

    public Labs(int numberOfPeople, int numberOfPoweroutlet){
        super();
        this.numberOfPoweroutlet = numberOfPoweroutlet;
        this.numberOfPeople = numberOfPeople;
        
    }
    @Override
    public int getRoomNumber(){
        Random random = new Random();
        return random.nextInt(100);
        //return random.ints(1,100);
    }
    @Override
    public int getPowerOutlet(){
        return numberOfPoweroutlet;
    }
    @Override
    public int getTotalNuumber(){
        return numberOfPeople;
    }

}