import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello SkyPro!");

        //Задача 1..
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника — " + fullName);

        //Задание 2..
        String fullNameUp = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullNameUp);

        //Задание 3..
        String fullName2 = "Иванов Семён Семёнович";
        String fullNameReplace = fullName2.replace('ё','е');
        System.out.println("Данные ФИО сотрудника — " + fullNameReplace);

        //Задание 4..
        String [] fullNameArray = fullName.split(" ");
        System.out.println("Имя сотрудника — " + fullNameArray[1]);
        System.out.println("Фамилия сотрудника — " + fullNameArray[0]);
        System.out.println("Отчество сотрудника — " + fullNameArray[2]);

        //Задача 4 .. with metod substring()
        String firstName4;
        String middleName4;
        String lastName4;
        int index = fullName.indexOf(' ');
        lastName4 = fullName.substring(0,index);
        index = ++index;
        int index2 = fullName.indexOf(' ',index);
        firstName4 = fullName.substring(index,index2);
        index2 = ++index2;
        middleName4 = fullName.substring(index2);
        System.out.println("Имя сотрудника —" + firstName4);
        System.out.println("Фамилия сотрудника —" + lastName4);
        System.out.println("Отчество сотрудника —" + middleName4);

        //Задача 5..
        String fullName5 = "Ivanov ivan ivanovich";
        char [] fullNameArray5 = fullName5.toCharArray();
        fullNameArray5[0] = Character.toUpperCase(fullNameArray5 [0]);
        int indexFirstName = fullName5.indexOf(' ') + 1;
        fullNameArray5[indexFirstName] = Character.toUpperCase(fullNameArray5[indexFirstName]);
        int indexMiddleName = fullName5.indexOf(' ',indexFirstName) + 1;
        fullNameArray5[indexMiddleName] = Character.toUpperCase(fullNameArray5[indexMiddleName]);
        String fullNameCorrect = "";
        for (int i = 0; i < fullNameArray5.length; i++) {
            fullNameCorrect = fullNameCorrect + Character.toString(fullNameArray5[i]) ;
        }
        System.out.println(fullNameCorrect);



//:предупреждающий_знак: Задание 6
//        Имеется две строки.
//                Первая: "135"
//        Вторая: "246"
//        Соберите из двух строк одну, содержащую данные "123456".
//                Использовать сортировку нельзя.
//        Набор чисел задан для понимания позиций, которые они должны занять в итоговой строке.
//        Выведите результат в консоль в формате: “Данные строки — ….”
//:sos: Подсказка
//        Следует использовать StringBuilder.
//                Критерии оценки
//– Применен метод, меняющий написание данных строки.
//– При изменении содержания строки результат программы выполняется.
//– Результат программы выведен в консоль согласно условиям задачи.
//:предупреждающий_знак: Задание 7
//        Дана строка из букв английского алфавита "aabccddefgghiijjkk".
//                Нужно найти и напечатать буквы, которые дублируются в строке.
//                Обратите внимание, что строка отсортирована, т. е. дубли идут друг за другом.
//                В итоге в консоль должен быть выведен результат программы: "acdgijk".
//                Критерии оценки
//– Данные в строке отсортированы корректно.
//– При изменении содержания строки результат программы выполняется.
//– Результат программы выведен в консоль согласно условиям задачи. (отредактировано)
    }
}