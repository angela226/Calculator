import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        float Numero1 = 0;
        float Numero2 = 0;
        int oper = 0;

        Scanner sc= new Scanner(System.in);
        System.out.println("Digite el primer número");
        Numero1 = sc.nextFloat();
        System.out.println("Digite el segundo número");
        Numero2 = sc.nextFloat();
        System.out.println("Digite el número de la operación: 1:Suma, 2:Resta, 3:Multiplicación, 4:División");
        oper = sc.nextInt();


        operaciones opper = new operaciones(Numero1, Numero2);
        float resul = 0;

        switch (oper) {
            case 1: resul = opper.suma(); break;
            case 2: resul = opper.resta(); break;
            case 3: resul = opper.multiplicacion(); break;
            case 4: resul = opper.division(); break;          
        }
        System.out.println("El resultado de la operacion es: "+resul);




    }

}