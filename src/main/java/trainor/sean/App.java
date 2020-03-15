package trainor.sean;

import java.util.*;

public class App {

    public String set() {
        Set<Book> s = new HashSet<Book>();

        Book b1=new Book(0,"Oru", "Sean Trainor",2);
        Book b2=new Book(1,"Happy", "Myric Wilson",124123423);
        Book b3=new Book(2,"Buttz", "Cameron Mostert", 4236);

        s.add(b1);
        s.add(b2);
        s.add(b3);

        for(Book b:s) {
            System.out.println(b.bookID + " " + b.bookName + " " + b.amountOfBooks);
        }
        return b1.bookName;
    }
    public Object mapSean() {
        Map<String, Integer> m = new HashMap<String, Integer>();

        m.put("Sean", 0);
        m.put("Cameron", 2);
        m.put("Myric", 4);

        System.out.println(m);

        //sorted by key

        Map<String, Integer> mSorted = new TreeMap<String, Integer>(m);

        System.out.println(mSorted);

        return m.get("Sean");
    }

    public Object listWork() {

        List a = new ArrayList();

        for (int i = 0; i <= 10; i++) {
            a.add(i);
        }
        System.out.println(a);

        a.add(1, 15);
        a.remove(9);
        System.out.println(a);

        Collections.sort(a);
        System.out.println(a);

        System.out.println("Element at index 9 = " + a.get(9));

        return a.get(9);
    }

    public static void main( String[] args )
    {
        App a2 = new App();

        a2.mapSean();
        a2.listWork();
        a2.set();

        }

 }



