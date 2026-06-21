class Solution {
    public int romanToInt(String s) {
        int se = 0;

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (c == 'I') {
                if (i + 1 < s.length() && s.charAt(i + 1) == 'V') {
                    se += 4;
                    i++;
                } else if (i + 1 < s.length() && s.charAt(i + 1) == 'X') {
                    se += 9;
                    i++;
                } else {
                    se += 1;
                }
            }

            else if (c == 'V') {
                se += 5;
            }

            else if (c == 'X') {
                if (i + 1 < s.length() && s.charAt(i + 1) == 'L') {
                    se += 40;
                    i++;
                } else if (i + 1 < s.length() && s.charAt(i + 1) == 'C') {
                    se += 90;
                    i++;
                } else {
                    se += 10;
                }
            }

            else if (c == 'L') {
                se += 50;
            }

            else if (c == 'C') {
                if (i + 1 < s.length() && s.charAt(i + 1) == 'D') {
                    se += 400;
                    i++;
                } else if (i + 1 < s.length() && s.charAt(i + 1) == 'M') {
                    se += 900;
                    i++;
                } else {
                    se += 100;
                }
            }

            else if (c == 'D') {
                se += 500;
            }

            else if (c == 'M') {
                se += 1000;
            }
        }

        return se;
    }
}