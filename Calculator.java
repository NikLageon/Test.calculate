import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число,пробел,одну из четырёх операций, пробел и другое число, после enter");
        System.out.println("Например: \"10 * 2\" или \"IX - III\"");
        String s = reader.readLine();
        reader.close();
        int result = 0;
        boolean romeN = false;
        if (!s.matches("^([1-9]|10)\\s[+-\\\\*/]\\s([1-9]|10)$") &&
           !s.matches("^(I{1,3}|IV|V|VI{1,3}|IX|X)\\s[+-\\\\*/]\\s(I{1,3}|IV|V|VI{1,3}|IX|X)$"))
            throw new  NumberFormatException("Неверный формат");
        String[] arr = s.split(" ");
        if (RomeNum.romNum(arr[0])!=-1) {
            romeN = true;
            result = calc(RomeNum.romNum(arr[0]), RomeNum.romNum(arr[2]), arr[1]);
        } else
            result = calc(Integer.parseInt(arr[0]), Integer.parseInt(arr[2]), arr[1]);

        if (romeN)
            System.out.println(ArabNumber.arabNum(result));
        else System.out.println(result);
    }

    static int calc (int n1, int n2, String o) {
        if (o.equals("+"))
            return n1 + n2;
        if (o.equals("-"))
            return n1 - n2;
        if (o.equals("*"))
            return n1 * n2;
        else return n1 / n2;
    }



}
