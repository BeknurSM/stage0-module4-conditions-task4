package school.mjc.stage0.conditions.task4;

public class MaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {

        int result = first>second? first:second;
        result = result>third? result:third;
        System.out.println(result);
    }
}
//if (first > second && first > third) {
//        System.out.println(first);
//        }
//        else if (second > first && second > third){
//        System.out.println(second);
//        }
//        else {
//        System.out.println(third);
//        }