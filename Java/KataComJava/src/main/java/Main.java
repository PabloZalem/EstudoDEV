public class Main {
    public static void main(String[] args) {
        CriarUmaPilha pilha = new CriarUmaPilha();
        pilha.push(34);
        pilha.push(314);
        pilha.push(1);
        pilha.push(2);
        pilha.push(3);
        System.out.println(pilha.isEmpty());
        System.out.println(pilha.isFull());
        System.out.println(pilha.capacidade);
        System.out.println(pilha.peek());
        System.out.println(pilha.pop());
    }
}
