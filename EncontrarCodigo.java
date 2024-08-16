import java.io.*;
import java.lang.System.*;

public class EncontrarCodigo {
    public static void main(String[] args) throws Exception {
        
        if (args.length == 0) {
            System.out.println("Error: no se introducio ningun argumento, vuelva a intentar");
            System.exit(1);
        }
        
        File csv = new File("./codigos_postales.csv");
        BufferedReader br = new BufferedReader(new FileReader(csv));
        String currentline;
        while ((currentline = br.readLine()) != null) {
            String[] data = currentline.split(",");
            for (String codigo: args) {
                if (data[0].equals(codigo)) {
                    System.out.println("Codigo Postal: " + data[0] + " - " + data[1]);
                }

            }
        }
    }
}

