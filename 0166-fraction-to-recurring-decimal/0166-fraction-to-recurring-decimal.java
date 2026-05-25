class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        if (numerator == 0) return "0";

        StringBuilder sb = new StringBuilder();

        if ((numerator < 0) ^ (denominator < 0))
            sb.append("-");

        long n = Math.abs((long) numerator);
        long d = Math.abs((long) denominator);

        sb.append(n / d);

        long r = n % d;

        if (r == 0) return sb.toString();

        sb.append(".");

        HashMap<Long, Integer> map = new HashMap<>();

        while (r != 0) {
            if (map.containsKey(r)) {
                sb.insert(map.get(r), "(");
                sb.append(")");
                break;
            }

            map.put(r, sb.length());

            r *= 10;
            sb.append(r / d);
            r %= d;
        }

        return sb.toString();
    }
}