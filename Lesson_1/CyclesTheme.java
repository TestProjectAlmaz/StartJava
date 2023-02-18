public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел:\n ");
        int evenSum = 0; 
        int oddSum = 0;       
        int i = -10;

        do { 
           if (i % 2 == 0) 
             evenSum += i; 
           else
             oddSum += i; 
             i++; 
        } while (i <= 21);
        System.out.println("В диапазоне [-10, 21]:\n " + "сумма четных чисел равна = " 
                + evenSum + " \n " + "сумма нечетных чисел равна = " + oddSum + "\n");    
         
        System.out.println("2. Вывод чисел в интервале (min и max) в порядке убывания:\n ");
         for(int j = 10; j >= -1; j--) {
            System.out.print(j + " ");
        }      
       
        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр:\n");
        int num = 1234;
        int rev = 0;
        int sum = 0;

        while(num > 0) {
           rev = (rev * 10) + (num % 10);
           sum += num % 10;
           num /= 10;
        }
        System.out.println("Реверсивное число: " + rev);
        System.out.println("Сумма цифр реверсивного числа: " + sum + "\n ");

        System.out.println("4. Вывод чисел на консоль в несколько строк:\n ");
        for (
            int a = 1; a < 24; a += 2) {
        if (a < 10) {
            System.out.printf("%1d ", a);
        } else {
            System.out.printf("%2d ", a);
        }
        if (a % 5 == 4) {
            System.out.println();
          }
        }

        int numOfZeros = 0;
        if (24 % 5 != 0) {
          numOfZeros = 5 - (24 % 5);
        }
        for (int b = 0; b < numOfZeros; b++) {
          System.out.printf("%2d ", b);
          System.out.printf("%2d ", b);
          System.out.printf("%2d ", b);
        }

        System.out.println("\n\n5. Проверка количества двоек на четность/нечетность:\n");
        int number = 3242592;
        int count = 0;
        while (number > 0) {
           if (number % 10 == 2)
            count++;
        number = number/10;
        }
        if (count % 2 == 0)
           System.out.println("число " + number + " содержит " + count + " четное количество двоек");
        else 
           System.out.println("число " + number + " содержит " + count + " нечетных количества двоек\n");

        System.out.println("6. Отображение фигур в консоли:\n");   
        //Прямоугольник
        for (int c = 0; c < 5; c++) {//
            for (int j = 0; j < 10; j++) {
            System.out.print("*");
        }
        System.out.println();
        }
        //Первый прямоугольный треугольник
        int w = 5;//
        while (w > 0) {
            for (int j = 0; j < w; j++) {
            System.out.print("#");
        }
        System.out.println();
        w--;
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
        for (int d = 0; d < 256; d++) {
            if (d % 2 != 0 && (d <= 57 || d >= 65 && d <= 90)) {
        System.out.printf("%5d | %5c\n", d, (char)d);
        }
        else if (d % 2 == 0 && (d >= 97 && d <= 122)) {
            System.out.printf("%5d | %5c\n", d, (char)d);
        }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом:\n");      
        int number1 = 1234321;
        boolean isPalindrome = true;
        int tmp = number1;
        int reverseNumber = 0;
        while (tmp > 0) {
                int remainder = tmp % 10;
                reverseNumber = (reverseNumber * 10) + remainder;
                tmp = tmp / 10;
        }

        if (number1 != reverseNumber) {
                isPalindrome = false;
        }

        if (isPalindrome) {
                System.out.println("число " + number1 + " является палиндромом\n");
        } else {
                System.out.println("число " + number1 + " не является палиндромом");
        }
        
        System.out.println("9. Определение, является ли число счастливым:\n");
        int number2 = 333522; // возьмите любое шестизначное число
        int firstHalf = number2 / 1000;
        int secondHalf = number2 % 1000;
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
        for (int f = 2; f <= 9; f++) {
           System.out.printf("%2d |", f);
        for (int j = 2; j <= 9; j++) {
           System.out.printf("%3d", f * j);
          }
           System.out.println();
        }

          }
         
        }




   
