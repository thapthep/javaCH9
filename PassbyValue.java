public class PassbyValue {
    public static void main(String[] args) {
        NUmber n1 = new NUmber();
        n1.number = 100;
        AddOne(n1);
        System.out.println(n1.number);
    }
    static void AddOne(NUmber num) {
        num.number++;
    }
}
