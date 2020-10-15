package LoggerExercise;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    private static Logger instance = new Logger();
    /**
     * @TODO Add any necessary fields and variables.
     */

    /**
     * The constructor for SingletonLogger. Set all necessary fields.
     *
     */
    //@TODO Add constructor here
    private Logger() {
        String today = (new SimpleDateFormat("MMddyyyy")).format(new Date());
        String filename = "log"+today+".log";
        File file = new File(filename);
        file.delete();
    }

    /**
     * @return A Logger instance of this class.
     */
    public static Logger getInstance() {
        return instance; //@TODO: Delete this line
    }


    /**
     *
     * @param log
     *            The Object that will be logged in the file.
     */
    public void logInFile(Object log) {
        //@TODO: implement me
        
        String message = log.toString();
        try {
            String s = new SimpleDateFormat("MMddyyyy").format(new Date());
            s = "log" + s + ".log";
            BufferedWriter out = new BufferedWriter(
                new FileWriter(s, true));
            out.write(message + "\n");
            out.close();
            
        } catch(Exception e){
            System.out.println("Failed write");
        }
        
    }
}