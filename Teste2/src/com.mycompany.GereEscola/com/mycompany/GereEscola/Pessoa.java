public class Pessoa{

    //Atributos
    protected String nome, nacionalidade, naturalidade, identificador;
    private Calendar data_inicio_existencia;
    private int idade;
    private Endereco endereco;
    //Metodos
    public Pessoa(String nome, Calendar data_inicio_existencia, String identificador, Endereco endereco, String nacionalidade, String naturalidade){
        this.nome = nome;
        this.data_inicio_existencia = data_inicio_existencia;
        this.identificador = identificador;
        this.endereco = endereco;
        this.nacionalidade = nacionalidade;
        this.naturalidade = naturalidade;
    }
    //--
    public String toString(){
        return "Objeto:" + "\n\t- Classe: " + getClass().getName() + "\n\t- Hash: " + Integer.toHexString(hashCode()) + "\n\t- Nome: " + nome + "\n\t- Identificador: " + identificador;
	}
}


