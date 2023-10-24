import java.util.Stack;

public class CriarUmaPilha {
    int topo;
    int capacidade;
    int[] pilha;

    public CriarUmaPilha() {
        topo = -1;
        capacidade = 10;
        pilha = new int[capacidade];
    }

    public boolean isEmpty(){
        return topo == -1;
    }

    public boolean isFull(){
        return topo == capacidade -1;
    }

    public int push(int data){
        if (isFull()){
            System.out.println("Pilha esta cheia");
        }
        return pilha[++topo] = data;
    }

    public int pop(){
        if (isEmpty()){
            System.out.println("Pilha está vazia");
        }
        return pilha[topo--];
    }

    public int peek(){
        return pilha[topo];
    }
}
