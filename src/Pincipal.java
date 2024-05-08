import java.io.IOException;
import java.util.Scanner;

public class Pincipal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConsultaCep consultaCep = new ConsultaCep();
        System.out.println("Digite o CEP para consulta:");
        var cep = scanner.nextLine();
        try {
            Endereco novoEndereco = consultaCep.BuscaEndereco(cep);
            System.out.println(novoEndereco);
            GeradorDeArquivo gerador = new GeradorDeArquivo();
            gerador.salvaJson(novoEndereco);
        }catch (RuntimeException | IOException e){
            System.out.println(e.getMessage());
            System.out.println("Finalizando aplicação.");
        }
    }
}