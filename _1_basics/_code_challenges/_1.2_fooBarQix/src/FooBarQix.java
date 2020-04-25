public class FooBarQix {
    private static final String f = "Foo";
    private static final String b = "Bar";
    private static final String q = "Qix";

    public static void main(String[] args) {
        System.out.println(compute(101));
        System.out.println(compute(303));
        System.out.println(compute(105));
        System.out.println(compute(10101));
    }

    private static String compute(int number) {

        StringBuilder outputString = new StringBuilder();
        if (number % 3 == 0) {
            outputString.append(f);
        }
        if (number % 5 == 0) {
            outputString.append(b);
        }
        if (number % 7 == 0) {
            outputString.append(q);
        }

        String buffer = Integer.toString(number);
        for (int i = 0; i < buffer.length(); i++) {
            if (Integer.parseInt(String.valueOf(buffer.charAt(i))) == 3) {
                outputString.append(f);
            }
            if (Integer.parseInt(String.valueOf(buffer.charAt(i))) == 5) {
                outputString.append(b);
            }
            if (Integer.parseInt(String.valueOf(buffer.charAt(i))) == 7) {
                outputString.append(q);
            }
            if (Integer.parseInt(String.valueOf(buffer.charAt(i))) == 0) {
                outputString.append("*");
            }
        }
        return outputString.toString();
    }
}