public class HolaMundo {
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        System.out.println(name()+apellido());
    }

    private static String apellido() {return " Torres";}
    private static String name() {
        return "Danko";
    }
}
