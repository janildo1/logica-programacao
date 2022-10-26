package exemplos.exemplosArray;

public class Exemplo00 {
    public static void main(String[] args) {
        //array inicia da posição 0
        String[] pessoas = {"Chaves", "Seu Madruga", "Dona Florinda", "Chiquinha"};
        System.out.println(pessoas.length);
        System.out.println("laço for>>");
        for (int i = 0; i < pessoas.length; i++){
            String pessoa = pessoas[i];
            System.out.println(pessoa);

        }
        pessoas[0] = "Kiko";
        //foreach
        System.out.println("laço foreach >>");
        for(String pessoa : pessoas){
            System.out.println(pessoa);
        }
        System.out.println("Laço for incremental >>");
        for(int i = pessoas.length-1; i > 0; i--){
            String pessoa = pessoas[i];
            System.out.println(pessoa);
        }

    }
    
}
