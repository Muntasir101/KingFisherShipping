public class Ship {
    private String name;
    private double capacityMT;
    private double receivedFrom;
    private double currentLoadMT;
    private String destination;

    private static int totalShips = 0;
    private static final String Safety_standard = "IMO 2020";

    // constructor
    public Ship(String name, double capacityMT)
    {
        this.name = name;
        this.capacityMT = capacityMT;
        this.currentLoadMT = 0.0;
        totalShips++;
    }

    // instance methods
    public void loadOil(double tons){
        currentLoadMT += tons;
        System.out.println(name + " Loaded "+ tons + " Mt of oil.");
    }
    public void unload(){
        System.out.println(name + " Unloaded "+ currentLoadMT + " Mt of oil.");
    }
    public boolean isOverLoaded(){
        return currentLoadMT > capacityMT;
    }

    public void setDestination(String port){
        this.destination = port;
        System.out.println(name + " is heading to " + port);
    }
    public double getCurrentLoad(){
        return currentLoadMT;
    }

    // static methods
    public static String getSafetyStandard(){
        return Safety_standard;
    }
    public static int getTotalShips(){
        return totalShips;
    }

    public static void main(String[] args) {
        Ship ship1 = new Ship("OceanTitan",1000);
        System.out.println("New Ship created. Total Ships: "+ getTotalShips());
        System.out.println(ship1.name +" Safety Standard: "+getSafetyStandard());
        ship1.loadOil(950);

        if(ship1.isOverLoaded()){
            System.out.println("Warning "+ship1.name + " is overloaded!!");
        }

        ship1.setDestination("CTG");

        System.out.println(ship1.name+ " Current Load "+ ship1.getCurrentLoad() + " MT");
        ship1.unload();


        Ship ship2 = new Ship("KingFisher",10000);
        System.out.println("New Ship created. Total Ships: "+ getTotalShips());
        System.out.println(ship2.name +" Safety Standard: "+getSafetyStandard());
        ship2.loadOil(8000);
        if(ship2.isOverLoaded()){
            System.out.println("Warning "+ship2.name + " is overloaded!!");
        }

        ship2.setDestination("CTG");

        System.out.println(ship2.name + " Current Load "+ ship2.getCurrentLoad() + " MT");
        ship2.unload();


    }

}

