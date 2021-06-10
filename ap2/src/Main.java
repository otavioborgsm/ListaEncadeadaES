import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int resp;
        Scanner tc = new Scanner(System.in);

        Lista listaEncadeada = new Lista();

        do {
            System.out.println("\nSelecione a operação:\n1 - Adicionar um cachorro\n2 - Adicionar um cachorro na posição indicada. \n3 - Remover cachorro por nome\n4 - Remover cachorro por posição \n5 - Retorna a posição em que o cachorro está na lista \n6 - Verifica se a lista está vazia\n7 - Retorna o tamanho da lista\n8 - Exibir cachorros\n9 - Finalizar Sessão");
            resp = tc.nextInt();

            switch (resp){
                case 1:{

                    System.out.println("Informe o nome do cachorro: ");
                    String n = tc.next();

                    System.out.println("Informe a raça do cachorro: ");
                    String r = tc.next();

                    System.out.println("Informe a idade do cachorro: ");
                    int i = tc.nextInt();

                    Cachorro c= new Cachorro(n , r , i);
                    c.mostrar();

                    listaEncadeada.adicionar(c);

                }break;

                case 2:{

                    System.out.println("Informe o nome do cachorro: ");
                    String n = tc.next();

                    System.out.println("Informe a raça do cachorro: ");
                    String r = tc.next();

                    System.out.println("Informe a idade do cachorro: ");
                    int i = tc.nextInt();

                    Cachorro c= new Cachorro(n , r , i);
                    c.mostrar();

                    System.out.println("Informe a posição que deseja adicionar o cachorro: ");
                    int pos = tc.nextInt();

                    listaEncadeada.adicionar(pos,c);

                }break;

                case 3:{

                    System.out.println("Informe o nome do cachorro que deseja remover: ");
                    String nome = tc.next();

                    listaEncadeada.remover(nome);

                }break;

                case 4:{

                    System.out.println("Informe a posição do cachorro que deseja remover: ");
                    int posicao = tc.nextInt();

                    listaEncadeada.remover(posicao);

                }break;

                case 5: {

                    System.out.println("Informe o nome do cachorro: ");
                    String n= tc.next();

                    Cachorro c= new Cachorro(n);

                    System.out.println(listaEncadeada.indexOf(c));

                }break;

                case 6:{System.out.println(listaEncadeada.isEmpty());}break;

                case 7:{System.out.println(listaEncadeada.size());}break;

                case 8:{listaEncadeada.list();}break;

                case 9:{System.out.println("Programa encerrado. Tenha um bom dia!");}break;

                default:{System.out.println("Código invalido!!");}break;

            }

        }while (resp != 9);
    }
}
