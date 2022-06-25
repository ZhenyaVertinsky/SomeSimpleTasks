package com.zhenya.domain;

public class Tasks {
    // Task 1.
    public static double getWeight(double weightMan, double percent) {
        return weightMan * percent;
    }

    // Task 2.
    public static void arrayExtraValue(int[] array, double percent) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] * percent + array[i]);
        }
    }

    // Task 3.
    public static void evenNumber(int evenFrom, int evenTo) {
        for (int i = evenFrom; i <= evenTo; i++) {
            if (i % 2 == 0)
                System.out.print(i + " ");
        }
        System.out.println();
    }

    // Task 4.
    public static void notEvenNumber(int notEvenFrom, int notEvenTo) {
        for (int i = notEvenFrom; i <= notEvenTo; i++) {
            if (i % 2 != 0)
                System.out.print(i + " ");
        }
        System.out.println();
    }

    // Task 5.
    public static void evenNumber2(int evenWithoutPercentFrom, int evenWithoutPercentTwo) {
        for (int i = evenWithoutPercentFrom; i <= evenWithoutPercentTwo; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Task 6.
    public static int sumOfNumbers(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum = sum + i;
        }
        return sum;
    }

    // Task 7.
    public static void arrayMonths(int[] months) {
        for (int i = 1; i <= months.length; i++) {
            if (i == months[0])
                System.out.println(i + " January");
            else if (i == months[1])
                System.out.println(i + " February");
            else if (i == months[2])
                System.out.println(i + " March");
            else if (i == months[3])
                System.out.println(i + " April");
            else if (i == months[4])
                System.out.println(i + " May");
            else if (i == months[5])
                System.out.println(i + " June");
            else if (i == months[6])
                System.out.println(i + " July");
            else if (i == months[7])
                System.out.println(i + " August");
            else if (i == months[8])
                System.out.println(i + " September");
            else if (i == months[9])
                System.out.println(i + " October");
            else if (i == months[10])
                System.out.println(i + " November");
            else if (i == months[11])
                System.out.println(i + " December");
        }
    }

    // Task 8.
    public static void replaceValue(int first, int second) {
        int third = first;
        first = second;
        second = third;
        System.out.println(first);
        System.out.println(second);
    }

    // Task 9.
    public static void sumOfNumber(int numberOne, int numberTwo) {
        int numberThree = numberOne + numberTwo;
        System.out.println(numberThree);
    }

    // Task 10.
    public static void MaxValueFromAll(int firstValue, int secondValue, int thirdValue) {
        if (firstValue > secondValue) {
            if (firstValue > thirdValue) {
                System.out.println("MaxValue: " + firstValue);
            }
        }
        if (secondValue > firstValue) {
            if (secondValue > thirdValue) {
                System.out.println("MaxValue: " + secondValue);
            }
        }
        if (thirdValue > firstValue) {
            if (thirdValue > secondValue) {
                System.out.println("MaxValue: " + thirdValue);
            }
        }
    }

    // Task 11.
    public static void logic (boolean typeOne, boolean typeTwo) {
        System.out.println("Truth " + typeOne);
        System.out.println("Lie " + typeTwo);
    }

    // Task 12.
    public static void stringValue (String nameOne, String nameTwo) {
        String nameThree = nameOne + nameTwo;
        System.out.println(nameThree);
    }

    // Task 13.
    public static void volumePlus(int volumePlusNumber, int volumePlusNumberTwo) {
        if (volumePlusNumber > volumePlusNumberTwo) {
            System.out.println(volumePlusNumber + 3);
        } else {
            System.out.println(volumePlusNumberTwo + 8);
        }
    }

    // Task 14.
    public static void loopForNumbers(int startFirstNumber, int lastNumber) {
        do {
            System.out.print(startFirstNumber++ + " ");
        }
        while (lastNumber >= startFirstNumber);
        System.out.println();
    }

    // Task 15.
    public static void naturalNumbersWithStep (int minValueForStep, int maxValueForStep, int stepValue) {
        for (int i = minValueForStep; i <= maxValueForStep; i+= stepValue) {
            System.out.println(i);
        }
    }

    // Task 16.
    public static void arraySplit(double [] arrayCount) {
        double max = arrayCount[0];
        for (int i = 0; i < arrayCount.length; i++) {
            if (max < arrayCount[i]) {
                max = arrayCount[i];
            }
        }
        System.out.println("Max number: " + max);
        for (int i = 0; i < arrayCount.length; i++) {
            System.out.println(arrayCount[i] / max);
        }
    }

    // Task 17.
    public static void currencyConverter (int rublesBlr, double exchangeRateDollars) {
        double converter = rublesBlr / exchangeRateDollars;
        System.out.println(converter + " $");
    }
}
