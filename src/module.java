abstract class module {
    //Общий класс модуля, от него будут наследоваться все остальные модули
    private static String[] functions;

    abstract void process(String s);

    boolean check(String tocheck) {
        for (String a : functions) {
            if (a.equals(tocheck)) {
                return true;
            }
        }
        return false;
    }
}
