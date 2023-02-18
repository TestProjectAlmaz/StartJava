public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java:\n ");    
        int age = 20;
        boolean male = true;
        double height = 1.80;
        String extract = "MERLIN";

        if (age > 20) {
            System.out.println(" Ваш возраст старше 20 лет\n ");
        } else {
            System.out.println(" Ваш возраст младше или равен 20 лет.");
        }

        if (!male) {
            System.out.println(" Вы не мужчина!\n ");
        } else {
            System.out.println(" Вы мужчина. ");
        }

        if (height < 1.80) {
            System.out.println(" Ваш рост ниже 1.80!\n ");
        } else {
            System.out.println(" Ваш рост выше или равен 1.80. ");
        }

        char firstLetterName = extract.charAt(0);
        if (firstLetterName == 'M') {
            System.out.println(" Отлично буква 'M' есть в этом имени.\n ");
        } else if (firstLetterName == 'I') {
            System.out.println(" Буква M не является I!\n ");
        } else {
            System.out.println(" Игра окончена!\n ");
        }
        
        System.out.println("2. Поиск max и min числа:\n ");
        int numberMin = 100;
        int numberMax = 200;

        if (numberMin < numberMax) {
            System.out.println(numberMin + " = " + "Является минимальным числом. ");
        } else {
            System.out.println(numberMin + " = " + "Является максимальным числом.\n ");
        }
        if (numberMax > numberMin) {
            System.out.println(numberMax + " = " + "Является максимальным числом.\n ");
        } else {
            System.out.println(numberMax + " = " + "Является минимальным числом.\n ");
        }

        
        System.out.println("3. Проверка числа:\n ");
        int numberRandom = 7;

        if (numberRandom == 0) {
            System.out.println("число 7 не равно 0"); //false
        } else {
        if (numberRandom % 2 == 1) {
            System.out.println("число 7" + " = " + "является нечетным."); //true
        } else {
            System.out.println(" число 7\n\n " + "число 7 является четным\n\n "); //false
        }
        if (numberRandom > 0) {
            System.out.println("число 7" + " = " + "является положительным.\n "); //true
        } else {
            System.out.println("число 7 является отрицательным\n "); //false
            }
        }
        
        System.out.println("4. Поиск одинаковых цифр в числах:\n ");
        int num1 = 444;
        int num2 = 555;

        System.out.println("Исходные числа: " + num1 + ", " + num2);

        int firstDigit = num1 / 100;
        int secondDigit = (num1 % 100) / 10;
        int thirdDigit = num1 % 10;

        int firstDigit2 = num2 / 100;
        int secondDigit2 = (num2 % 100) / 10;
        int thirdDigit2 = num2 % 10;

        if (firstDigit == firstDigit2) {
            System.out.println("Первые цифры чисел совпадают: " + firstDigit);
        }
        if (secondDigit == secondDigit2) {
            System.out.println("Вторые цифры чисел совпадают: " + secondDigit);
        }
        if (thirdDigit == thirdDigit2) {
            System.out.println("Третьи цифры чисел совпадают: " + thirdDigit);
        }
        if (firstDigit != firstDigit2 && secondDigit != secondDigit2 && thirdDigit != thirdDigit2) {
            System.out.println("В этих числах не найдено одинаковых цифр:\n ");//true
        }
        
        System.out.println("5. Определение символа по его коду:\n ");
        char symbol = '\u0057';

        if (symbol >= 'a' && symbol <= 'z') {
            System.out.println("Это маленькая буква: " + symbol);
        } else if (symbol >= 'A' && symbol <= 'Z') {
            System.out.println("Это большая буква: " + symbol + "\n ");
        } else if (symbol >= '0' && symbol <= '9') {
            System.out.println("Это число: " + symbol);
        } else {
            System.out.println("Это не буква и не число: " + symbol);
        }
        
        System.out.println("6. Подсчет суммы вклада и начисленных банком %:\n ");   
        double deposit = 300_000;
        double interest;

        if (deposit < 100_000) {
            interest = deposit * 0.05;
        } else if (deposit >= 100_000 && deposit < 300_000) {
            interest = deposit * 0.07;
        } else {
            interest = deposit * 0.1;
        }
        double total = deposit + interest;
        System.out.println("Сумма депозита: " + deposit + " рублей,");
        System.out.println("Полученные проценты: " + interest + " рублей,");
        System.out.println("Общая сумма с процентами: " + total + " рублей.\n");
        
        System.out.println("7. Определение оценки по предметам:\n ");
        float historyPercentage = 59f;
        float programmingPercentage = 91f;
        float averageScore;
        float averagePercentage;
        int historyScore;
        int programmingScore;

        if (historyPercentage <= 60) {
             historyScore = 2;
        } else if (historyPercentage > 60 && historyPercentage <= 73) {
             historyScore = 3;
        } else if (historyPercentage > 73 && historyPercentage <= 91) {
             historyScore = 4;
        } else {
             historyScore = 5;
        }
        if (programmingPercentage <= 60) {
             programmingScore = 2;
        } else if (programmingPercentage > 60 && programmingPercentage <= 73) {
             programmingScore = 3;
        } else if (programmingPercentage > 73 && programmingPercentage <= 91) {
             programmingScore = 4;
        } else {
             programmingScore = 5;
        }
        averageScore = (historyScore + programmingScore) / 2.0f;
        averagePercentage = (historyPercentage + programmingPercentage) / 2.0f;
        System.out.println(historyScore + " - " + "История.");
        System.out.println(programmingScore + " - " + "Программирование.");
        System.out.println(averageScore + " - " + "Средний балл.");
        System.out.println(averagePercentage + " - " + "Средний процент.\n");
        
        System.out.println("8. Расчет прибыли за год:\n ");
        int monthlyIncome = 13000;
        int monthlyCosts = 5000 + 9000;
        int annualProfit = (monthlyIncome - monthlyCosts) * 12;
        if(annualProfit > 0) {
            System.out.println("Прибыль за год: +" + annualProfit + " руб.");//false
        } else {
            System.out.println("Прибыль за год: " + annualProfit + " руб.\n ");//true
        }  
        
        System.out.println("9. Подсчет количества банкнот:\n ");
        int amount = 567;
        int bills100 = 10;
        int bills10 = 5;
        int bills1 = 50;

        int total2 = bills100 * 100 + bills10 * 10 + bills1 * 1;

        if (total2 < amount) {
            System.out.println("Недостаточно купюр в банкомате для снятия запрошенной суммы");
        } else {
            int needed100 = Math.min(amount / 100, bills100);
            int needed10 = Math.min((amount - needed100 * 100) / 10, bills10);
            int needed1 = amount - needed100 * 100 - needed10 * 10;

        System.out.println("Номиналы:\n100 USD: " + needed100 + ",  \n10 USD: " + needed10 +
                ", \n1 USD: " + needed1 + ". ");
        System.out.println("Общая сумма к выводу: " + amount + " USD.");
        }

          }

        }
      
