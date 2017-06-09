import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

/**
 * Created by haozewang on 17/6/8.
 */
public class test {
    public static void main(String args[]) throws Exception{
        for(int i = 0; i < 20; i++){
            File file = new File("./"+i+"csv");
            file.createNewFile();
            BufferedWriter out = new BufferedWriter(new FileWriter(file));
            
            out.write("Manual\n");
        }
    }
}
