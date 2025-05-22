package biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Interface {
        public static void main(String[] args){
        List<Cadastro> cadastros = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número de qual funcionalidade deseja acessar: Cadastrar um novo usuário(1); Cadastrar um Livro(2); Cadastrar novo emprestimo(3); Renovar Emprestimo(4), Registrar devolução(5); Listar usuarios com emprestimos atrasados(6)");

        int funcionalidade = Integer.parseInt(scanner.nextLine());

        switch (funcionalidade){
            case (1):
            CadastroCliente cliente = new CadastroCliente();
            System.out.println("Digite seu numero do RG,CPF ou Passaporte");
            Cliente.numeroDeRegistroPessoal = Integer.parseInt(scanner.nextLine());
            cadastros.add(Cliente);
            break;

            case (2):

            break;

            case (3):

            break;
        }
        
        scanner.close();
    }
    
}
