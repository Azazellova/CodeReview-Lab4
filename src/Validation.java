import java.util.Scanner;

public class Validation {

    public static String nameError(String name){
        if(name == null || name.isEmpty()){
            return "Ошибка в веденном имени";
        }
        if(name.length()<2){
            return "Ошибка в веденном имени";
        }
        if (name.length()>10){
            return "Ошибка в веденном имени";
        }
        for(int i = 0; i < name.length(); i++){
            char c = name.charAt(i);
            if(!Character.isLetter(c)){
                return "Ошибка в веденном имени";
            }
        }
        return null;
    }
    public static int errorInArray(int[] number){
        if(number == null) {
            return 1;  // null - ошибка
        }
        for (int i = 0; i < number.length; i++){
            if(number[i] < 2 || number[i] >5){
                return 1;
            }
        }
        return 0;
    }

    // FIX_ME: добавлена проверка координат
    public static boolean isValidCoordinate(int value) {
        return value >= -10000 && value <= 10000;
    }

    // FIX_ME: добавлена безопасная проверка числа
    public static int readInt(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Введите число!");
            scanner.next();
        }
        return scanner.nextInt();
    }

    // FIX_ME: проверка координаты с диапазоном
    public static int readCoordinate(Scanner scanner) {
        int value;
        while (true) {
            value = readInt(scanner);
            if (isValidCoordinate(value)) {
                return value;
            }
            System.out.println("Координата должна быть от -10000 до 10000!");
        }
    }

    // FIX_ME: проверка оценки
    public static int readGrade(Scanner scanner) {
        int value;
        while (true) {
            value = readInt(scanner);

            if (value == -1) return -1;

            if (value >= 2 && value <= 5) {
                return value;
            }

            System.out.println("Оценка должна быть от 2 до 5!");
        }
    }

    public static boolean isValidMenuChoice(String input) {
        if (input == null) return false;

        return input.matches("[0-6]");
    }
}