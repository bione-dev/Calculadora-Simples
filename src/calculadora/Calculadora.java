package calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        // Criar um scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        double num1, num2, resultado; // Variáveis para os números e o resultado
        char operador; // Variável para armazenar o operador escolhido
        char continuar; // Variável para verificar se o usuário quer realizar outra operação

        System.out.println("Bem-vindo à Calculadora!");

        do {
            // Perguntando ao usuário qual o primeiro número que deseja calcular
            System.out.print("Digite o primeiro número: ");
            num1 = scanner.nextDouble();

            // Perguntando ao usuário qual o segundo número que deseja calcular
            System.out.print("Digite o segundo número: ");
            num2 = scanner.nextDouble();

            // Solicitando ao usuário que escolha a operação desejada
            System.out.print("Escolha a operação (+, -, *, /): ");
            operador = scanner.next().charAt(0);

            // Realizando a operação com base no operador escolhido pelo usuário
            switch (operador) {
                case '+':
                    resultado = num1 + num2; // Soma
                    System.out.println("Resultado: " + resultado);
                    break;
                case '-':
                    resultado = num1 - num2; // Subtração
                    System.out.println("Resultado: " + resultado);
                    break;
                case '*':
                    resultado = num1 * num2; // Multiplicação
                    System.out.println("Resultado: " + resultado);
                    break;
                case '/':
                    // Verificando se o divisor é diferente de zero para evitar erro
                    if (num2 != 0) {
                        resultado = num1 / num2; // Divisão
                        System.out.println("Resultado: " + resultado);
                    } else {
                        // Mensagem de erro caso o usuário tente dividir por zero
                        System.out.println("Erro: Divisão por zero!");
                    }
                    break;
                default:
                    // Mensagem de erro para operadores inválidos
                    System.out.println("Operador inválido!");
                    break;
            }

            // Perguntando ao usuário se ele gostaria de realizar outra operação
            System.out.print("Deseja realizar outra operação? (s/n): ");
            continuar = scanner.next().charAt(0);
        } while (continuar == 's' || continuar == 'S'); // O loop continua enquanto o usuário digitar 's' ou 'S'

        System.out.println("Obrigado por usar a calculadora!"); // Mensagem de despedida
        scanner.close(); // Fechar o scanner para evitar vazamento de recursos
    }
}
