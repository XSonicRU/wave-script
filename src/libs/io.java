package libs;

//Модуль, содержащий в себе функции ввода/вывода, наследуется от module.java
class io extends module {
    private String[] functions = new String[]{"Пиши", "ПишиСлитно"}; //Список всех функций этого модуля

    void process(String s, String arg) {
        int num = 0;
        String a;
        for (int i = 0; i < functions.length; i++) {
            a = functions[i];
            if (a.contains(s)) {
                num = i;
            }
        }
        if (num == 0) {
            System.out.println(arg);
            //TODO:Сделать вывод более универсальным
        }
        if (num == 1) {
            System.out.print(arg);
        }
    }

    boolean check(String tocheck) {
        for (String a : functions) {
            if (tocheck.contains(a)) {
                return true;
            }
        }
        return false;
    }
}
