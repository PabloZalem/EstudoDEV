package queue;

public class Main {
    public static void main(String[] args) {
        Fila fila = new Fila(10);
        System.out.println(fila.empilhamento(10));
        System.out.println(fila.empilhamento(20));
        System.out.println(fila.empilhamento(30));
        System.out.println(fila.empilhamento(40));
        System.out.println(fila.empilhamento(50));
        System.out.println(fila.tamanho());
        System.out.println(fila.peek());
        System.out.println(fila.vazio());
        System.out.println(fila.despilhamento() + " Desempilhando");
        System.out.println(fila.tamanho());
    }
}
