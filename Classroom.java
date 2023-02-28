public class Classroom {
    public static void main(String[] args) {
        Wilder charly = new Wilder("charly", true);
        Wilder toto = new Wilder("toto", false);

        System.out.println(charly.whoAmI());
        System.out.println(toto.whoAmI());
    }
}
