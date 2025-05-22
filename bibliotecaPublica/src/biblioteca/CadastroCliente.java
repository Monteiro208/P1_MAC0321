package biblioteca;

import java.time.LocalDate;

public class CadastroCliente extends Cadastro {
    private int numeroDeRegistroPessoal;
    private String name;
    private LocalDate dataDeNascimento;
    private String endereco;
    private Boolean estaImpedido;

    public CadastroCliente(int numeroDeIdentificacao, int numeroDeRegistroPessoal, String name, LocalDate dataDeNascimento, String endereco){
        super(numeroDeIdentificacao);
        this.numeroDeRegistroPessoal = numeroDeRegistroPessoal;
        this.name = name;
        this.dataDeNascimento = dataDeNascimento;
        this.endereco = endereco;
        this.estaImpedido = estaImpedido;
    }

    public int getnumeroDeRegistroPessoal() {return numeroDeRegistroPessoal; }
    public String getname() {return name; }
    public LocalDate getdataDeNascimento() {return dataDeNascimento; }
    public String getendereco() {return endereco; }
    public Boolean getestaImpedido() {return estaImpedido; }
    
}
