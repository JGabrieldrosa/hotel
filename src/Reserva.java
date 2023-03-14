import java.util.Scanner;

public class Reserva {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
       System.out.println("*****************************");
       System.out.println("----- Hotel Chameguinho -----");
       System.out.println("*****************************");
        
        String[] quartos = {"Quarto simples", "Quarto duplo", "Quarto de luxo"};
        double[] precos = {100.0, 150.0, 250.0};
        
        System.out.printf("Informe a data de entrada (dd/mm/aaaa): ");
        String dataEntrada = input.nextLine();
        
        System.out.printf("Informe a data de saída (dd/mm/aaaa): ");
        String dataSaida = input.nextLine();
        
        System.out.println("Quartos disponíveis:");
        for (int numeroQuarto = 0; numeroQuarto  < quartos.length; numeroQuarto++) {
        	
            System.out.printf("%d - %s (R$ %.2f)\n", numeroQuarto +1, quartos[numeroQuarto], precos[numeroQuarto]);
        }
        
        System.out.print("Selecione o quarto desejado (1 a " + quartos.length + "): ");
        int selecaoQuarto = input.nextInt();
        
//        if (selecaoQuarto < 1 || selecaoQuarto > quartos.length) {
//        	
//            System.out.println("Opção inválida. Selecione um quarto de 1 a " + quartos.length);
//            System.exit(0);
//        }
        if (selecaoQuarto <= quartos.length || selecaoQuarto >= 1) {
        	
        	 System.out.println("\nReserva realizada com sucesso:");
             System.out.println("Data de entrada: " + dataEntrada);
             System.out.println("Data de saída: " + dataSaida);
             System.out.println("Quarto selecionado: " + quartos[selecaoQuarto - 1]);
             System.out.printf("Preço por diária: R$ %.2f\n", precos[selecaoQuarto - 1]);       	
        } else {
        	
        	System.out.println("Opção inválida. Selecione um quarto de 1 a " + quartos.length);
        }
        
    }
}
