import java.io.StreamCorruptedException;

public class arrays {
    public static void main(String[] args) {
        int [] id = {1,2,3,4,5,6,7,8,9,10};
        String [] name ={"John", "Jane", "Doe", "Smith"} ;       
        int anum = id.length;
        int indexnum =id[5];

        int namelength =name.length;
        String indexname = name[3];
        System.out.println("The length of the array is: " + anum);
        System.out.println("The value at index 5 is: " + indexnum);
        System.out.println("The length of the name array is: " + namelength);
        System.out.println("The value at index 3 is: " + indexname);

        // Changing or adding values in string array
        name[2] = "Alice";
        System.out.println("The updated value at index 2 is: " + name[2]);
    }

}
