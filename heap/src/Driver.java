import java.util.Random;

public class Driver {
    public static void main(String[] args) {

        Heap h = new Heap();

        Random r = new Random();

        for (int x = 0; x < 10000; x++){
            h.insert(r.nextInt(1000));
        }

        System.out.println(h.getList());

    }
}
