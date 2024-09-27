//Classe
import java.util.UUID;

public class Aluno extends Pessoa{

    //Atributo
    private String matricula;

    public Aluno(String nome, String nacionalidade, String naturalidade){
        super(nome, nacionalidade, naturalidade);
        matricula = UUID.randomUUID().toString();
    }
    public void atualizarID(){
        if (this.identificador.isBlank())
            this.identificador = UUID.randomUUID().toString();
        else
        System.out.println("ERRO: Codigo matricula ja existente!"); 
    }

}
