import java.util.*;

public class Main {
    public static void main(String[] args) {
//        OurGenericList<Integer> list = new OurGenericList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);

//        Iterator<Integer> integerIterator = list.iterator();
//        while (integerIterator.hasNext()) System.out.println(integerIterator.next());

        /*
        Above code can be implemented in single line of code in this way:
         */
//        for(int x: list) System.out.println(x);


        /*
          ----Working with ArrayLists
         */

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

//        System.out.println(list);

        //to update element at specific index
        list.set(1, 100);
//        System.out.println(list);
        //creating list from other lists

        List<Integer> list1 = new ArrayList<>(list);
        list1.add(1000);
        list1.add(2000);
        list1.add(3000);
        list1.add(4000);

        // The items added will not affect the previous list on which this new list is being created. These elements will only be added in new list
//        System.out.println("list1 = " + list1);

        //  Taking Sub List from existing list
//        System.out.println("Sub List = "+list1.subList(0, 2)); // The output will be:  1, 2 Note: index 2 will not be returned till the n-1 values.
        //  This sub list only provides the view of the main list and if we modify this sub list we will eventually be changing the main list.

        List<Integer> list2 = new LinkedList<>();
        ListIterator<Integer> integerListIterator = list2.listIterator();
        list2.add(1);
        list2.add(2);
        list2.add(3);
//        System.out.println(integerListIterator.next()); // 1
//        System.out.println(integerListIterator.next()); // 2
//        System.out.println(integerListIterator.previous()); // 2

        // To Convert the list into an Array, use below procedure
//        Integer[] integers = list2.toArray(new Integer[list2.size()]); // creates an array of size equal to list size


        // Implementation of Normal FIFO Queue
        Queue<Integer> integers = new LinkedList<>();
        integers.offer(2);
        integers.offer(4);
        integers.offer(6);
        integers.offer(8);

//        System.out.println(integers.peek());
//        System.out.println(integers.poll());
//        System.out.println(integers.peek());

//        Implementing Stack using Stack Class

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
//        while (!stack.isEmpty()) {
//            System.out.println("Stack Peek = "+stack.peek());
//            System.out.println("Stack POP = "+stack.pop());
//        }

        //Implementing PriorityQueue

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer(1);
        priorityQueue.offer(2);
        priorityQueue.offer(3);
        priorityQueue.offer(4);
        priorityQueue.offer(5);

//        while (!priorityQueue.isEmpty()) {
//            System.out.println("priorityQueue.poll() = " + priorityQueue.poll());
//        }

        List<StudentMarks> studentMarks = new ArrayList<>();
        studentMarks.add(new StudentMarks(20,20));
        studentMarks.add(new StudentMarks(30,30));
        studentMarks.add(new StudentMarks(40,40));
        studentMarks.add(new StudentMarks(50,50));
        studentMarks.add(new StudentMarks(60,60));
        studentMarks.add(new StudentMarks(70,70));



        // PriorityQueue can also take collection and build heap on the collection passed down to it.
//        PriorityQueue<StudentMarks> students = new PriorityQueue<>(studentMarks);
        // Above line of code will throw an Exception of type "java.lang.ClassCastException"
        // TO solve this we come to comparable interface and comparators in Collection Framework

        /*
        To use Comparable interface we need the class to implement the Comparable interface and give
         its implementation to "compareTo()" method.
         So, we are implementing comparable interface on the StudentMarks class.
         */

//        List<StudentMarks> top3 = new ArrayList<>();
//        int index = 0;
//        while (!students.isEmpty()) {
//            if(index==3) break;
//            top3.add(students.poll());
//            index++;
//        }
//        System.out.println("top3 = " + top3);


        // Now Using Comparator Interface, visit CustomeComparator.java class
        // PriorityQueue can also take collection and build heap on the collection passed down to it.
        // Above line of code will throw an Exception of type "java.lang.ClassCastException"
        // TO solve this we come to comparable interface and comparators in Collection Framework

        /*
        To use Comparator interface we need a comparator class to implement the comparator interface and give
         its implementation to "compare()" method.
         So, we are implementing comparable interface on the CustomeComparator Class.
         */

//        PriorityQueue<Integer> pq = new PriorityQueue<>(new CustomeComparator());
        // Now, implementing the above Comparator interface using Lambda Expression
//        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b)-> b-a);
//        pq.offer(1);
//        pq.offer(2);
//        pq.offer(3);
//        pq.offer(4);
//        pq.offer(5);
//
//        //top 2 elements
//        List<Integer> top2 = new ArrayList<>();
//        int index = 0;
//        while (!pq.isEmpty()){
//            if (index == 2) break;
//            top2.add(pq.poll());
//            index ++;
//        }
//        System.out.println("top2 = " + top2);

        // Now, if we want to apply comparator interface method on StudentMarks List the procedure id given below
//
//        List<StudentMarks> studentMarks = new ArrayList<>();
//        studentMarks.add(new StudentMarks(20,20));
//        studentMarks.add(new StudentMarks(30,30));
//        studentMarks.add(new StudentMarks(40,40));
//        studentMarks.add(new StudentMarks(50,50));
//        studentMarks.add(new StudentMarks(60,60));
//        studentMarks.add(new StudentMarks(70,70));
//        PriorityQueue<StudentMarks> students = new PriorityQueue<>((o1, o2)->{
//            return o1.getPhysics() - o2.getPhysics();
//        });
//        for(StudentMarks marks: studentMarks){
//            students.add(marks);
//        }
//
//        System.out.println("students = " + students);

//        HashSet: This class implements the Set interface using a hash table. It does not guarantee the order of its elements.
//        If we implement the 'LinkedHashSet' then the insertion order is maintained.
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(6);
        set1.add(7);
        set1.add(8);

        Set<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);
        set2.add(5);

//        System.out.println("set1 = " + set1);
//        System.out.println("set2 = " + set2);

        set1.retainAll(set2);
//        System.out.println("set1 = " + set1);
//        System.out.println("set2 = " + set2);


        // Now, creating Set of StudentMarks
//        Set<StudentMarks> students = new HashSet<>(studentMarks);

        // if 'students' set contains the object having 70, 70 record, but it will return 'false' for below line of code
//        System.out.println(students.contains(new StudentMarks(70, 70)));
        /*
        Above behaviour is because .contains() method is comparing the HashCode of each object, which is the memory address of each object.
        So, to compare and find the result in Set using the .contains() method, we need to implement the hashCode() and equals() methods
        of object class. After implementing the hashCode() and equals() methods now it is returning true.
        */

//      Moving Towards TreeSet
//        Set<StudentMarks> marks = new TreeSet<>();
//        marks.add(new StudentMarks(70, 80));
//        marks.add(new StudentMarks(30, 10));
//        marks.add(new StudentMarks(10, 30));
//        marks.add(new StudentMarks(100, 38));
//        marks.add(new StudentMarks(40, 88));
//        marks.add(new StudentMarks(97, 19));
//
////      Output will be student marks in sorted order, based on the compareTo() method of comparable interface
//        for(StudentMarks mark: marks) System.out.println("mark = " + mark);

//        For sorting the studentMarks based on comparator interface we can pass the lambda expression representing the comparator interface
//        Set<StudentMarks> marks = new TreeSet<>((a, b)->b.getMath()-a.getMath());

//        We can implement the above code using method reference if we are doing straight calculations like: a.getMath()-b.getMath()
//        Set<StudentMarks> marks = new TreeSet<>(Comparator.comparingInt(StudentMarks::getPhysics));
        /*
        Comparator.comparingInt(StudentMarks::getPhysics) creates a comparator by specifying the property physics of the StudentMarks class to compare.
        The comparingInt method is a static method in the Comparator class that takes a function as a parameter.
        StudentMarks::getPhysics is a method reference that refers to the getPhysics method of the StudentMarks class. It represents the getter method
        for the physics property.
        The method reference is passed as an argument to the comparingInt method, which uses it to generate a comparator that compares the physics
        property of StudentMarks objects.
        The resulting comparator is then used by the TreeSet constructor to create a sorted set of StudentMarks objects. The set will be sorted in
        ascending order based on the physics property.
        By using method references, the code achieves a concise and readable way of specifying the property to be used for comparison without explicitly
        writing a lambda expression or implementing a separate Comparator class.
         */

//        marks.add(new StudentMarks(70, 80));
//        marks.add(new StudentMarks(30, 10));
//        marks.add(new StudentMarks(10, 30));
//        marks.add(new StudentMarks(100, 38));
//        marks.add(new StudentMarks(40, 88));
//        marks.add(new StudentMarks(97, 19));

//      Output will be student marks in sorted order, based on the compareTo() method of comparable interface
//        for(StudentMarks mark: marks) System.out.println("mark = " + mark);


//      --------------------------------IMPLEMENTING NAVIGABLE SET INTERFACE --------------------------------
//        NavigableSet<Integer> set = new TreeSet<>();
//        set.add(8);
//        set.add(3);
//        set.add(1);
//        set.add(0);
//        for (Integer i : set){
//            System.out.println("i = " + i);
//        }
//        System.out.println(" ");
//        System.out.println(set.ceiling(1)); // 1
//        System.out.println(set.ceiling(2)); // 3
//        System.out.println(set.floor(4)); // 3
//        System.out.println(set.lower(4)); // 3
//        System.out.println(set.lower(1)); // 0
//        System.out.println(set.higher(0)); // 1

//      --------------------------------IMPLEMENTING MAP INTERFACE --------------------------------
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("some1",1);
        map.put("some2",2);
        map.put("some3",3);
        map.put("some1",1); // Will be ignored
//        System.out.println(map.get("some1")); // 1
        System.out.println(map.get("some5")); // null
//        To handle NULL values we can use another method
        System.out.println(map.getOrDefault("some5", 5)); // 5
        System.out.println(map.getOrDefault("some3", 5)); // 3
//        Checking if key exists or not. If not then, create a new value in the map
        map.computeIfAbsent("some5", f -> 5);  // First it checks if key exists, if not then create a new value in the map

//        Mapping over the key-value pairs in the Map. Map.Entry function will convert the key-value pairs into iterable object
//        that we can use to iterate over the values
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries){
            System.out.println("entry.getKey() = " + entry.getKey()+" entry.getValue() = " + entry.getValue());
        }

//        Iterating over the keys
        Set<String> keys = map.keySet();
        for (String key : keys) System.out.println("key = " + key);

//      --------------------------------IMPLEMENTING NAVIGABLE MAP INTERFACE --------------------------------
//        NavigableMap<Integer, String> navigableMap = new TreeMap<>();
//        navigableMap.put(1, "some1");
//        navigableMap.put(2, "some2");
//        navigableMap.put(3, "some3");
//        navigableMap.put(4, "some4");
//        navigableMap.put(5, "some5");
//
//        Set<Map.Entry<Integer, String>> navigableMapEntries = navigableMap.entrySet();
//        for (Map.Entry<Integer, String> entry : navigableMapEntries){
//            System.out.println("entry.getKey() = " + entry.getKey()+" entry.getValue() = " + entry.getValue());
//        }

//        Now, using our own comparison method for sorting the entries in TreeMap. Since, it is sorting the keys not the values
//        so, we can pass the lambda expression and reverse the order of the entries
        NavigableMap<Integer, String> navigableMap = new TreeMap<>((a, b)-> b-a);
        navigableMap.put(1, "some1");
        navigableMap.put(2, "some2");
        navigableMap.put(3, "some3");
        navigableMap.put(4, "some4");
        navigableMap.put(5, "some5");

        Set<Map.Entry<Integer, String>> navigableMapEntries = navigableMap.entrySet();
        for (Map.Entry<Integer, String> entry : navigableMapEntries){
            System.out.println("entry.getKey() = " + entry.getKey()+" entry.getValue() = " + entry.getValue());
        }
//        Using NavigableMap functions along with Map Interface functions.
        System.out.println(navigableMap.ceilingEntry(3).getValue());

//      --------------------------------IMPLEMENTING SORTING METHODS--------------------------------
        Integer arr[] = new Integer[]{6,5,4,3,2,1,0};
        Arrays.sort(arr); // Sorted Array returned
//        another approach is
        Arrays.sort(arr,  // Passing Lambda Expression
                (a, b)->b-a); // Sorted Array in reverse order returned






    }
}