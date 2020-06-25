package lesson27;

public class stringBuilder_and_stringBuffer {
    public static void buffer(){
        String str = new String();

        StringBuilder stringBuilder = new StringBuilder("JAVA");
        System.out.println(stringBuilder.capacity()); // размер буфера
        stringBuilder.ensureCapacity(20); // задать минимальный размер буфера
        stringBuilder.append(" JORNO");
        stringBuilder.append(1); // str
        System.out.println(stringBuilder); // нелзя пройтись циклом
        stringBuilder.setLength(30); // установка длины
        stringBuilder.insert(1,"G"); // вставка элемента по индексу
        System.out.println(stringBuilder);
        stringBuilder.deleteCharAt(0); // удаление символа по индексу
        System.out.println(stringBuilder);
        stringBuilder.delete(0,4);// удаление нескольких символов по индексам [0,4)
        System.out.println(stringBuilder);
        stringBuilder.reverse();// reversed(stringBuilder)
        System.out.println(stringBuilder);
        StringBuffer stringBuffer = new StringBuffer();
        // stringBuffer почти тоже самое что и stringBuilder
        // stringBuffer в отличии  от stringBuilder - потокобезопасен и медленее
    }
}
