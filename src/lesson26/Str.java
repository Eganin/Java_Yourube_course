package lesson26;

;

public class Str {
    public static void mainStr(String[] args) {
        String str1 = new String(" JAVA");
        String str2 = "JORNO";
        System.out.println(str1.charAt(0)); // вывести символ по индексу
        System.out.println(str1.codePointAt(1)); // возврвщвет символ по индексу в кодировке unicode / возвращает символ
        System.out.println(str1.compareTo(str2)); // сравнение строк при совпадении -0 // возвращает int
        System.out.println(str1.compareToIgnoreCase(str2));// сравнение строк без учета регистра
        System.out.println(str1.concat(str2)); // конкатанация строк
        System.out.println(str1.equals(str2)); // проверка на равенство // возвращает bool
        System.out.println(str1.equalsIgnoreCase(str2)); // проверка на равенство без учета регистра // возвращает bool
        System.out.println(str1.hashCode()); // возвращает hash-код объекта
        System.out.println(str1.indexOf(65)); // возвращает индекс по unicode иначе -1
        System.out.println(str1.isEmpty()); // проверка на пустоту
        System.out.println(str1.length()); // возвращение длины
        String[] strings = str2.split("R"); // разбить строку по символу
        for (String element : strings) {
            System.out.println(element);
        }

        System.out.println(str1.substring(2, 4)); // slice[2:4] -> [2:4)

        char[] chararry = str1.toCharArray(); // разбивает посимвольно // возвращает массив char
        for (char element : chararry) {
            System.out.println(element);
        }

        System.out.println(str1.toLowerCase()); // приведение к нижнему регистру // str1.lower()
        System.out.println(str1.toUpperCase()); // str1.upper()
        System.out.println(str1.trim()); // str1.strip()

        String str3 = String.valueOf(65); // приведение к str
        System.out.println(str3);
    }
}
