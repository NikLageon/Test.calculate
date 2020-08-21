class RomeNum {
    static int romNum (String num) {
        String[] number = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        for (int i = 0; i < number.length; i++) {
            if (number[i].equals(num))
                return i;
        }
        return -1;
    }
}
