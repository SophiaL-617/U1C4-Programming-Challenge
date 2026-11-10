public class Solution {
    /**
     * DO NOT MODIFY THE METHOD NAME OR THE PARAMETERS
     * PLEASE REFER TO THE PROBLEMS.MD FILE FOR QUESTION DETAILS
     **/

    public Solution() {}

    public boolean endsLy(String x) {
        if ((x.length()>2) && (x.substring(x.length()-2).equals("ly"))) {
            return true;
        }
        else {
            return false;
        }
    }

    public String conCat(String s1, String s2) {
        if (s1.length()<1 || s2.length()<1) {
            return s1+s2;
        }
        else if (s1.substring(s1.length()-1).equals(s2.substring(0,1))) {
            return s1 + s2.substring(1);
        }
        else {
            return s1+s2;
        }
    }

    public String withoutX(String s1) {
        if (s1.substring(s1.length()-1).equals("x")) {
            s1 = s1.substring(0, s1.length()-1);
        }
        if (s1.substring(0,1).equals("x")) {
            s1 = s1.substring(1);
        }
        return s1;
    }

    public String fizzString(String s1) {
        String s2 = s1;
        if (s1.substring(0,1).equals("f")) {
            s2 = "Fizz";
        }
        if (s1.substring(s1.length()-1).equals("b")) {
            if (s2.equals("Fizz")) {
                s2 += "Buzz";
            }
            else {
                s2 = "Buzz";
            }
        }
        return s2;
    }

    public String fizzString2(int x) {
        String s1 = "" + x;
        if ((x%15)==0) {
            s1 = "FizzBuzz";
        }
        else if ((x%3)==0) {
            s1 = "Fizz";
        }
        else if ((x%5)==0) {
            s1 = "Buzz";
        }
        return s1+"!";
    }

}
