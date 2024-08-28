
//--definindo a classe--//
public class Endereco {
    private String nome_rua;
    private int numero;
//--Definindo os atrobutos--//    
public Endereco(String nome_rua, int numero){
    this.setNome_rua(nome_rua);
    this.numero=numero;
}
//--cirnado metodo--//
private void setNome_rua(String nome_rua) {
    // TODO Auto-generated method stub
    this.nome_rua = nome_rua;
}    
public String getNomeRua(){
    return this.nome_rua;
}
private void setNumero(int numero){
    this.numero = numero;
}
public int getNumero(){
    return this.numero;    
    }
    //--Para testar se a classe está correta, acrescentamos a função "main" dentro da classe Endereco da seguinte forma--//

    public static void main(String[] args) {
        Endereco ender = new Endereco("rua X", 7);
        System.out.println(ender.getNomeRua()+" , "+ender.getNumero());
    }
}
