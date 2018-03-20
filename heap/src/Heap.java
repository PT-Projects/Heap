import java.util.ArrayList;
import java.util.Collections;

public class Heap {

    private ArrayList<Integer> list = new ArrayList<>();

    public Heap(){}

    public Heap(Heap h){
        list = h.getList();
    }

    public void insert(int n){
        list.add(n);
        Collections.sort(list);
    }

    public boolean remove(int n){
        return list.remove(Integer.valueOf(n));
    }

    public ArrayList<Integer> getList() {
        return list;
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
