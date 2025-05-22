package biblioteca;

public abstract class Cadastro {
    protected int numeroDeIdentificacao;

    public Cadastro(int numeroDeIdentificacao){
        this.numeroDeIdentificacao = numeroDeIdentificacao;
    }

    public int getnumeroDeIdentificacao() {return numeroDeIdentificacao;}
    
}
