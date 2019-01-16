import java.util.ArrayList;
import java.util.List;

public class test {

    public static void main(String[] args){

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Integer[] good = list.toArray(new Integer[0]);

        System.out.println(good.toString());

    }

}
