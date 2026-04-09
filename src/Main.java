import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // FIX_ME: изменено меню выбора
            //System.out.println("1.1  2.1  3.1  4.1  4.7  5.6  0");

            String input;
            // FIX_ME: раньше принимались любые числа и строки
            do {
                System.out.println("Выберите задание:");
                System.out.println("1 - Задание 1.1 (Точка)");
                System.out.println("2 - Задание 2.1 (Линия)");
                System.out.println("3 - Задание 3.1 (Студент)");
                System.out.println("4 - Задание 4.1 (Точка)");
                System.out.println("5 - Задание 4.7 (Студент)");
                System.out.println("6 - Задание 5.6 (Отличник)");
                System.out.println("0 - Выход");


                input = scanner.next();

                if (!Validation.isValidMenuChoice(input)) {
                    System.out.println("Ошибка! Введите число от 1 до 6.");
                }

            } while (!Validation.isValidMenuChoice(input));

            int choice = Integer.parseInt(input);

            switch (choice) {

                case 1:
                    System.out.println("Вывод точек координатной плоскости в текстовой форме");
                    // FIX_ME: отсутствует ввод с консоли
                    /*
                    KaordinatePoint point1 = new KaordinatePoint(5, 9);
                    */

                    // FIX_ME: отсутствует пользовательский интерфейс
                    // задание 1
                    System.out.println("Введите 3 точки (x y):");

                    Point point1 = new Point(
                            Validation.readCoordinate(scanner),
                            Validation.readCoordinate(scanner)
                    );

                    Point point2 = new Point(
                            Validation.readCoordinate(scanner),
                            Validation.readCoordinate(scanner)
                    );

                    Point point3 = new Point(
                            Validation.readCoordinate(scanner),
                            Validation.readCoordinate(scanner)
                    );

                    System.out.println("Первая точка: " + point1);
                    System.out.println("Вторая точка: " + point2);
                    System.out.println("Третья точка: " + point3);
                    break;
                case 2:
                    System.out.println("Вывод прямой на плоскости.");

                    // FIX_ME: отсутствует пользовательский интерфейс
                    System.out.println("Введите координаты линии 1:");

                    // задание 2
                    // FIX_ME: отсутствует ввод линий с консоли
                    StraightLine line1 = new StraightLine(
                            Validation.readCoordinate(scanner),
                            Validation.readCoordinate(scanner),
                            Validation.readCoordinate(scanner),
                            Validation.readCoordinate(scanner)
                    );

                    System.out.println("Введите координаты линии 2:");
                    StraightLine line2 = new StraightLine(
                            Validation.readCoordinate(scanner),
                            Validation.readCoordinate(scanner),
                            Validation.readCoordinate(scanner),
                            Validation.readCoordinate(scanner)
                    );

                    StraightLine line3 = new StraightLine(line1.getStart(), line2.getEnd());

                    System.out.println("1: " + line1);
                    System.out.println("2: " + line2);
                    System.out.println("3: " + line3);

                    System.out.println("Изменяем параметры прямых");

                    line1.getStart().setX(12);
                    line1.getStart().setY(32);
                    line1.getEnd().setX(5);
                    line1.getEnd().setY(42);
                    System.out.println("1: " + line1);

                    line2.getStart().setX(-8);
                    line2.getStart().setY(9);
                    line2.getEnd().setX(-8);
                    line2.getEnd().setY(36);
                    System.out.println("2: " + line2);
                    System.out.println("3: " + line3);

                    System.out.println("Изменяем координаты первой прямой, чтобы координаты третьей не изменились");
                    Point line1Start = new Point(3,5);
                    Point line1End = new Point(6,-7);
                    line1 = new StraightLine(line1Start, line1End);
                    System.out.println("1:" + line1);
                    System.out.println("3:" + line3);
                    break;

                case 3:
                    System.out.println("Студенты Вася, Петя, Андрей");

                    // FIX_ME: отсутствует пользовательский интерфейс, ввод данных с клавиатуры
                    //задание 3
                    System.out.println("Введите оценки (-1 для завершения):");
                    int[] grades = readArray(scanner);

                    Student student1 = new Student("Вася", grades);

                    Student student2 = new Student("Петя", student1.getGrades());

                    student2.getGrades()[0] = 5;
                    System.out.println("1 оценка Пети была изменена на 5");

                    System.out.println(student1);
                    System.out.println(student2);

                    // FIX_ME: менее эффективное копирование массива оценок
                    //int[] grades = student1.getGrades();
                    //int[] gradesAndrey = new int[grades.length];
                    //for(int i = 0; i < grades.length; i++){
                    //    gradesAndrey[i] = grades[i];
                    //  }
                    int[] copy = student1.getGrades().clone();
                    Student student3 = new Student("Андрей", copy);
                    System.out.println(student3);

                    System.out.println("2 оценка Васи была изменена на 2");
                    student1.getGrades()[1] = 2;

                    System.out.println(student1);
                    System.out.println(student2);
                    System.out.println(student3);
                    break;

                case 4:
                    System.out.println("Точки на плоскости");
                    // FIX_ME: отсутствовал ввод точек с консоли
                    //старый код
                    //Point point4 = new Point(3,5);
                    //Point point5 = new Point(25,6);
                    //Point point6 = new Point(7,8);

                    //новый код
                    System.out.println("Введите 3 точки (x y):");

                    Point point4 = new Point(
                            Validation.readCoordinate(scanner),
                            Validation.readCoordinate(scanner)
                    );

                    Point point5 = new Point(
                            Validation.readCoordinate(scanner),
                            Validation.readCoordinate(scanner)
                    );

                    Point point6 = new Point(
                            Validation.readCoordinate(scanner),
                            Validation.readCoordinate(scanner)
                    );

                    System.out.println("Первая точка: " + point4);
                    System.out.println("Вторая точка: " + point5);
                    System.out.println("Третья точка: " + point6);
                    break;

                case 5:

                    System.out.println("Студенты Вася и Максим");
                    // FIX_ME: нарушена очередность

                    // FIX_ME: отсутствует ввод оценок с консоли
                    //int[] grades1 = {3,4,5};
                    //Student student4 = new Student("Вася", grades1);
                    //System.out.println(student4);
                    //Student student5 = new Student("Максим", null);
                    //System.out.println(student5);

                    int[] grades1 = readArray(scanner);
                    Student student4 = new Student("Вася", grades1);
                    System.out.println(student4);
                    Student student5 = new Student("Максим", null);
                    System.out.println(student5);
                    break;

                case 6:
                    System.out.println("Вывод имени студента, его оценок, среденего балла и является ли он отличником");
                    // FIX_ME: отсутствует ввод оценок с консоли
                    //int[] vasyagrades = {3,4,5,4};

                    System.out.println("Введите оценки Васи(-1 для завершения):");
                    int[] vasyagrades = readArray(scanner);
                    Student vasya = new Student("Вася", vasyagrades);

                    // FIX_ME: отсутствует ввод оценок с консоли
                    //int[] petyagrades = {5,5,5,5};
                    System.out.println("Введите оценки Пети(-1 для завершения):");
                    int[] petyagrades = readArray(scanner);
                    Student petya = new Student("Петя", petyagrades);
                    // FIX_ME: не выполнено требование задания (нет среднего и отличника)
                    //System.out.println(vasya);
                    //System.out.println(petya);

                    System.out.println("У студента Вася средний балл: " + vasya.getAverage() +
                            ". Он " + (vasya.isExcellent() ? "отличник" : "не отличник"));

                    System.out.println("У студента Петя средний балл: " + petya.getAverage() +
                            ". Он " + (petya.isExcellent() ? "отличник" : "не отличник"));

                    break;
                case 0:
                    System.out.println("Выход");
                    scanner.close();
                    return;
                default:
                    System.out.println("Неверный выбор!");

            }
        }
    }

    // FIX_ME: добавлен метод для чтения массива
    private static int[] readArray (Scanner scanner){
        int[] temp = new int[100];
        int count = 0;

        while (true) {
            int val = Validation.readGrade(scanner);
            if (val == -1) break;
            temp[count++] = val;
        }

        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = temp[i];
        }

        return result;
    }
}
