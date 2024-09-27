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
}


