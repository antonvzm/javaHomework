import java.time.LocalTime;
import java.util.Scanner;

// 3. В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида:
// "Доброе утро, <Имя>!", если время от 05:00 до 11:59
// "Добрый день, <Имя>!", если время от 12:00 до 17:59;
// "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
// "Доброй ночи, <Имя>!", если время от 23:00 до 4:59

public class ThreeTask {
    public static void main(String[] args) {
        Scanner inName = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String nameUser = inName.nextLine();
        inName.close();
        LocalTime time = LocalTime.now();
        String strTime = "";
        strTime= strTime + time;
        char c = strTime.charAt(0);
        char b = strTime.charAt(1);
        String hour = String.valueOf(c) + String.valueOf(b);
        int newTime =  Integer.parseInt(hour);
        if (newTime > 5 && newTime < 11){
            System.out.println("Доброе утро, " + nameUser + "!");
        }
        else if (newTime > 12 && newTime < 18){
            System.out.println("Добрый день, " + nameUser + "!");
        }
        else if (newTime > 18 && newTime < 23){
            System.out.println("Добрый вечер, " + nameUser + "!");
        }
        else {
            System.out.println("Доброй ночи, " + nameUser + "!");
        }
    }
}
