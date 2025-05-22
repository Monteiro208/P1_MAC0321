package biblioteca;

import java.time.LocalDate;

public class Emprestimo {
    private LocalDate dataDeEmprestimo;
    private LocalDate dataDeRetorno;
    private LocalDate dataDeDevolucao;

    public Emprestimo(LocalDate dataDeEmprestimo, LocalDate dataDeRetorno, LocalDate dataDeDevolucao){

        this.dataDeEmprestimo = dataDeEmprestimo;
        this.dataDeRetorno = dataDeRetorno;
        this.dataDeDevolucao = dataDeDevolucao;
    }
    
    public LocalDate dataDeEmprestimo() {return dataDeEmprestimo; }
    public LocalDate dataDeRetorno() {return dataDeRetorno; }
    public LocalDate dataDeDevolucao() {return dataDeDevolucao; }
}
