public class UC7{

    public static void main(String[] args) {

        String result = "Hello ";

        for (int i = 0; i < args.length; i++) {

            result = result + args[i];

            if (i < args.length - 1) {
                result = result + ", ";
            }
        }

        System.out.println(result);
    }
}