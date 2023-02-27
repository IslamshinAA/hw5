/*Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class telBook {

    private Map<String, List<String>> Telbook = new HashMap<>();
    private List<String> phoneList;

    public void addUser(String name, String num){
        if (Telbook.containsKey(name)) {
            phoneList = Telbook.get(name);
            phoneList.add(num);
            Telbook.put(name, phoneList);
        } else {
            phoneList = new ArrayList<>();
            phoneList.add(num);
            Telbook.put(name, phoneList);
        }
    }

    public List<String> get(String name) {
        return Telbook.get(name);
    }
}