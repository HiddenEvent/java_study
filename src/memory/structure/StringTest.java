package memory.structure;

public class StringTest {
    public static void main(String[] args) {
        String name = "kang";
        System.out.println("현재 name : " + name);
        changeName(name);
        System.out.println("메서드 실행 후 name : " + name);

        TestDto testDto = new TestDto("ttt");
        System.out.println(testDto.getName());
        changeDtoName(testDto);
        System.out.println(testDto.getName());
        testDto.changeNameTest();
        System.out.println(testDto.getName());

    }

    /* 메서드의 매개 변수로 String 타입을 넘길 경우 */
    // 1. String 은 immutable(불변) 한 객체이다.
    // 2. String 을 메개 변수로 넘길 경우에는 복사한 값을 생성하여 가르키게 된다.
    // 3. Boolean, Integer, Float, Long, Double 같은 클래스 들은 대표적인 Immutable 한 Wrapper 클래스이다.
    // 4. mutable 한 객체눈 List, ArrayList, HashMap 등의 컬랙션들이 대표적인 mutable 객체이다.
    // 5. String 을 mutable 하게 바꾸기 위해서는 StringBuilder를 사용하면 된다.
    public static void changeName(String s) {
        s += " append ";
    }

    public static void changeDtoName(TestDto testDto){
        testDto.setName(testDto.getName() + " append ");
    }
}
