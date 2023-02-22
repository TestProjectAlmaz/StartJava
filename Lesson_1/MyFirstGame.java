import java.util.Scanner;
import java.util.Random;

public class MyFirstGame {
    public static void main (String[] args) {/*
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(10) + 1;
        int guessNumber;

        do {
            System.out.println("Guess the number (1 - 100):");
            guessNumber = scanner.nextInt();

            if (guessNumber > secretNumber) {
                System.out.println("Your number is too large");
            } else if (guessNumber < secretNumber ) {
                System.out.println("Your number is too small");
            }
        } while (guessNumber != secretNumber);

        System.out.println("Congratulations! You guessed the number!");*/



 
    // Загадайте целое число в промежутке (0,100]
    int numberComputer = (int)(Math.random()*100);
    System.out.println("Компьютер загадал целое число в промежутке (0,100]. Попробуйте его угадать.");

    // Объявляем переменную число игрока
    int numberPlayer = 0;

    // Дана условная конструкция, позволяющая угадать число за минимально возможное количество попыток
    while (numberComputer != numberPlayer) {
      // Увеличиваем переменную числа игрока на 1 при каждой попытке
      numberPlayer++;
      // Сравниваем загаданное компьютером число с числом игрока
      if (numberComputer > numberPlayer) {
        System.out.println("Число такое-то больше того, что загадал компьютер.");
      } else if (numberComputer < numberPlayer) {
        System.out.println("Число такое-то меньше того, что загадал компьютер.");
      }
    }
    // Выводим сообщение о победе при условии, что число было угадано
    if (numberComputer == numberPlayer) {
      System.out.println("Вы победили!");
    }
  


/*
        int computerNumber = (int) (Math.random() * 100);
        int userNumber = 0;

        System.out.println("Computer has generated a random number in the range (0, 100]. Try to guess it.");
        while (userNumber != computerNumber) {
            if (userNumber > computerNumber) {
                System.out.println("The number you guessed is greater than the one computer generated. Try again.");
            }
            if (userNumber < computerNumber) {
                System.out.println("The number you guessed is less than the one computer generated. Try again.");
            }
            userNumber++;
        }
        System.out.println("Congratulations! You won!");*/


    }
}