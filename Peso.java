import java.io.*;

public class Peso {

    public static void main(String[] args) throws IOException {
        BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
        float peso;
        float totalpeso = 0;
        double promedio;
        int totalum = 0;

        System.out.println("Ingrese su peso (ingrese cero para finalizar)");
        peso = Integer.parseInt(bufEntrada.readLine());
        while (peso != 0) {
            totalum = totalum + 1;
            totalpeso = totalpeso + peso;
            System.out.println("Ingrese su peso");
            peso = Integer.parseInt(bufEntrada.readLine());
        }
        promedio = (totalpeso * totalum) / 100;
        System.out.println("El promedio del peso es: " + promedio);
    }
}
