public class Fisica extends Pessoa {
	//Atributos

	//Métodos
	public Fisica ( String nome , Calendar data_nascimento , String CPF , Endereco endereco , String nacionalidade , String naturalidade ) {
		super ( nome , data_nascimento, CPF , endereco , nacionalidade , naturalidade );
	    atualizarIdade ();
	}
}
