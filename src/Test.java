public class Test {

    public static String toString(SortedArrayList j) {
        if (j.size()==0)
        {
            return "()";
        }
        String answer = "(";

        for (int a = 0; a < j.size(); a++){
            answer = answer + j.get(a);
            if (a<j.size()-1)
            {
                answer = answer + ", ";
            }
            else
            {
                answer = answer + ")";
            }
        }
        return answer;
    }

    public static String toString(SortedLinkedList j) {
        String result = "(";
        for (int x = 0; x< j.size(); x++)
        {
            result = result + j.get(x);
            if (x<j.size()-1)
            {
                result = result + ", ";
            }
            else
            {
                result = result + ")";
            }
        }
        return result;
    }


    public static void main(String[] args) {
        SortedArrayList<Integer> s = new SortedArrayList<>();
        System.out.println(s.size());
        System.out.println(toString(s));
        s.add(1);

        for (int x = 0; x<100; x++)
        {
            s.add(x);
        }
        s.add(21);
        s.add(555);
        System.out.println(s.remove(5));
        System.out.println(toString(s));


        SortedLinkedList<String> cars = new SortedLinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(toString(cars));

        cars.remove(2);
        System.out.println(toString(cars));

    }


}
