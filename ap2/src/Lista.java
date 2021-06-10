public class Lista {
    Cachorro primeiro;
    Cachorro ultimo;
    int tamanho;


    public boolean adicionar(Cachorro c){
        if (primeiro ==null){
            primeiro =c;
        }else{
            this.ultimo.proximo = c;
        }
        ultimo =c;
        tamanho++;
        return true;
    }



    public void adicionar(int posicao, Cachorro c){
        if(primeiro ==null){
            System.out.println("Posição invalida, adicionado no inicio da lista");
            adicionar(c);
        }else{
            if(posicao>= tamanho){
                adicionar(c);
            }else {
                if (posicao==0){
                    adicionar(c);
                }else {
                    Cachorro dog= primeiro;
                    int pos=0;
                    while (pos<posicao-1){
                        dog=dog.proximo;
                        pos++;
                    }
                    c.proximo=dog.proximo;
                    dog.proximo=c;
                    tamanho++;
                }
            }
        }
    }



    public void remover(int posicao){
        Cachorro anterior = null;
        Cachorro atual = this.primeiro;
        for(int i=0; i < this.tamanho; i++){
            if (i == posicao){
                if (this.tamanho == 1){
                    this.primeiro = null;
                    this.ultimo = null;
                }else if (atual == primeiro){
                    this.primeiro = atual.getProximo();
                    atual.setProximo(null);
                }else if (atual == ultimo){
                    this.ultimo = anterior;
                    anterior.setProximo(null);
                }else{
                    anterior.setProximo(atual.getProximo());
                    atual = null;
                }
                this.tamanho--;
                break;
            }
            anterior = atual;
            atual = atual.getProximo();
        }
    }



    public void remover(String nome){
        Cachorro anterior = null;
        Cachorro atual = this.primeiro;
        for(int i=0; i < this.tamanho; i++){
            if (atual.getNome().equalsIgnoreCase(nome)){
                if (this.tamanho == 1){
                    this.primeiro = null;
                    this.ultimo = null;
                }else if (atual == primeiro){
                    this.primeiro = atual.getProximo();
                    atual.setProximo(null);
                }else if (atual == ultimo){
                    this.ultimo = anterior;
                    anterior.setProximo(null);
                }else{
                    anterior.setProximo(atual.getProximo());
                    atual = null;
                }
                this.tamanho--;
                break;
            }
            anterior = atual;
            atual = atual.getProximo();
        }
    }

    public int indexOf(Cachorro cachorro) {
        Cachorro aux = this.primeiro;
        int index = 0;
        while (aux != null) {
            if(aux.getNome().equals(cachorro.getNome())) {
                return index;
            }
            aux = aux.proximo;
            index += 1;
        }

        return -1;
    }

    public boolean isEmpty(){
        if (this.tamanho >=1){
            return false;
        }else{
            return true;
        }
    }

    public int size() {
        return tamanho;
    }

    public void list(){
        Cachorro dog= this.primeiro;
        if(dog==null){
            System.out.println("Lista vazia");
        }else{
            while (dog!=null){
                dog.mostrar();
                dog= dog.proximo;
            }
        }
    }
}

