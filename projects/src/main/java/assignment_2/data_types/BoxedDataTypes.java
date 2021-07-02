package assignment_2.data_types;

public class BoxedDataTypes {
    public static void main (String args[]) {
        /*
            Declare your code here!
         */

        Integer i_1 = 0;
        // versus
        int i_2 = 0;

        boolean check1 = (i_2 == i_1.intValue());
        System.out.println(check1);
        boolean check2 = i_2 == i_1;
        System.out.println(check2);
        boolean check3 = i_1.toString().equals(i_2);
        System.out.println(check3);
    }
}
