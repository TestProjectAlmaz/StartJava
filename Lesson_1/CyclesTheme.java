public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел:\n ");
        int evenSum = 0; 
        int oddSum = 0;       
        int counter = -10;
        do {
            if (counter % 2 == 0) {
                evenSum += counter;
        } else {
            oddSum += counter;
        }   
        counter++;
        } while (counter <= 21);          
        System.out.println("В промежутке [-10, 21]:\n " + "сумма четных чисел = " +
                evenSum + " \n " + "сумма нечетных чисел = " + oddSum + "\n");    
         
        System.out.println("2. Вывод чисел в интервале (min и max) в порядке убывания:\n ");
        int number0 = 10;
        int number1 = 5;
        int number2 = -1;
        for (int i = number0 -1; i > number1; i--) {
            System.out.print(i + " ");
        }
            for (int j = number1 -1; j > number2; j--){            
            System.out.print(j + " ");         
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр:\n");
        int num = 1234;
        int sum = 0;
        int reversedNum = 0;
        System.out.print("Реверсивным значением числа " + num + " является: ");
        while (num != 0) {
           int digit = num % 10;
           System.out.print(digit + " ");
           sum += digit;
           reversedNum = reversedNum * 10 + digit;
           num /= 10;
        }
        System.out.println("\nСумма цифр равна: " + sum + "\n");            

        System.out.println("4. Вывод чисел на консоль в несколько строк:\n ");
        int start = 1;
        int end = 24;
        int step = 2;
        int numbersPerLine = 3;        
        int count2 = 0;
        for (int i = start; i < end; i += step) {
            if (count2 == 0) {
                System.out.printf("%4d ", i);
        } else if (count2 == numbersPerLine - 1) {
            System.out.printf("%4d%n", i);
        } else {
            System.out.printf("%4d ", i);
        }
        count2++;
        if (count2 == numbersPerLine) {
            count2 = 0;
            }
        }
        int zerosNeeded = numbersPerLine - count2;       
        for (int i = 0; i < zerosNeeded; i++) {
            System.out.printf("%4d ", 0);
        }    

        System.out.println("\n\n5. Проверка количества двоек на четность/нечетность:\n");
        int num1 = 3242592;
        int countTwos = 0;
        while (num1 > 0) {
            if (num1 % 10 == 2) {
                countTwos++;
        }
        num1 /= 10;
        }
        if (countTwos % 2 == 0) {
            System.out.println("Число " + num1 + " содержит " + countTwos + " четное количество двоек");
        } else {
            System.out.println("Число " + num1 + " содержит " + countTwos + " нечетных количества двоек\n");
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
        int num2 = 1234321;
        boolean isPalindrome = true;
        int tmp = num2;
        int reverseNumber = 0;
        while (tmp > 0) {
            int remainder = tmp % 10;
            reverseNumber = (reverseNumber * 10) + remainder;
            tmp = tmp / 10;
        }
        if (num2 != reverseNumber) {
            isPalindrome = false;
        }
        if (isPalindrome) {
            System.out.println("число " + num2 + " является палиндромом\n");
        } else {
            System.out.println("число " + num2 + " не является палиндромом");
        }
        
        System.out.println("9. Определение, является ли число счастливым:\n");
        int num3 = 333522; // возьмите любое шестизначное число
        int firstHalf = num3 / 1000;
        int secondHalf = num3 % 1000;
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




   
