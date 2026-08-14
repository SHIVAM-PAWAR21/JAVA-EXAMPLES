package collection;
import java.util.*;

public class DIgitalLibraryManagementUseCollectins {

    public static void main(String[] args){

        //Task 1 — Create the Collection
        //Collection<String> books = new ArrayList<>();

        Collection<String> books=new ArrayList<>();

        //Task 2 — Add Books
        //Add these books:
        //Java
        //Python
        //C++
        //JavaScript
        //Spring Boot
        //Use only:
        //add()

        books.add("Java");
        books.add("C++");
        books.add("Spring Boot");
        books.add("JS");
        //Task 3 — Display All Books
        //Print them using:
        //enhanced for-loop forEach()
        System.out.println("\nenhanced for-loop");
        for(String str:books){
            System.out.println(str);
        }

        //Iterator
        System.out.println("\nIterator");
        Iterator<String>it=books.iterator();
        while(it.hasNext()){
          System.out.println(it.next());
        }

        //Task 4 — Check Operations
        //Does Java exist?
        System.out.println("Does Java exist?: "+books.contains("Java"));
        //Does Kotlin exist?
        System.out.println("Does Kotlin exist?: "+books.contains("Kotlin"));

        //Total books
        System.out.println("total books: "+books.size());
        //Is collection empty?
        System.out.println("Is collection empty?"+books.isEmpty());

        //Task 5 — Remove Books
        //C++
        books.remove("C++");
        //Print the collection again.
        System.out.println("After removing the C++");
        for(String names:books){
            System.out.println(names);
        }
        //Task 6 — Add Another Collection
        //Create another collection:
        Collection<String> list2=List.of("Marathi","Hindi","English");
        //Merge it into the first collection.
        System.out.println("\n Merge it into the first collection.");
        //Use only:
        //addAll()
        books.addAll(list2);
        for(String str:books){
            System.out.println(str);
        }
        //Task 7 — containsAll()
        //Create another collection:
        //Java
        //Python
        Collection<String> list3=List.of("Java","Python");
        //Check whether the main collection contains both.
        System.out.println("\nCheck whether the main collection contains both: " +books.containsAll(list3));
        System.out.println(books);
        //Task 8 — retainAll()
        //Keep only
        //Java
        //Spring Boot
        //Everything else should disappear.
        System.out.println("\n Keep only Java Spring Boot Everything else should disappear.");
        Collection<String> list4=List.of("Java","Spring Boot");
        books.retainAll(list4);
        System.out.println(books);
        //Task 9 — removeAll()
        //Now remove
        //Python
        books.remove("Python");
        //Task 10 — removeIf()
        //Remove every book whose length is greater than 6.
       System.out.println("\nRemove every book whose length is greater than 6: "+books.removeIf(str->str.length()>6));
       System.out.println(books);
        //Task 11 — Convert to Array
        books.addAll(list2);
        //Convert the collection into:
        //Object[]
        System.out.println("\nConvert the collection into Object[]");
        Object[] obj=books.toArray();
        for(Object o:obj){
            System.out.print(o+" ");
        }
        //String[]
        System.out.println("\nConvert the collection into Object[]");
        String[] string=books.toArray(new String[0]);
       for(String str:string){
           System.out.print(str+" ");
       }
        //Task 12 — Stream
        //Print all books in uppercase.
        System.out.println("\n USE STREAM Print all books in uppercase");
       books.stream().map(String::toUpperCase).forEach(System.out::println);
        //Task 13 — Parallel Stream
        //Print every book.
        System.out.println("\nUSE PARALLEL STREAM Print every book");
        books.parallelStream().forEach(System.out::println);
        // print in order
        System.out.println("\nUSE PARALLEL STREAM Print every book");
        books.parallelStream().forEach(System.out::println);
        //Task 14 — Clear
        //Empty the collection.
        books.clear();
        System.out.println("Empty the collection: " +books);
        //Is Empty?
        System.out.println("Is Empty? : "+books.isEmpty());
    }


}
