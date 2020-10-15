package ComputerExercise;

import java.io.*;

public class Keyboard extends ComputerPeripheral {
//@TODO: Implememnt me

    public Keyboard(Computer computer) {
        super(computer);
    }

    public String run() {
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char s = 'a';
        try {
            s = (char)System.in.read();
        } catch (Exception e) {}
        if ( s == '\n') {
            return super.run();
        }
        return null;
    }

    public String getDescription() {
        return super.getDescription() + " with keyboard";
    }
}
