import java.io.*;

public class EncontrarCodigo {
    public static void main(String[] args) throws Exception {
        
        if (args.length == 0) {
            System.out.println("Error: no se introducio ningun argumento, vuelva a intentar");
            System.exit(1);
        }

        try {
        File csv = new File("./codigos_postales.csv");

        BufferedReader br = new BufferedReader(new FileReader(csv));
        String currentline;
        while ((currentline = br.readLine()) != null) {
            String[] columnas = currentline.split(",");
            for (String codigo: args) {
                if (columnas[0].equals(codigo)) {
                    System.out.println("Codigo Postal: " + columnas[0] + " - " + columnas[1]);
                }

            }
        }

        br.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error: Archivo no encontrado");
            System.exit(1);
        }
    }
}

