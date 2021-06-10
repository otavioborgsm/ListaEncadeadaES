public class Cachorro {
    String nome;
    String raca;
    int idade;
    Cachorro proximo;

    Cachorro(String n, String r, int i){
        this.nome = n;
        this.raca = r;
        this.idade = i;
    }

    Cachorro (String n){
        this.nome = n;
    }

    public void mostrar(){
        System.out.println("\nNome: "+nome);
        System.out.println("Raça: "+raca);
        System.out.println("Idade: "+idade);
    }

    public Cachorro getProximo() {
        return proximo;
    }

    public void setProximo(Cachorro proximo) {
        this.proximo = proximo;
    }

    public String getNome() {
        return nome;
    }


}
