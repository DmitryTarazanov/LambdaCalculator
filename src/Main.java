public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(11, 11);
        int b = calc.minus.apply(3,3);
        int c = calc.devide.apply(a, b);
/*
������ � ������� �� ����, ����������� ���������. � ������ ��������� �������� ��� ������� �� 0.
��� ������ ��������� ���������,� ���������� -1.
 */
        calc.println.accept(c);
    }
}