import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Conta poupanca = new ContaPoupanca();
        Conta corrente = new ContaCorrente();

        Scanner input = new Scanner(System.in);

        int option, optionType;
        double valorInformado;

        System.out.println("---Ola, bem vindo ao TesteBanco---");
        System.out.println("Escolha o tipo de conta: \n1 - Poupanca \n2 - Corrente \n------------------");
        optionType = input.nextInt();

        if (optionType == 1) {

            System.out.printf("Saldo Atual: RS: %.2f", poupanca.getSaldoInicial());
            System.out.println("\nEscolha uma das opcoes abaixo:");
            System.out.println("1 - Sacar \n2 - Depositar \n3 - Transferir \n4 - Cancelar \n------------------");
            option = input.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Informe o valor do saque: ");
                    valorInformado = input.nextDouble();
                    poupanca.sacar(valorInformado);
                    System.out.println("----EXTRAT0----");
                    poupanca.imprimirExtrato();
                    break;
                case 2:
                    System.out.print("Informe o valor do deposito: ");
                    valorInformado = input.nextDouble();
                    poupanca.depositar(valorInformado);
                    System.out.println("----EXTRAT0----");
                    poupanca.imprimirExtrato();
                    break;
                case 3:
                    System.out.print("Informe o valor da transferencia: ");
                    valorInformado = input.nextDouble();
                    corrente.transferir(valorInformado, poupanca);
                    System.out.println("----EXTRAT0----");
                    poupanca.imprimirExtrato();
                    corrente.imprimirExtrato();
                    break;
                case 4:
                    System.out.println("--FINALIZADO COM SUCESSO--");
                    break;
            }


        } else if (optionType == 2) {
            System.out.printf("Saldo Atual: RS: %.2f", corrente.getSaldoInicial());
            System.out.println("\nEscolha uma das opcoes abaixo:");
            System.out.println("1 - Sacar \n2 - Depositar \n3 - Transferir \n4 - Cancelar \n------------------");
            option = input.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Informe o valor do saque: ");
                    valorInformado = input.nextDouble();
                    poupanca.sacar(valorInformado);
                    System.out.println("----EXTRAT0----");
                    poupanca.imprimirExtrato();
                    break;
                case 2:
                    System.out.print("Informe o valor do deposito: ");
                    valorInformado = input.nextDouble();
                    poupanca.depositar(valorInformado);
                    System.out.println("----EXTRAT0----");
                    poupanca.imprimirExtrato();
                    break;
                case 3:
                    System.out.print("Informe o valor da transferencia: ");
                    valorInformado = input.nextDouble();
                    corrente.transferir(valorInformado, poupanca);
                    System.out.println("----EXTRAT0----");
                    poupanca.imprimirExtrato();
                    corrente.imprimirExtrato();
                    break;
                case 4:
                    System.out.println("--FINALIZADO COM SUCESSO--");
                    break;
            }

        }
    }
}