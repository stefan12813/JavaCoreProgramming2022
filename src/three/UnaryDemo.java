package three;

public class UnaryDemo {
    public static void main(String[] args) {
        int number = +1;
        System.out.println(number);
        number = -number;
        System.out.println(number);
        number = 1;
        number++;
        System.out.println(number);
        number = 1;
        ++number;
        System.out.println(number);
        number = 1;
        System.out.println(number++);//1
        System.out.println(number);//2
        number = 1;
        System.out.println(++number);//2
        System.out.println(number);//2
        number = 1;
        System.out.println(number--);//1
        System.out.println(number);//0
        boolean uspjeh = true;
        System.out.println(!uspjeh);

    }
}
