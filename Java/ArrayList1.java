import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {

        // Why ArrayList?
        // To work with unspecified size of arrays(like vectors in C++). It's slower than arrays
        // we can't put datatype inside the syntax, it should  be a wrapper class
        // to get an index, we can't do list[x]; here it's written like list.get(x);


        ArrayList<Integer> list = new ArrayList<>(5);

        list.add(13);
        list.add(4123);
        list.add(132);
        list.add(31);
        list.add(133);
        list.add(31);
        list.add(412);
        list.add(123);
        list.add(8646);

        System.out.println(list);
        list.set(0, 10);
        System.out.println(list);
        list.remove(0);
        System.out.println(list);

        
        /*input:
         * for(int i = 0; i < 5; i++) {
         *      list.add(in.nextInt());
         } */

        /*output:
         * for(int i = 0; i < 5; i++) {
         *      System.out.print(list.get[i] + " ");
         }
         OR,
         System.out.println(list) */
    }
}
