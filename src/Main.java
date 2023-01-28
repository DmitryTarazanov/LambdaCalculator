public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(11, 11);
        int b = calc.minus.apply(3,3);
        int c = calc.devide.apply(a, b);
/*
Ошибка в делении на ноль, переданного параметра. В методе добавлена проверка для деления на 0.
При ошибке выводится сообщение,и возвращает -1.
 */
        calc.println.accept(c);
    }
}