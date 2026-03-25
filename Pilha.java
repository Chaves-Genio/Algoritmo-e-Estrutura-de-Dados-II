import java.util.ArrayList;
public class Pilha {
    private ArrayList<Integer> pilha = new ArrayList<>();

    //Insrção
    public void push(int item){
        pilha.add(item);
    }
    //Remover
    public Integer pop(){
        if(!pilha.isEmpty()){
            return pilha.remove(pilha.size()-1);
        }
        return null;
    }
    //Consultar Topo
    public Integer peek(){
        if (!pilha.isEmpty()){
            return pilha.get(pilha.size()-1);
        }
        return null;
    }
    //Verificar se esta vazia
    public boolean isEmpty(){
        return pilha.isEmpty();
    }

    public static void main(String[] args){
        Pilha pilha = new Pilha();
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);
        pilha.push(40);

        System.out.println("Primeiro Topo(peek): "+pilha.peek());
        System.out.println("Removido(pop): "+pilha.pop());
        System.out.println("Está Vazia: "+pilha.isEmpty());
    }
}