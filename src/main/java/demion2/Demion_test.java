package demion2;

public class Demion_test {
    public static void main(String[] args) {
        Demion math = new Demion();
        System.out.println(math.getMax(3,4));
        System.out.println(math.getMax(2,3,4));
        System.out.println(math.getMax(new  int[]{1,2,3,4,5}));
    }
}
