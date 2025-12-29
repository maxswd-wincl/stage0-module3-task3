package school.mjc.stage0.module3.task3;

public class ReassigningValues {
    public static void main(String[] args) {
   // initial variables
        int first = 1;
        int second = 10;
        int third = 100;

        // print initial values
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);

        // create "links" (copies of values)
        int linkToFirst = first;
        int linkToSecond = second;
        int linkToThird = third;

        // reassign original variables
        first = 15;
        second = 6;
        third = 4;

        // print all variables in order of declaration
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(linkToFirst);
        System.out.println(linkToSecond);
        System.out.println(linkToThird);
    }
}
