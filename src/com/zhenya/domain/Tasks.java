package com.zhenya.domain;

public class Tasks {
    /* Task 1. Напишите программу, которая вычисляет ваш вес на Луне с учетом того,
        что сила тяжести равна 16% от силы тяжести на Земле. */
    public static double getWeight(double weightMan, double percent) {
        return weightMan * percent;
    }

    // Task 2. Напишите метод, который будет увеличивать каждый элемент массива на 10%.
    public static void arrayExtraValue(int[] array, double percent) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] * percent + array[i]);
        }
    }

    // Task 3. Вывести на экран все четные цифры от 1 до 100 (используйте остаток от деления)
    public static void evenNumber(int evenFrom, int evenTo) {
        for (int i = evenFrom; i <= evenTo; i++) {
            if (i % 2 == 0)
                System.out.print(i + " ");
        }
        System.out.println();
    }

    // Task 4. Вывести на  экран все нечетные цифры от 1 до 15 (используйте остаток от деления)
    public static void notEvenNumber(int notEvenFrom, int notEvenTo) {
        for (int i = notEvenFrom; i <= notEvenTo; i++) {
            if (i % 2 != 0)
                System.out.print(i + " ");
        }
        System.out.println();
    }

    /* Task 5. Вывести на экран все четные цифры от 1 до 100
    не используя остаток от деления (используя только цикл for) */
    public static void evenNumber2(int evenWithoutPercentFrom, int evenWithoutPercentTwo) {
        for (int i = evenWithoutPercentFrom; i <= evenWithoutPercentTwo; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Task 6. Посчитать сумму цифр от 20 до 200 и результат вывести на экран (используя цикл for)
    public static int sumOfNumbers(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum = sum + i;
        }
        return sum;
    }

    /* Task 7. Пройти циклом по числам от 1 до 12 и вывести название месяца,
    соответствующее каждому числу (используя цикл и оператор if else) */
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

    /* Task 8. Объявить 2 переменных целого типа. Необходимо поменять значения переменных так,
    чтобы значение первой оказалось во второй, а второй - в первой. */
    public static void replaceValue(int first, int second) {
        int third = first;
        first = second;
        second = third;
        System.out.println(first);
        System.out.println(second);
    }

    /* Task 9. Напишите программу с тремя переменными целого типа, первым двум присвойте значения,
    а третьей переменной присвойте их сумму. Выведете значение третей переменной на экран. */
    public static void sumOfNumber(int numberOne, int numberTwo) {
        int numberThree = numberOne + numberTwo;
        System.out.println(numberThree);
    }

    // Task 10. Напишите программу с тремя переменными целого типа. Определить какое из них наибольшее.
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

    /* Task 11. Напишите программу, в которой используются две переменные логического типа (boolean),
    присвойте им значения и выведете для каждой переменной на экран строку "истина",
    если переменная имеет значение true и "ложь", если переменная имеет значение false. */
    public static void logic (boolean typeOne, boolean typeTwo) {
        System.out.println("Truth " + typeOne);
        System.out.println("Lie " + typeTwo);
    }

    /* Task 12. Напишите программу, где двум строковым переменным присваиваются значения,
    третей же строковой переменной присвойте объединение (конкатенацию) двух предыдущих строк.
    Затем напечатайте значение третьей строковой переменной. */
    public static void stringValue (String nameOne, String nameTwo) {
        String nameThree = nameOne + nameTwo;
        System.out.println(nameThree);
    }

    /* Task 13. Создайте программу с двумя переменными целого типа, присвойте им значения,
    если первая переменная больше второй, то увеличьте её значение на 3,
    иначе увеличьте значение второй переменной на 8. В конце программы выведите значения обоих чисел на экран. */
    public static void volumePlus(int volumePlusNumber, int volumePlusNumberTwo) {
        if (volumePlusNumber > volumePlusNumberTwo) {
            System.out.println(volumePlusNumber + 3);
        } else {
            System.out.println(volumePlusNumberTwo + 8);
        }
    }

    /* Task 14. Выведете на экран все числа от 1 до 100 с помощью цикла
    (можно все три варианта в одной программе): for while do while. */
    public static void loopForNumbers(int startFirstNumber, int lastNumber) {
        do {
            System.out.print(startFirstNumber++ + " ");
        }
        while (lastNumber >= startFirstNumber);
        System.out.println();
    }

    /* Task 15. Вывести на экран ряд натуральных чисел от минимума до максимума с шагом.
    Например, если минимум 10, максимум 35, шаг 5, то вывод должен быть таким: 10 15 20 25 30 35.
    Минимум, максимум и шаг указываются пользователем (можно захардкодить). */
    public static void naturalNumbersWithStep (int minValueForStep, int maxValueForStep, int stepValue) {
        for (int i = minValueForStep; i <= maxValueForStep; i+= stepValue) {
            System.out.println(i);
        }
    }

    // Task 16. Все элементы массива поделить на значение наибольшего элемента этого массива.
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

    /* Task 17. Напишите метод переводящий рубли в доллары по заданному курсу.
    В качестве аргументов укажите кол-во рублей и курс. */
    public static void currencyConverter (int rublesBlr, double exchangeRateDollars) {
        double converter = rublesBlr / exchangeRateDollars;
        System.out.println(converter + " $");
    }
}
