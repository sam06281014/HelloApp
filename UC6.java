public class UC6{

    public static void main(String[] args) {

        String result = "Hello ";

        for (int i = 0; i < args.length; i++) {
            result = result + args[i] + ", ";
        }

        if (args.length > 0) {
            result = result.substring(0, result.length() - 2);
        }

        System.out.println(result);
    }
}