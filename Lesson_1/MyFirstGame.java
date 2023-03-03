public class MyFirstGame {
    public static void main (String[] args) {
        System.out.println("1. Игра “Угадай число”:\n ");
        int randomNumber = (int) (Math.random() * 100 + 1);
        int playerNumber = 0;
        System.out.println("Угадай число в промежутке от 0 до 100");
        while (randomNumber != playerNumber) {
            playerNumber = Integer.parseInt(System.console().readLine());
            if (randomNumber < playerNumber) {
                System.out.println("Это число больше того что загадал компьютер.");
        } else if (randomNumber > playerNumber) {
            System.out.println("Это число меньше того что загадал компьютер.");
        } else {
            System.out.println("Вы победили!");
              }          
            }        
          }      
        }