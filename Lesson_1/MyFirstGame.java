public class MyFirstGame {
    public static void main (String[] args) {
        System.out.println("Итоговое ДЗ 2. Игра Угадай число:\n");
        int min = 0;
        int max = 100;
        int guess = (min + max) - 50;
        System.out.println("Компьютер загадал число: " + guess);        
        int playerNumber = -1;//число игрока
               
        while (playerNumber != guess) {      
            playerNumber = updateNumber(playerNumber, min, max);
            System.out.println("Игрок угадал число: " + playerNumber);
            // проверка угадал ли игрок число
            if (playerNumber == guess) {
                System.out.println("Вы победили!");
        } else {            
            if (playerNumber > guess) {
                System.out.println("Число " + playerNumber + " больше, того что загадал компьютер.");
                break;
        } else {
            System.out.println("Число " + playerNumber + " меньше, того что загадал компьютер.");
            break;                        
              }
            }
          }
        }
        //Алгоритм обновления числа игрока
        public static int updateNumber(int playerNumber, int min, int max) {
        if (playerNumber == -1) {
            return (min + max) - 50;
        } else if (playerNumber < max) {
            return (playerNumber + max) / 2;
        } else if (playerNumber > min) {
            return (playerNumber + min) / 2;
        } else {
            return -1;
            }
          }
        }                     





         