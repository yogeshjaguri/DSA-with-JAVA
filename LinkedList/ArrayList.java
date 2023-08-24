import java.util.ArrayList;

public class ArrayList {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Hello");
        list.add("World");
        list.add("!");
        System.out.println(list);
        System.out.println(list.get(1));
        list.set(1, "Java");
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.contains("Java"));
        System.out.println(list.indexOf("Java"));
        System.out.println(list.isEmpty());
        list.clear();
        System.out.println(list);
        System.out.println(list.isEmpty());
    }
}
