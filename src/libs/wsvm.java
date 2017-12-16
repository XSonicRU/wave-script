package libs;

//WSVM - WaveScript Virtual Machine - главный исполнительный юнит всего вейвскрипта

import java.util.Vector;

public class wsvm {
    private final static module[] modules = new module[]{new io()};
    //Это массив всех модулей программы
    static Vector<String> var;

    //Это - хранилище всех переменных.
    //Переменные хранятся в этом векторе следующим образом - сначала идёт название, потом значение, потом тип.
    //Таким образом, каждая переменная занимает в векторе три элемента.
    //Вектор оставлен пустым для дальнейшей иницализации в коде
    //ниже - метод для обработки кода. на вход принимает массив строк.
    public static void make(String[] code) {
        boolean isFound = false;
        code = format(code);
        for (String a : code) {
            isFound = false;
            for (module m : modules) {
                if (m.check(a)) {
                    isFound = true;
                    m.process(a, a.substring(a.indexOf('(') + 1, a.lastIndexOf(')')));
                    break;
                }
            }
            if (!isFound) {
                exc.thr("E: Не найдено " + a);
            }
        }
        //TODO:Усовершенствовать интерпретатор чтоб он понимал больше одной фукнции на строке
    }

    public static String makefunc(String a) {
        boolean isFound = false;
        isFound = false;
        for (module m : modules) {
            if (m.check(a)) {
                isFound = true;
                return m.process(a, a.substring(a.indexOf('(') + 1, a.lastIndexOf(')')));
            }
        }
        exc.thr("E: Не найдено " + a);
        return "E";
    }

    //Перегрузка метода для интерпретатора
    public static void make(String code) {
        make(new String[]{code});
    }

    //Метод, превращающий всё в массив строк без пробелов
    private static String[] format(String[] code) {
        StringBuilder sb = new StringBuilder();
        char[] buf;
        for (int i = 0; i < code.length; i++) {
            String a = code[i];
            buf = a.toCharArray();
            for (char b : buf) {
                if (b != 0 && b != ' ' && b != '\n') {
                    sb.append(b);
                }
            }
            code[i] = sb.toString();
        }
        return code;
    }

    //Фукнция, сворачивающая аргументы
    private static String processarg(String a) {
        String arg = a.substring(a.indexOf('(') + 1, a.lastIndexOf(')'));
        return ""; //TODO
    }

}
