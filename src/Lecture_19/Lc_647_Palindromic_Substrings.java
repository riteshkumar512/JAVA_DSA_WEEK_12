package Lecture_19;

public class Lc_647_Palindromic_Substrings {
    public static void main(String[] args) {
        String str = "naan";
        Axis_Orbit(str);
    }

    public static int Axis_Orbit(String str) {
        //odd
        int odd = 0;
        for (int axis = 0; axis < str.length(); axis++) {
            for (int orbit = 0; axis - orbit >= 0 && axis + orbit < str.length(); orbit++) {
                if (str.charAt(axis - orbit) != str.charAt(axis + orbit)) {
                    break;
                }
                odd++;
            }
        }
        //even.
        int even = 0;
        for (double axis = 0.5; axis < str.length(); axis++) {
            for (double orbit = 0.5; axis - orbit >= 0 && axis + orbit < str.length(); orbit++) {
                if (str.charAt((int) (axis - orbit)) != str.charAt((int) (axis + orbit))) {
                    break;
                }
                even++;
            }
        }
        return odd + even;
    }
}
