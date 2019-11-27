import java.util.*;

public class Main {
    public static void main(String[] args) {
        goal1();
        goal2();
    }
    private static void goal1() {
        Map<String, Integer> hm = new HashMap<>();
        String[] words = {
                "стол", "стул", "кофе", "чай", "кот", "робот", "стол",
                "стул", "кофе", "чай", "кот", "телефон","дерево", "кот"
        };
        for (int i = 0; i < words.length; i++) {
            if (hm.containsKey(words[i]))
                hm.put(words[i], hm.get(words[i]) + 1);
            else
                hm.put(words[i], 1);
        }
        System.out.println(hm);
    }
    private static void goal2() {
        folder directory = new folder();

        directory.add("Дмитрий", "812345678");
        directory.add("Павел", "8111111111");
        directory.add("Саша", "8222222222");
        directory.add("Ирина", "8333333333");
        directory.add("Иван", "844444444");
        directory.add("Иван", "855555555");
        directory.add("bobov", "89923231999");
        directory.add("smetanov", "8888123113");
        directory.add("igoryan", "8324325234");

        System.out.println(directory.get("Дмитрий"));
        System.out.println(directory.get("Павел"));
        System.out.println(directory.get("Саша"));
        System.out.println(directory.get("Ирина"));
        System.out.println(directory.get("Иван"));

    }
}
class folder {
    private Map<String, List<String>> catalog = new HashMap<>();
    private List<String> phonenumber;

    public void add(String surname, String phone_number) {
        if (catalog.containsKey(surname)) {
            phonenumber = catalog.get(surname);
            phonenumber.add(phone_number);
            catalog.put(surname, phonenumber);
        } else {
            phonenumber = new ArrayList<>();
            phonenumber.add(phone_number);
            catalog.put(surname, phonenumber);
        }
    }

    public List<String> get(String surname) {
        return catalog.get(surname);
    }

}


