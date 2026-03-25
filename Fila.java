import java.util.ArrayList;
public class Fila {
    private ArrayList<String> fila = new ArrayList<>();

    //Inserir elemento(enqueue)
    public void enqueue(String item){
        fila.add(item);
    }
    //Remover elemento(dequeue)
    public String dequeue(){
        if(!fila.isEmpty()){
            return fila.remove(0);
        }
        return null;
    }
    //Consultar primeiro elemento(front)
    public String front(){
        if (!fila.isEmpty()){
            return fila.get(0);
        }
        return null;
    }
    //Verificar se esta vazia
    public boolean isEmpty(){
        return fila.isEmpty();
    }

    public static void main(String[] args){
        Fila fila = new Fila();
        fila.enqueue("A");
        fila.enqueue("B");
        fila.enqueue("C");
        fila.enqueue("D");
        System.out.println("Primeiro Elemento(Front): "+fila.front());
        System.out.println("Removido(Dequeue): "+fila.dequeue());
        System.out.println("Está Vazia: "+fila.isEmpty());
    }
}