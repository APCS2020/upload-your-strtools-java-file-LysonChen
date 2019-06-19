public class strTools {
    public static String changeFirstChar(String str) {
        // String tmp = str.substring(1);
        // String firstChar = str.substring(0, 1);
        // return firstChar.toUpperCase() + tmp;
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    public static String addPeriod(String str) {
        return str + ".";
    }

    // replace a target word with a given word
    public static String replace(String str, String target, String w) {
        int index1 = str.indexOf(target);
        int index2 = index1 + target.length();
        String Part1 = str.substring(0, index1);
        String Part2 = str.substring(index2);
        return Part1 + w + Part2;
    }

    // print single character of a string
    // "abcd" return "a, b, c, d."
    public static String PrintSingleChar(String str) {
        int index = 0;
        String tmp = "";
        while (index < str.length() - 1) {
            tmp += str.substring(0, 1);
            tmp += ",";
            tmp += " ";
        }
        return tmp + str.substring(str.length() - 1) + ".";
    }

    public static void printSingleChar1(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.substring(i, i++));
        }
    }

    public static String reverse(String str) {
        String reverseStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverseStr += str.substring(i, i + 1);
        }
        return reverseStr;
    }

    public static String reverse1(String str) {
        int index = str.length() - 1;
        String tmp = "";
        while (index >= 0) {
            tmp += str.substring(index, index + 1);
            index--;
        }
        return tmp;
    }

    public static String parliWord(String str) {
        return str + reverse1(str);
    }

    public static String parlidrom(String str) {
        String tmp = "";
        if (str.length() % 2 == 0) {
            tmp = str.substring(0, str.length() / 2);
        } else {
            tmp = str.substring(0, str.length() / 2 + 1);
        }
        return tmp + reverse(tmp);
    }

    public static boolean checkParlidrom(String str) {
        /**
         * public 这是一个用来说明方法访问范围的关键字， public的用法 可以在client program里访问 static:
         * 静态方法关键字，此方法可以 直接用className.methodName()调用 boolean：这是返回值类型return type
         * isPali：MethodName String str: Parameter type
         */
        String tmp = "";
        String newStr = "";
        if (str.length() % 2 == 0) {
            tmp = str.substring(0, str.length() / 2);
            newStr = tmp + reverse(tmp);
        } else {
            tmp = str.substring(0, str.length() / 2);
            newStr = tmp + str.substring(str.length() / 2, str.length() / 2 + 1) + reverse(tmp);
        }
        return newStr.equals(str);
    }

    public static void main(String[] args) {
        String str = "i beg you, please get away from me.";// change the first character 'i'
        String tmp = changeFirstChar(str);// tmp "I"
        String tmp1 = replace(tmp, "beg", "hate");
        System.out.println(tmp1);

        printSingleChar1("dog");

        reverse1("eht");
    }
}