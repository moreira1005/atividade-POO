import java.sql.SQLOutput;
import java.util.Scanner;

public class Atividade {
    public static void main(String[] args) {

        //1. Imprima a frase “Ola, Mundo!”.
        System.out.println("Olá, mundo");

        //2. Declare duas variáveis do tipo int e realize a soma entre elas. Imprima o resultado.
        int n1 = 10;
        int n2 = 10;
        int resultado = n1 + n2;
        System.out.println(resultado);

        //3. Declare uma variável do tipo double e atribua a ela o valor 5.67. Multiplique essa variável por 3 e imprima o resultado.
        double num = 5.67;
        double resultado2 = num * 3;
        System.out.println(resultado2);

        //4. Crie uma variável do tipo char e atribua a ela uma letra. Em seguida, imprima essa letra na tela.
        char letra = 'G';
        System.out.println(letra);

        //5. Declare uma variável do tipo boolean e atribua a ela o valor true. Em seguida, imprima o valor da variável.
        boolean valor1 = true;
        System.out.println(valor1);

        //6.Crie uma variável do tipo String e atribua a ela o seu nome. Concatene essa variável com a frase " é um aluno dedicado." e imprima o resultado.
        String nome = "Gabriel Moreira";
        System.out.println(nome + "é um aluno dedicado");

        //7.Crie uma variável do tipo boolean chamada temCarteira e atribua a ela o valor false. Imprima a variável, em seguida, altere o valor para true e imprima novamente.

        boolean temCarteira = false;
        System.out.println(temCarteira);
        temCarteira = true;
        System.out.println(temCarteira);

        //8.Declare uma variável do tipo String chamada frase e atribua a ela a concatenação das palavras "Olá" e "Mundo".
        String frase = "Olá " + "mundo";

        //9.Crie uma variável do tipo int chamada numero1 e outra chamada numero2. Realize a soma, subtração, multiplicação e divisão entre esses números e atribua os resultados a variáveis correspondentes.
        int numero1 = 10;
        int numero2 = 10;
        int resultado3 = numero1 + numero2;
        System.out.println("Soma: " + resultado3);
        int resultado4 = numero1 - numero2;
        System.out.println("Subtração: " + resultado4);
        int resultado5 = numero1 * numero2;
        System.out.println("Multiplicação: " + resultado5);
        int resultado6 = numero1 % numero2;
        System.out.println("Divisão: " + resultado6);

        //10.Declare uma variável do tipo double chamada saldo e atribua a ela o valor 500.50. Realize um depósito de 300.25 nessa conta e, em seguida, realize um saque de 150.75.
        double saldo = 500.50;
        System.out.println("Saldo: "+ saldo);
        double deposito = 500.50 + 300.25;
        System.out.println("Saldo depois do depósito: " + saldo);
        double saque = deposito - 150.75;
        System.out.println("Saldo atual: " + saque);


        //11. Crie uma variável do tipo String chamada fruta1 e outra chamada fruta2. Concatene essas variáveis para formar a mensagem: "Eu gosto de [fruta1] e [fruta2]."
        String fruta1 = "Banana";
        String fruta2 = "Uva";
        System.out.println("Eu gosto de " + fruta1 + " e " + fruta2);

        //12. Declare uma variável do tipo int chamada idadeAnos e atribua a ela sua idade em anos. Converta essa idade para meses e imprima o resultado.
        int idadeAnos = 20;
        idadeAnos = idadeAnos * 12;
        System.out.println("Minha idade em meses: " + idadeAnos);

        //13. Atribua um valor a uma variável e verifique se o número está entre 0 e 10
        double valor = 9;
        if (valor < 10 && valor > 0){
            System.out.println("O valor está entre 0 e 10");
        }
        else{
            System.out.println("O valor está fora do padrão");
        }

        //14. Atribua um valor a uma variável e verifique se é um número par.
        double par = 14;
        if (par % 2 == 0){
            System.out.println("O valor é par");
        }

        //15. Atribua um valor a uma variável e verifique se é um número impar.
        double impar = 11;
        if (impar % 2 != 0){
            System.out.println("O valor é ímpar");
        }

        //16. Atribua um valor a uma variável e verifique se é múltiplo de 3.
        int multiplo3 = 30;
        if (multiplo3 % 3 == 0){
            System.out.println("É multiplo de 3");
        }
        else{
            System.out.println("Não é multiplo de 3");
        }

        //17Atribua um valor a uma variável e verifique se é múltiplo de 5.
        int multiplo5 = 10;
        if (multiplo5 % 5 == 0){
            System.out.println("É multiplo de 5");
        }
        else{
            System.out.println("Não é multiplo de 5");
        }

        //18. Atribua um valor a uma variável e verifique se é múltiplo de 7.
        int multiplo7 = 35;
        if (multiplo7 % 7 == 0){
            System.out.println("É multiplo de 7");
        }
        else{
            System.out.println("Não é multiplo de 7");
        }

        //19. Faça um Programa que peça as 4 notas bimestrais e mostre a média.
        Scanner input = new Scanner(System.in);
        System.out.print("digite a nota 1: ");
        int nota1 = input.nextInt();
        System.out.print("digite a nota 2: ");
        int nota2 = input.nextInt();
        System.out.print("digite a nota 3: ");
        int nota3 = input.nextInt();
        System.out.print("digite a nota 4: ");
        int nota4 = input.nextInt();
        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.print("Sua média é: " + media);

        //20. Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11% para o Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um programa que nos dê:
        System.out.print("Quando você ganha por hora: ");
        double valorHora = input.nextDouble();
        System.out.print("Quantas horas você trabalha por mês: ");
        double horasTrabalhadas = input.nextDouble();

        double salarioBruto = valorHora * horasTrabalhadas;
        System.out.print("Salário bruto: " + salarioBruto);
        double impostoDeRenda = salarioBruto * 0.11;
        System.out.print("Imposto de renda (11%): " + impostoDeRenda);
        double inss = salarioBruto * 0.08;
        System.out.print("INSS (8%): " + inss);
        double sindicato =  salarioBruto * 0.05;
        System.out.print("Sindicato (5%): " + sindicato);
        double salarioLiquido = salarioBruto - impostoDeRenda - inss - sindicato;
        System.out.print("Salario Liquido: " + salarioLiquido);





    }
}
