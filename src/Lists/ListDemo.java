package Lists;

import java.util.*;

class Student{
    int roll;
    String name;
}

public class ListDemo {

    public static void main(String [] args) {

        Student s1 = new Student();
        s1.roll = 101;
        s1.name = "Ayush";


        //can store only strings
        ArrayList<String> list1 = new ArrayList<String>();

        //can store any type of objects
        ArrayList list2 = new ArrayList();


        list1.add("Piyush");
        list1.add("Kumar");
        list1.add("Piyush");


        list2.add(10);
        list2.add("Student");
        list2.add(s1);
        list2.add(2.32);

        System.out.println("List1 " + list1);
        System.out.println("List2 " + list2);


        //get the elements
        String name = list1.get(1);
        System.out.println("Name " + name);

        Object obj = list2.get(3);
        System.out.println("Chceks " + obj);

        //update the elements
        list1.set(2, "Apple");
        System.out.println("After update" + list1);

        //remove the element
        list1.remove(2);
        System.out.println("After removing" + list1);

        //list1.clear();  ->Remove all

        if (list1.contains("Piyush")) {
            System.out.println("Piyush is present");
        }

        //iterate the List
        Iterator<String> itr = list1.iterator();
        while (itr.hasNext()) {
            String str = itr.next();
            System.out.println(str);
            if (str == "Piyush") {
                itr.remove();
            }
        }
        System.out.println("List1 " + list1);


        //Queues
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        for (int i = 10; i > 0; i--) {
            pq.add(i);
        }

        System.out.println("Queue size " + pq.size());
        System.out.println(pq.peek()); //Head of queue
        pq.poll();//removing the element from queue
        System.out.println("Queue size " + pq.size());
        System.out.println(pq.peek()); //Head of queue


        //Sets
        HashSet<String> hs = new HashSet<String>();
        hs.add("Piyush");
        hs.add("Kumar");
        hs.add("Piyush Kumar");
        hs.add("Piyush");
        System.out.println("Hash set : " + hs);

        TreeSet<String> ts = new TreeSet<String>();
        ts.add("Piyush");
        ts.add("Kumar");
        ts.add("PIYUSH KUMAR");
        ts.add("PIYUSH");
        ts.add("Kumar");
        System.out.println("Tree Set : " + ts);


        ArrayList<String> al = new ArrayList<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ajay");
        ArrayList<String> al2 = new ArrayList<String>();
        al2.add("Ravi");
        al2.add("Vijay");
        al.retainAll(al2);
        System.out.println("iterating the elements after retaining the elements of al2");
        itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }


        TreeSet<String> set = new TreeSet<String>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("E");
        System.out.println("Initial Set: " + set);

        System.out.println("Reverse Set: " + set.descendingSet());

        System.out.println("Head Set: " + set.headSet("C", true));

        System.out.println("SubSet: " + set.subSet("A", false, "E", true));

        System.out.println("TailSet: " + set.tailSet("C", true));




        //Maps
        Map<Integer,String> map=new HashMap<Integer,String>();
        map.put(100,"Amit");
        map.put(101,"Vijay");
        map.put(102,"Rahul");
        //Elements can traverse in any order
        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }


        //Returns a Set view of the mappings contained in this map
        map.entrySet()
                //Returns a sequential Stream with this collection as its source
                .stream()
                //Sorted according to the provided Comparator
                .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
                //Performs an action for each element of this stream
                .forEach(System.out::println);
    }
}
