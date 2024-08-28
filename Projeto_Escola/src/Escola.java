
//--Criando Classe--//
public class Escola{

//--Definindo Atributos--//
//--Private = O usuário ira inserir somente as informações solicitadas--//

private String nome, CNPJ;
private Endereco rua;
private Departamento departamentos [];
private Aluno discente[];
private int nr_discentes , nr_departamentos;
private Object Endereco;  


//--definindo metodo--//
public Escola(String nome , String CNPJ) {
    this.nome = nome;
    this.CNPJ = CNPJ;
    this.departamentos = new Departamento[10];
    this.discente = new Aluno[1000];
    this.nr_departamentos = 0;
    this.nr_discentes = 0;
    this.Endereco = rua;
}

public void criarDepartamento(String nomeDepartamento) {
    if (nr_departamentos <= 10) 
    {
        departamentos[nr_departamentos] = new Departamento (); 
        nr_departamentos++;   
    }else{
        System.out.println( "Não foi possivel criar outro Departamento." );
    }
}
    public void matricularAluno (Aluno novoAluno){
        discente [nr_discentes] = novoAluno;
    }    
public void criarEndereco(String nome_Rua){
    criarEndereco(nome_Rua);
    System.out.println("Nome da Rua " +nome_Rua);


    }
}



