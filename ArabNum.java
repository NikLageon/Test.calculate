class ArabNumber {
    static String arabNum (int num) {
        String[] hundrets = { "", "C" };
        String[] tens = { "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" };
        String[] ones = { "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" };
        return hundrets[num / 100 % 10] + tens[num / 10 % 10] + ones[num % 10];
    }
}
