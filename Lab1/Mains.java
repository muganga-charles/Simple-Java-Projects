public class Mains{
    public static void main(String [] args){
        //Building building1 = new Building();
        Classroom classroom1 = new Classroom(10, 20);
        Labs labs1 = new Labs(10, 20);
        //Faculty faculty1 = new Faculty("Dr. Smith");
        int total = classroom1.getTotalNuumber() + labs1.getTotalNuumber();
        System.out.println("The total number of People is : " + total);
    }
}