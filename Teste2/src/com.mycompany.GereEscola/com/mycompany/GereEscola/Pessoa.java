public class Pessoa{

    //Atributos
    protected String nome, nacionalidade, naturalidade,

    //Metodos
    public Pessoa(String nome, String nacionalidade, String naturalidade){
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.naturalidade = naturalidade;
    }
    protected void atualizarNome(String nome){
        this.nome = nome;
    }
    protected String recuperarNome(){
        return this.nome;
    }
    protected String recuperarNacionalidade(){
        return this.nacionalidade;
    }
    protected String recuperarNaturalidade(){
        return this.naturalidade;
    }
    private String identificador;

    protected void atualizarID(String identificador){
        this.identificador = identificador;
    }
    protected String recuperarID(){
        return this.identificador;
    }
    protected void atualizarID ( String CPF ) {
        if ( validaCPF ( CPF ) )
            this.identificador = CPF;
        else
            System.out.println ( "ERRO: CPF invalido!" );
    }
    protected void atualizarID ( String CNPJ ) {
        if ( validaCNPJ ( CNPJ ) )
            this.identificador = CNPJ;
        else
            System.out.println ( "ERRO: CNPJ invalido!" );
    }
}


