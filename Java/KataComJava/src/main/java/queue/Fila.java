package queue;

public class Fila {
    int[] fila;
    int traseira;
    int frente;
    int tamanho;

    public Fila(int tamanhoDoArray){
        fila = new int[tamanhoDoArray];
        traseira = -1;
        frente = -1;
        tamanho = 0;
    }

    public boolean vazio(){
        boolean respostas = false;
        if(tamanho == 0){
            respostas = true;
        }
        return respostas;
    }

    public boolean empilhamento(int elemento){
        boolean respostas = false;
        if(traseira != fila.length - 1){
            traseira++;
            fila[traseira] = elemento;
            tamanho++;
            respostas = true;
        }
        return respostas;
    }

    public int despilhamento(){
        int resposta = 0;
        if(tamanho != 0){
            frente++;
            resposta = fila[frente];
            tamanho--;
        }
        return resposta;
    }

    public int peek(){
        int resposta = 0;
        if(!vazio()){
            resposta = fila[frente + 1];
        }
        return resposta;
    }

    public int tamanho(){
        return tamanho;
    }
}
