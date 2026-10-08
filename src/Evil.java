import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.awt.Desktop;
import java.net.URI;
import java.util.concurrent.TimeUnit;
import java.awt.Robot;
import java.awt.AWTException;
import java.util.Random;

public class Evil
{

    /**
     * Random Chud Funny Script thingies
     *
     * @author (your name)
     * @version (a version number or a date)
     */
        public Path path = Path.of("C:/Users/jlovell/Desktop/abc.txt");
        public Random random = new Random();

        /**
         * Constructor for objects of class Bye
         */
        public Evil()
        {
            // initialise instance variables

        }
        public void FunkeyMonkeyBaby()
        {
            try
            {
                Files.writeString(path," Funky monkey Baby \n",StandardOpenOption.APPEND);
            }
            catch(Exception X)
            {
            }
        }
        public void ToYoutube(String Url)
        {
            try{
                URI url = new URI("https://youtu.be/a_-rE8bZJ3A?si=N2j8IRtsX-AIUHlp");
                Desktop.getDesktop().browse(url);
            }
            catch(Exception X)
            {
            }
        }
        public void MouseControl()
        {
            try{
                int x = random.nextInt(1,1500);
                int y = random.nextInt(1,1500);

                Robot robot = new Robot();
                robot.mouseMove(x,y);
            }
            catch(Exception X)
            {
            }
        }
        public void TimeControl(int MiliSecond)
        {
            try
            {
                Thread.sleep(MiliSecond);
            }
            catch (InterruptedException ie)
            {
                System.out.println("Failed Time Control");
            }
        }
        public void ReadFile(String File)
        {
            Path filePath = Path.of(File);

        }
        public void Destroy()
        {
            try
            {
                while(true)
                {
                    TimeControl(15);
                    MouseControl();
                }

            }
            catch(Exception e)
            {

                System.out.println(e);
            }
        }
    }
