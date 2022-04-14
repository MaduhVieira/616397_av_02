import java.util.Scanner;

public class av02 {
    
    public static void main(String[] args) {

        Scanner console1 = new Scanner(System.in);

        System.out.println("Digite seu Nome: ");
        String nome = console1.nextLine();

        System.out.println("Digite a Data de seu Nascimento: ");
        String nascimento = console1.nextLine();

        System.out.println("Digite sua Altura: ");
        Float altura = console1.nextFloat();

        Pessoa pessoa1 =  new Pessoa();

        pessoa1.setNome(nome);
        pessoa1.setNascimento(nascimento);
        pessoa1.setAltura(altura);

        pessoa1.Imprimir();
    }
}
