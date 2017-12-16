package libs;

//Общий класс модуля, от него будут наследоваться все остальные модули
abstract class module {
    abstract String process(String s, String arg);

    abstract boolean check(String tocheck);
}
