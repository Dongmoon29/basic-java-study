package StringClass;

public class StringClassPrac {


    public static void main(String[] args) {
        String string = "String";
        String copiedString = string;
        String string2 = new String("String").intern();
        System.out.println(System.identityHashCode(string));
        System.out.println(System.identityHashCode(string2));
        System.out.println(System.identityHashCode(copiedString));

        string = "Hello";
        // copiedString은 original string 주소값을 가지고 있다.
        // string = "Hello"; 은 new String()을 호출하여 새로운 주소값을 할당 받으므로
        // copiedString의 값 (original string 값 => string)을 가지고 있는 것을 확인할 수 있다.
        System.out.println(copiedString);
        System.out.println(System.identityHashCode(copiedString));
        System.out.println(System.identityHashCode(string));


        // String 객체에 값을 재할당 하는 것은 (ex : string = "string" => string = "Hello")
        // 새로운 객체을 생성한 다음 새로운 객체의 주소값을 변수에 저장한다는 것을 말한다.
        // 그에 따라 만약 String 객체의 값을 재할당하는 경우가 생긴다면 StringBuffer클래스를 활용하자


        StringBuffer sb = new StringBuffer();
//        System.out.println(System.identityHashCode(sb));
//        sb.append(string);
//        System.out.println(System.identityHashCode(sb));

    }

}
