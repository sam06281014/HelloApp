public class UC4 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello Guest");
        } else {
            for (String name : args) {
                System.out.println("Hello " + name);
            }
        }
    }
}