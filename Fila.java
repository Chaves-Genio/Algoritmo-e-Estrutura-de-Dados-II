import java.util.ArrayList;
public class Fila {
    private ArrayList<Integer> fila = new ArrayList<>();

    //Insrção
    public void enqueue(int item){
        fila.add(item);
    }
    //Remover
    public Integer dequeue(){
        if(!fila.isEmpty()){
            return fila.remove(0);
        }
        return null;
    }
    //Consultar primeiro elemento
    public Integer front(){
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
        fila.enqueue(10);
        fila.enqueue(20);
        fila.enqueue(30);
        fila.enqueue(40);
        System.out.println("Primeiro Elemento(Front): "+fila.front());
        System.out.println("Removido(Dequeue): "+fila.dequeue());
        System.out.println("Está Vazia: "+fila.isEmpty());
    }
}