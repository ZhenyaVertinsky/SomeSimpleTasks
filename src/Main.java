import com.zhenya.domain.Tasks;

public class Main {
    public static void main(String[] args) {
        // task 1
        System.out.println("----------Task 1----------");

        System.out.println(Tasks.getWeight(70.5, 0.16));


        // task 2
        System.out.println("----------Task 2----------");

        int[] array = new int[]{5, 10, 15, 20, 25, 30, 35, 40, 45, 50};
        Tasks.arrayExtraValue(array, 0.1);


        // task 3
        System.out.println("----------Task 4----------");

        Tasks.evenNumber(1,100);


        // task 4
        System.out.println("----------Task 5----------");

        Tasks.notEvenNumber(1, 15);


        // task 5
        System.out.println("----------Task 6----------");

        Tasks.evenNumber2(1, 100);


        // task 6
        System.out.println("----------Task 7----------");

        int i1 = Tasks.sumOfNumbers(20, 200);
        System.out.println(i1);


        // task 7
        System.out.println("----------Task 8----------");

        int[] months = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        Tasks.arrayMonths(months);


        // task 8
        System.out.println("----------Task 9----------");

        Tasks.replaceValue(11, 23);


        // task 9
        System.out.println("----------Task 10----------");
        int numberOne = 2;
        int numberTwo = 5;
        Tasks.sumOfNumber(numberOne, numberTwo);


        // task 10
        System.out.println("----------Task 11----------");

        Tasks.MaxValueFromAll(234,1243,282);


        // task 11
        System.out.println("----------Task 12----------");
        boolean typeOne = true;
        boolean typeTwo = false;
        Tasks.logic(typeOne, typeTwo);


        // task 12
        System.out.println("----------Task 13----------");
        String nameOne = "Yauheni ";
        String nameTwo = "Viartsinski";
        Tasks.stringValue(nameOne, nameTwo);


        // task 13
        System.out.println("----------Task 14----------");

        Tasks.volumePlus(1,2);


        // task 14
        System.out.println("----------Task 15----------");

        Tasks.loopForNumbers(1,100);


        // task 15
        System.out.println("----------Task 16----------");

        Tasks.naturalNumbersWithStep(8,37,5);


        // task 16
        System.out.println("----------Task 17----------");

        double[] arrayCount = new double[] {1, 3, 7, 10, 6, 5, 2};
        Tasks.arraySplit(arrayCount);


        // task 17
        System.out.println("----------Task 18----------");

        Tasks.currencyConverter(260,2.6);
    }
}
