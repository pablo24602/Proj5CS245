public class Test {

    public static String toString(SortedArrayList j) {
        if (j.size() == 0) {
            return "()";
        }
        String answer = "(";

        for (int a = 0; a < j.size(); a++) {
            answer = answer + j.get(a);
            if (a < j.size() - 1) {
                answer = answer + ", ";
            } else {
                answer = answer + ")";
            }
        }
        return answer;
    }

    public static String toString(SortedLinkedList j) {
        String result = "(";
        for (int x = 0; x < j.size(); x++) {
            result = result + j.get(x);
            if (x < j.size() - 1) {
                result = result + ", ";
            } else {
                result = result + ")";
            }
        }
        return result;
    }


    public static void main(String[] args)
    {
        // Let's test all the possible cases!
        //SortedArrayList first.

        //Empty at First: does it return size 0 and return error when we try to find the value at any index?
        //Yep. Feel free to try any of the other positions in the get function.
        //uncomment the fourth line in order to check for the error

        SortedArrayList<String> j = new SortedArrayList<String>();
        System.out.println("size is : " + j.size());
        System.out.println("Next line of code will return an error.");
        //System.out.println("error? " + j.get(2));


        //Does it add correctly?
        j.add("hi");
        j.add("ai");
        j.add("zi");
        j.add("zz");
        System.out.println("size is now: " + j.size()+ " (should be 4.)");
        System.out.println("Should return 'zi': " + j.get(2));


        //Was it kept in order though? The list printed should be in order.

        System.out.println("this should print in alphabetical order:");
        System.out.println(toString(j));
        System.out.println();

        //Should be able to detect invalid positions. Uncomment the line below to check for an exception there.

        //System.out.println("Should throw an exception" + j.get(10));

        //Should remove correctly.

        j.remove(2);
        System.out.println("Should print out \"(ai, hi, zz)\" :   "+ toString(j));





        // Let's test all the possible cases!
        //SortedLinkedList now.

        //Empty at First: does it return size 0 and return error when we try to find the value at any index?
        //Yep. Feel free to try any of the other positions in the get function.
        //uncomment the fourth line in order to check for the error

        SortedLinkedList<String> a = new SortedLinkedList<String>();
        System.out.println("size is : " + a.size());
        System.out.println("Next line of code will return an error.");
        //System.out.println("error? " + a.get(2));


        //Does it add correctly?
        a.add("cat");
        a.add("bat");
        a.add("ant");
        a.add("aaa");
        System.out.println("size is now: " + a.size()+ " (should be 4.)");
        System.out.println("Should return 'vat': " + a.get(2));


        //Was it kept in order though? The list printed should be in order.

        System.out.println("this should print in alphabetical order:");
        System.out.println(toString(a));
        System.out.println();

        //Should be able to detect invalid positions. Uncomment the line below to check for an exception there.

        //System.out.println("Should throw an exception" + j.get(10));

        //Should remove correctly.

        a.remove(2);
        System.out.println("Should print out \"(aaa, ant, cat)\" :   "+ toString(a));

    }


}