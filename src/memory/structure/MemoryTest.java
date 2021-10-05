package memory.structure;

import java.util.ArrayList;
import java.util.List;

public class MemoryTest {
    public static void main(String[] args) {
        int age = 32;
        String name = "RichardKim";
        List<String> skills = new ArrayList<>();
        skills.add("java");
        skills.add("js");
        skills.add("Python");

        test(skills);

        for (String skill : skills) {
            System.out.println(skill);
        }

    }

    public static void test(List<String> list) {
        String mySkill = list.get(0);
        list.add("Vue");
    }
}
