public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел:\n ");
        int sumEven = 0; 
        int sumOdd = 0;       
        int counter = -10;
        do {
            if (counter % 2 == 0) {
                sumEven += counter;
            } else {
            sumOdd += counter;
            }   
            counter++;
        } 
        while (counter <= 21);          
        System.out.println("В промежутке [-10, 21]:\n " + "сумма четных чисел = " +
                sumEven + " \n " + "сумма нечетных чисел = " + sumOdd + "\n");    
         
        System.out.println("2. Вывод чисел в интервале (min и max) в порядке убывания:\n ");
        int number1 = 10;
        int number2 = 5;
        int number3 = -1;
        int max = number1;
        int min = number1;
        if (min < number2) {
            System.out.println(min + " Является минимальным числом");
        }
        if (max > number2) {
            System.out.println(max + " Является максимальным числом");
        }        
        if (number3 < min) {
            System.out.println(number3 + " Является минимальным числом\n");
        }
        if (number3 > max) {
            System.out.println(number3 + " Является максимальным числом");
        }           
        for (int i = number1 -1; i > number2; i--) {
            System.out.print(i + " ");
        }
            for (int j = number2 -1; j > number3; j--) {            
            System.out.print(j + " ");         
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр:\n");
        int number4 = 1234;
        int sum = 0;
        int reversedNum = 0;
        System.out.print("Реверсивным значением числа " + number4 + " является: ");
        while (number4 != 0) {
           int digit = number4 % 10;
           System.out.print(digit + " ");
           sum += digit;          
           number4 /= 10;
        }
        System.out.println("\nСумма цифр равна: " + sum + "\n");            

        System.out.println("4. Вывод чисел на консоль в несколько строк:\n ");
        int start = 1;
        int end = 24;
        int step = 2;
        int numbersPerLine = 5;        
        int count2 = 0;

        for (int i = start; i < end; i += step) {
            if (count2 == 0) {
                System.out.printf("%3d ", i);
            } else if (count2 == numbersPerLine - 1) {
                System.out.printf("%3d%n", i);
            } else {
                System.out.printf("%3d ", i);
            }
            count2++;
            if (count2 == numbersPerLine) {
                count2 = 0;
            }
        }
        int zerosNeeded = numbersPerLine - count2;       
        for (int i = 0; i < zerosNeeded; i++) {
            System.out.printf("%3d ", i);
        }    

        System.out.println("\n\n5. Проверка количества двоек на четность/нечетность:\n");
        int number5 = 3242592;
        int countTwos = 0;
        while (number5 > 0) {
            if (number5 % 10 == 2) {
                countTwos++;
            }
            number5 /= 10;
        }
        if (countTwos % 2 == 0) {
            System.out.println("Число " + number5 + " содержит " + countTwos +
                    " четное количество двоек");
        } else {
            System.out.println("Число " + number5 + " содержит " + countTwos +
                    " нечетных количества двоек\n");
        }
        
        System.out.println("6. Отображение фигур в консоли:\n");   
        //Прямоугольник
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
        }
        System.out.println();
        }
        //Первый прямоугольный треугольник
        int count1 = 5;//
        while (count1 > 0) {
            for (int j = 0; j < count1; j++) {
                System.out.print("#");
        }
        System.out.println();
        count1--;
        }
        //Второй прямоугольный треугольник
        int row = 1;
        do {
            int column = 1;
            do {
                System.out.print("$");
                column++;
            } while (column <= row);
            System.out.println("");
            row++;
        } while (row <= 3);
        row = 2;
        do {
            int column = 1;
            do {
                System.out.print("$");
                column++;
            } while (column <= row);
            System.out.println("");
            row--;
        } while (row >= 1);
        
        System.out.println("\n7. Отображение ASCII-символов:\n");
        System.out.println("   Dec    Char");
        for (int i = 0; i < 256; i++) {
            if (i % 2 != 0 && (i <= 57 || i >= 65 && i <= 90)) {
                System.out.printf("%5d | %5c\n", i, (char)i);
        } else if (i % 2 == 0 && (i >= 97 && i <= 122)) {
            System.out.printf("%5d | %5c\n", i, (char)i);
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом:\n");      
        int number6 = 1234321;
        boolean isPalindrome = true;
        int tmp = number6;
        int reverseNumber = 0;
        while (tmp > 0) {
            int remainder = tmp % 10;
            reverseNumber = (reverseNumber * 10) + remainder;
            tmp = tmp / 10;
        }
        if (number6 != reverseNumber) {
            isPalindrome = false;
        }
        if (isPalindrome) {
            System.out.println("число " + number6 + " является палиндромом\n");
        } else {
            System.out.println("число " + number6 + " не является палиндромом");
        }
        
        System.out.println("9. Определение, является ли число счастливым:\n");
        int number7 = 333522; // возьмите любое шестизначное число
        int firstHalf = number7 / 1000;
        int secondHalf = number7 % 1000;
        int firstHalfSum = (firstHalf / 100) + ((firstHalf / 10) % 10) + (firstHalf % 10);
        int secondHalfSum = (secondHalf / 100) + ((secondHalf / 10) % 10) + (secondHalf % 10);
        System.out.println("Сумма цифр первой половины: " + firstHalf + " = "+ firstHalfSum);
        System.out.println("Сумма цифр второй половины: " + secondHalf + " = "+ secondHalfSum);
        if (firstHalfSum == secondHalfSum) {
            System.out.println("Число счастливое.\n");
        } else {
            System.out.println("Число не счастливое.\n");
        }

        System.out.println("10. Вывод таблицы умножения Пифагора\n");
        System.out.println("    ТАБЛИЦА    ПИФАГОРА\n");
        System.out.println("      2  3  4  5  6  7  8  9 ");
        System.out.println("----------------------------------");
        for (int count = 2; count <= 9; count++) {
            System.out.printf("%2d |", count);
            for (int j = 2; j <= 9; j++) {
                System.out.printf("%3d", count * j);
        }
        System.out.println();
            }      
          }
        }




   
