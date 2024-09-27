public class Aluno{
	//Attribute
	private String matricula, nome, naturalidade;
	//Meted
	public Aluno(String nome, String naturalidade) {
		this.nome=nome;
		this.naturalidade=naturalidade;
	}
	@Override
	public String toString() {
		return String.format("%s(%s)", nome, naturalidade);
	}
    public Object recuperarNaturalidade() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'recuperarNaturalidade'");
    }
}
