import java.util.Scanner;

public class CalcChallenge {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Primer número: ");
        double num1 = entrada.nextDouble();

        System.out.print("Segundo número: ");
        double num2 = entrada.nextDouble();

        System.out.print("Informe el operador: ");
        String operador = entrada.next();

        double resultado = "+".equals(operador) ? num1 + num2 : 0;
        resultado = "-".equals(operador) ? num1 - num2 : resultado;
        resultado = "*".equals(operador) ? num1 * num2 : resultado;
        resultado = "/".equals(operador) ? num1 / num2 : resultado;
        resultado = "%".equals(operador) ? num1 % num2 : resultado;

        System.out.printf("%.2f %s %.2f = %.2f",
                num1, operador, num2, resultado);
        entrada.close();
    }

    }
}
