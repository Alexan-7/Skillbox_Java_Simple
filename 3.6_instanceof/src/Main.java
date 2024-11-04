// instanceof — это оператор в Java, который проверяет,
// является ли объект экземпляром указанного класса или интерфейса.

public class Main {
    public static void main(String[] args) {
        // Примеры использования метода formatterPatternSwitch
        System.out.println(formatterPatternSwitch(42)); // int 42
        System.out.println(formatterPatternSwitch(3000000000L)); // long 3000000000
        System.out.println(formatterPatternSwitch(3.14)); // double 3.140000
        System.out.println(formatterPatternSwitch("Hello")); // String Hello
        System.out.println(formatterPatternSwitch(true)); // true (или другой объект)
    }

    static String formatterPatternSwitch(Object o) {
        return switch (o) {
            case Integer i -> String.format("int %d", i);
            case Long l    -> String.format("long %d", l);
            case Double d  -> String.format("double %f", d);
            case String s  -> String.format("String %s", s);
            default        -> o.toString();
        };
    }
}