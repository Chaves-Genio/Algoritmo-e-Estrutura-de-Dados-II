import java.util.ArrayList;
public class Pilha {
    private ArrayList<String> pilha = new ArrayList<>();

    //Insrção do elemento(push)
    public void push(String item){
        pilha.add(item);
    }
    //Remover elemento(pop)
    public String pop(){
        if(!pilha.isEmpty()){
            return pilha.remove(pilha.size()-1);
        }
        return null;
    }
    //Consultar elemento no Topo(peek)
    public String peek(){
        if (!pilha.isEmpty()){
            return pilha.get(pilha.size()-1);
        }
        return null;
    }
    //Verificar se esta vazia(isEmpty)
    public boolean isEmpty(){
        return pilha.isEmpty();
    }

    public static void main(String[] args){
        Pilha pilha = new Pilha();
        pilha.push("A");
        pilha.push("B");
        pilha.push("C");
        pilha.push("D");

        System.out.println("Elemento no Topo(peek): "+pilha.peek());
        System.out.println("Removido(pop): "+pilha.pop());
        System.out.println("Está Vazia(isEmpty): "+pilha.isEmpty());
    }
}