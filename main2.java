// Пусть дан список сотрудников: Иван Иванов, Светлана Петрова, Кристина Белова,
//  Анна Мусина, Анна Крутова, Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов, 
// Мария Федорова, Марина Светлова, Мария Савина, Мария Рыкова, Марина Лугова, Анна Владимирова,
// Иван Мечников, Петр Петин, Иван Ежов. Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. 
// Отсортировать по убыванию популярности. Для сортировки использовать TreeMap.
import java.util.*;

public class main2 {
    /*
    
     */
    public static void main(String[] args) {
        
        HashMap<String, Integer> names = new HashMap<>();
        HashMap<String, String>personal = new HashMap<>();
        int Values;
        String Keys;
    personal.put("Иванов", "Иван");
    personal.put("Петрова", "Светлана");
    personal.put("Белова", "Кристина");
    personal.put("Мусина", "Анна");
    personal.put("Крутова", "Анна");
    personal.put("Юрин", "Иван");
    personal.put("Лыков", "Петр");
    personal.put("Чернов", "Павел");
    personal.put("Чернышов", "Петр");
    personal.put("Федорова", "Мария");
    personal.put("Светлова", "Марина");
    personal.put("Савина", "Мария");
    personal.put("Рыкова", "Мария");
    personal.put("Лугова", "Марина");
    personal.put("Владимирова", "Анна");
    personal.put("Мечников", "Иван");
    personal.put("Петин", "Петр");
    personal.put("Ежов", "Иван");
        for (String name :personal.values()) {
            if (!names.containsKey(name)) {
                if (Collections.frequencypersonal.values(), name) > 1) {
                    names.put(name, Collections.frequencypersonal.values(), name));
                }
            }
        }
        System.out.println(names);
        ArrayList<Integer> values = new ArrayList<Integer>(names.values());
        ArrayList<String> sortedListKeys = new ArrayList<String>(names.keySet());
        for (int i = 0; i < values.size(); i++) {
            for (int j = 1; j < values.size(); j++) {
                if (values.get(j) > values.get(j-1)) {
                    Values = values.get(j-1);
                    values.set((j-1),values.get(j));
                    values.set((j),Values);
                    Keys = sortedListKeys.get(j-1);
                    sortedListKeys.set((j-1),sortedListKeys.get(j));
                    sortedListKeys.set((j),Keys);
                }
            }
        }
        for (int i = 0; i < values.size(); i++) {
            System.out.println("Имя "/+ sortedListKeys.get(i) + "/ повторяется = "+ values.get(i));
        }
       
    }
}