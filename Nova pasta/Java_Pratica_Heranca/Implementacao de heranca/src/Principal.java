import java.util.Calendar;

public class Principal {

    //--AStributos--//
    private static Aluno aluno;
    private static Endereco endereco;
    //--metodo--//
    public static void main(String args[]){
        Calendar data = Calendar.getInstance();
        data.set(1980, 10, 23);
        endereco = new Endereco();
        endereco.definirPais("Brasil");
        endereco.definirUF("RJ");
        endereco.definirCidade("Rio de Janeiro");
        endereco.definirRua("Avenida Rio Branco");
        endereco.definirNumero("156A");
        endereco.definirCEP(20040901);
        endereco.definirComplemento("Bloco 03 - Ap 20.005");
        aluno = new Aluno ("Marco Antonio" , data, 901564098 , endereco);
        aluno.atualizarIdade();
        aluno.recuperarIdade();
    }
 
}
