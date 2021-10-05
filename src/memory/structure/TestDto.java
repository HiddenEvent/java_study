package memory.structure;

public class TestDto {
    private String name;

    public TestDto(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void changeNameTest(){
        this.name += " append ";
    }
}
