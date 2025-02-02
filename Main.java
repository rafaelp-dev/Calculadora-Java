import java.util.Scanner;

public class Main {
    public static double soma(double a, double b){
        return a + b;
    }

    public static double subtracao(double a, double b){
        return a - b;
    }

    public static double multiplicacao(double a, double b){
        return a * b;
    }

    public static double divisao(double a, double b){
        if(b == 0){
            System.out.println("Erro: Divisão por zero não é permitida.");
            return 0;
        }

        return a / b;
    }
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int opcao;
        double a = 0, b = 0, resultado;

        do{
            System.out.println("===Calculadora===");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Sair");
            System.out.println("Escolha uma opção: ");
            opcao = scanner.nextInt();

            if(opcao != 5){
                System.out.println("Digite o primeiro número:");
                a = scanner.nextDouble();

                System.out.println("Digite o segundo número:");
                b = scanner.nextDouble();
            }

            switch(opcao){
                case 1:
                resultado = soma(a, b);
                System.out.println("Resultado: " + resultado);
                break;

                case 2:
                resultado = subtracao(a, b);
                System.out.println("Resultado: " + resultado);
                break;

                case 3:
                resultado = multiplicacao(a, b);
                System.out.println("Resultado: " + resultado);
                break;

                case 4:
                resultado = divisao(a, b);
                System.out.println("Resultado: " + resultado);
                break;
                
                default:
                System.out.println("Opção inválida.");
                break;
            }
        }while(opcao != 5);

        System.out.println("Fechando o programa.");
        scanner.close();
    }
}