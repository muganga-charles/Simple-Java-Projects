import java.util.*;
class Classroom extends Building implements NumberIdentification {
    private int numberOfSeats;
    private int numberOfPoweroutlet;
    Classroom(int numberOfPoweroutlet,int numberOfSeats){
        super();
        this.numberOfSeats = numberOfSeats;
        this.numberOfPoweroutlet = numberOfPoweroutlet;
    }
    @Override
    public int getRoomNumber(){
        Random random = new Random();
        return random.nextInt(100);
    }
    @Override
    public int getPowerOutlet(){
        return numberOfPoweroutlet;
    }
    @Override
    public int getTotalNuumber(){
        return numberOfSeats;
    }

}