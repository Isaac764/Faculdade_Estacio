public class Exemplo {
    public static void main(String[] args){
        HashSet carros = new HashSet();
        carros.add("Sonic");
        carros.add("Celta");
        carros.add("Corsa");
        carros.add("Sonic");
        carros.add("Celta");
        carros.remove("Celta");
        carros.remove("Corsa");
        for (String string : carros){
            System.out.println(string);
        }
    }
}
