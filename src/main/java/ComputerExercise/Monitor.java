package ComputerExercise;

public class Monitor extends ComputerPeripheral{
    public Monitor(Computer computer) {
        super(computer);
    }

    public String run() {
        return "Monitor turned on\n" + super.run() + "Display colorful interface\n";
    }

    public String getDescription() {
        return super.getDescription() + " with monitor";
    }
//@TODO: Implememnt me
}
