//WSVM - WaveScript Virtual Machine - главный исполнительный юнит всего вейвскрипта

import java.util.Vector;

class wsvm {
    static Vector<String> var;

    //Это - хранилище всех переменных.
    //Переменные хранятся в этом векторе следующим образом - сначала идёт название, потом значение, потом тип.
    //Таким образом, каждая переменная занимает в векторе три элемента.
    //Вектор оставлен пустым для дальнейшей иницализации в коде
    //ниже - метод для обработки кода. на вход принимает массив строк.
    static void make(String[] code) {
        for (String a : code) {

        }
    }

    //Перегрузка метода для интерпретатора
    static void make(String code) {
        make(new String[]{code});
    }
}
