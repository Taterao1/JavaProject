package JavaPractice1;

public class Demo1 {
    static int fact = 1;

    public static void main(String[] args) {
        int no = 5;
        Demo1 obj = new Demo1();
        obj.cal(no);
        System.out.println(fact);
    }

    public void cal(int no) {
        if (no > 0) {
            fact = fact * no;
            cal(no - 1);
        }
    }
}
