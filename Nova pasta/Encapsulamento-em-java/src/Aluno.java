import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Aluno {
    private String Nome;
    private int idade;
    private String turma;
    private String dataMatricula;

    public Aluno(){
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/YYYY");
        Date date = new Date();
        dataMatricula = dateFormat.format(date);
    }

    public void setNome(String nome){
        this.Nome = nome;
    }

    public String getNome(){
        return this.Nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
        defineTurma();
    }

    public int getIdade(){
        return this.idade;
    }

    public String getTurma(){
        return this.turma;
    }

public String getDataMatricula(){
    return this.dataMatricula;
}

private void defineTurma(){
    if (this.idade < 18)
     this.turma = "adolescente";
    else if (this.idade < 40) {
            this.turma = "Jovem";
         if (this.idade < 60)
            this.turma = "adulto";
        else this.turma = "idoso";
        } 
    }

}
