/**
 * Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
 */
public class main1 {

    public static void main(String[] args) {

       telBook db = new telBook();

       db.addUser("Федор", "8923543364");
       db.addUser("Антон", "89995464565");
       db.addUser("Антон", "897347897034");

       
        System.out.println(db.get("Антон"));
    }   
}