public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел:\n ");
        int oddSum = 0; 
        int evenSum = 0;       
        int counter = -10;

        do {
            if (counter % 2 == 0) {
                evenSum += counter;
            } else {
                oddSum += counter;
            }   
        counter++;
            } while (counter <= 21);          
        System.out.println("В диапазоне [-10, 21]:\n " + "сумма четных чисел равна = " +
                oddSum + " \n " + "сумма нечетных чисел равна = " + evenSum + "\n");    
         
        System.out.println("2. Вывод чисел в интервале (min и max) в порядке убывания:\n ");
        int min = -1;
        int max = 10;

        for (int i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }    
       
        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр:\n");
        int num = 1234;
        int reversed = 0;
        int sum = 0;

        while (num != 0) {
            int i = num % 10;
            reversed = reversed * 10 + i;
            sum += i;
            num /= 10;
        System.out.println(i);
        }
        System.out.println("Реверсивное значение исходного числа: " + reversed);
        System.out.println("Сумма цифр: " + sum + "\n");

        System.out.println("4. Вывод чисел на консоль в несколько строк:\n ");
        for (int i = 1; i < 24; i += 2) {
            int n = 0;
            for (int j = i; j < i + 10; j += 2) {
                if (j < 24) {
                    if (n++ % 5 == 0) {
                        System.out.println();
        }
        System.out.printf("%8d ", j);
        } else {
            System.out.printf("%8d ", 0);
        }
        }
        System.out.println();
        }

        System.out.println("\n\n5. Проверка количества двоек на четность/нечетность:\n");
        int num1 = 3242592;
        int countTwos = 0;

        while (num1 != 0) {
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




   
