import java.util.Calendar;

public class Pessoa {
    private static final int YEAR = 0;
    private static final int MONTH = 0;
    private static final int DATE = 0;
    //-- Definindo os Atributos--//
    private String nome;
    private int idade;
    private Calendar data_nascimento;
    private long CPF;
    private Endereco endereco;    
    
    //--Definindo Metodos--//
    public Pessoa(String nome, Calendar data_nascimento, long CPF, Endereco endereco){
        this.nome = nome;
        this.data_nascimento = data_nascimento;
        this.CPF = CPF;
        this.endereco = endereco;
        atualizarIdade();
    }
    protected void atualizarNome(String nome){
        this.nome = nome;
    }
    protected String recuperarNome(){
        return this.nome;
    }
    protected void atualizarIdade(){
        this.idade = calcularIdade();
    }
    protected int recuperarIdade(){
        return this.idade;
    }
    protected void atualizarCPF(long CPF){
        this.CPF = CPF;
    }
    protected long recuperarCPF(){
        return this.CPF;
    }
    protected void atualizarEndereco(Endereco endereco){
        this.endereco = endereco;
    }
    protected Endereco recuperarEndereco(){
        return this.endereco;
    }
    private int calcularIdade(){
        int lapso;
        Calendar hoje = Calendar.getInstance();
        lapso = hoje.get(YEAR) - data_nascimento.get(YEAR);
        if ((data_nascimento.get(MONTH) > hoje.get(MONTH)) || ( data_nascimento.get(MONTH)) == 
        hoje.get(MONTH) && data_nascimento.get(DATE) > hoje.get(DATE))   
            lapso--;
            return lapso;
    } 

}
