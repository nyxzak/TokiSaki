import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GerenciadorImersao gerenciadorImersao = new GerenciadorImersao();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem Vindo ao Tokisaki!");
        String menu = "Escolha uma opção!\n1- Adicionar Registro\n2- Checar tempo total\n3- Fechar";
        System.out.println(menu);
        String opcao = scanner.nextLine();

        while (!opcao.equals("3")) {
            if (opcao.equals("1")) {
                System.out.println("Qual o nome da mídia?");
                String nome = scanner.nextLine();

                System.out.println("Qual o tempo em minutos?");
                int tempo = Integer.parseInt(scanner.nextLine());

                System.out.println("Qual o tipo? Ex: Anime/Visual Novel");
                String tipo = scanner.nextLine();

                RegistrarImersao novoRegistro = new RegistrarImersao();

                novoRegistro.setNome(nome);

                novoRegistro.setTempo(tempo);

                novoRegistro.setTipo(tipo);

                gerenciadorImersao.adicionar(novoRegistro);

                System.out.println("Registro adicionado com sucesso!");
            } else if (opcao.equals("2")) {
                int tempoTotal = gerenciadorImersao.calcularTempoTotal();
                System.out.println(String.format("Tempo total de imersão: %.2f horas.", (tempoTotal / 60.0)));
            }
            System.out.println("\n" + menu);
            opcao = scanner.nextLine();
        }
    }
}
