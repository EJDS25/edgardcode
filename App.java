import java.util.Scanner;
// Edgard jose Estrada Salazar,2024-1373U
public class App {

    public static int N1, N2, N3; 
    public static void main(String[] args) throws Exception {

        Scanner leer = new Scanner(System.in); 

        // ingresar suma de 3 numeros diferentes,suma de los dos mas bajos diferencia enre los dos mas grandes y cual de los 3 numeros es el mayor

        do {


            try {

                System.out.println("ingresar 3 numeros distintos");
                N1 = leer.nextInt();
                N2 = leer.nextInt();
                N3 = leer.nextInt();
                
            } catch (Exception str) {

                System.out.println(str);
                System.out.println("ingresar solo valores correctos");
                leer.nextLine();



            }

        } while (N1 == N2 || N1 == N3 || N2 == N3);

        leer.close();

        int sumdmin = N1+N2+N3-Math.max(Math.max(N1,N2),N3);
        int difdmayor = Math.max(Math.max(N1,N2),N3)-Math.max(Math.min(N1,N2), Math.min(Math.max(N1,N2),N3));
        int mayor = Math.max(Math.max(N1,N2),N3);

        System.out.println("suma de los numeros menores");
        System.err.println(sumdmin);

        System.out.println("resta de los numeros mayores");
        System.out.println(difdmayor);

        System.out.println("numero mayor");
        System.out.println(mayor);

    }
}
