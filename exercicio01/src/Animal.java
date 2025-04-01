public class Animal {
    String nome;
    int idade;
    String especie;

    void emitirSom() {
        if (especie.equalsIgnoreCase("cachorro")) {
            System.out.println(nome + " diz: Au Au!");
        } else if (especie.equalsIgnoreCase("gato")) {
            System.out.println(nome + " diz: Miau!");
        } else {
            System.out.println(nome + " emite um som desconhecido.");
        }
    }

    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Animal animal2 = new Animal();
        animal1.nome = "Valente";
        animal1.idade = 5;
        animal1.especie = "Cachorro";

        animal2.nome = "Rosinha";
        animal2.idade = 3;
        animal2.especie = "Gato";

        animal1.emitirSom();
        animal2.emitirSom();
    }
}