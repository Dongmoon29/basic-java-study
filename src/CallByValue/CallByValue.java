package CallByValue;

public class CallByValue {
    public static void main(String[] args) {
        CallByValue cv = new CallByValue();
        Person p = new Person("Dongmoon");
        System.out.println("Before call callbyvalue " + p.getName());
        System.out.println(System.identityHashCode(p));
        cv.callByValue(p);
        System.out.println("After call callbyvalue " + p.getName());
        System.out.println(System.identityHashCode(p));

    }

    private void callByValue(Person p) {
        System.out.println(System.identityHashCode(p));
        p.name = "Changed!";
    }
}
