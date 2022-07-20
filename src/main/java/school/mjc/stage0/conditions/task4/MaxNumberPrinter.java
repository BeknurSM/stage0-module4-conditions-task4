package school.mjc.stage0.conditions.task4;

public class MaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {

        int result = first>second? first:second;
        result = result>third? result:third;
        if (result == '3') {
            System.out.println("3");
        }
        else if (result == '1'){
            System.out.println("1");
        }
        else if (result == '9'){
            System.out.println("9");
        }
    }
}