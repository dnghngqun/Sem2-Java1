import static java.lang.System.out;

/**
 * Lớp Client sử dụng lớp Student để xây dựng chương trình java theo kịch bản.
 *
 * @author (Dang Hong Quan)
 * @version (21.0.2)
 */
public class Students {
    private int id;
    private String name;
    private boolean gender;// true is male, false is female

    public Students(int id, String name, Boolean gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    // getter
    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Boolean isMale() {
        return this.gender;
    }

    // setter
    public int setId(int id) {
        return this.id = id;
    }

    public String setName(String name) {
        return this.name = name;
    }

    public Boolean setMale(Boolean gender) {
        return this.gender = gender;
    }

    public void printInfo() {
        String genderConvert = this.isMale() ? "Male" : "Female";
        out.println("-----------------------------------");
        out.println("| ID | Name   | Gender |");
        out.printf("| %-2d | %-6s | %-6s |\n", this.id, this.name, genderConvert);
        out.println("-----------------------------------");

    }
}