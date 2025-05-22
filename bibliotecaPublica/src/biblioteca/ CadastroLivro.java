package biblioteca;

public class CadastroLivro extends Cadastro {
    private String titulo;
    private String autor;
    private Boolean isbn;
    private int anoDePublicacao;
    private int numeroDePaginas;
    private int identificador;

    public CadastroLivro(int numeroDeIdentificacao, String titulo, String autor, Boolean isbn, int anoDePublicacao, int numeroDePaginas){
        super(numeroDeIdentificacao);
        this.titulo = titulo;
        this.isbn = isbn;
        this.anoDePublicacao = anoDePublicacao;
        this.numeroDePaginas = numeroDePaginas;
        this.identificador = identificador;
    }

    public String gettitulo() {return titulo; }
    public Boolean getisbn() {return isbn; }
    public int getanoDePublicacao() {return anoDePublicacao; }
    public int getnumeroDePaginas() {return numeroDePaginas; }
    public int getidentificador() {return identificador; }
    
}
