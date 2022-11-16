package three;

public class StringDemo {
    public static void main(String[] args) {
        char slovo = 'A';
        String name = "Eldar";
        String surname = "Saric";
        String fullName = surname + " " + name;
        System.out.println(fullName);
        //varijacija na temu
        int number = 23;
        int result = slovo + number; //A23
        System.out.println(result);
    }
}
