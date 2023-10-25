public class Pilha {
    int topo;
    int capacidade;
    int[] elemento;

    public Pilha() {
        topo = -1;
        capacidade = 10;
        elemento = new int[capacidade];
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
        return elemento[++topo] = data;
    }

    public int pop(){
        if (isEmpty()){
            System.out.println("Pilha está vazia");
        }
        return elemento[topo--];
    }

    public int peek(){
        return elemento[topo];
    }
}
