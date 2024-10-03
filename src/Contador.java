import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        int parametroUm = terminal.nextInt();
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidException e) {
            System.out.println("O segundo parametro deve ser maior que o primeiro");
        }
    }
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidException {
        if (parametroDois <= parametroUm) {
            throw new ParametrosInvalidException();
        }

        int contagem = parametroDois - parametroUm;

        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}