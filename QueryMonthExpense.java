import java.util.Scanner;

public class QueryMonthExpense {

    public static void main(String[] args) {

        String answer = "s";
        while (answer.equals("s")) {
            Scanner input = new Scanner(System.in);
            System.out.println("Entre com o nome do mês de consulta:");
            String selectedMonth = input.nextLine();

            try {
                Float monthValue = Months.valueOf(selectedMonth.toUpperCase()).getValor();
                System.out.printf("O valor gasto no mês de %s é de R$ %.2f. %n",
                        selectedMonth, monthValue);

            } catch (IllegalArgumentException ex) {
                System.out.println("\u001B[31m" + "\nArgumento inválido!.");
                System.out.println("Não use números, acentos ou caracteres especiais...\n" + "\u001B[0m");
            }
            System.out.println("Entre < s > para uma nova consulta.");
            answer = input.nextLine().toLowerCase();
            System.out.println("----------------------------------------------");
        }
    }
}