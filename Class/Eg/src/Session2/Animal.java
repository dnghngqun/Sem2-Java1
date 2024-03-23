package Session2;

public abstract class Animal {
    //khai bao lop
    //lớp này có thể chứa 1 or nhiều phương thức abstract

    private String name;
    public Animal(String name){
        //gan gia tri mac dinh cho name
        //   this.name = "Tom";
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void talk(){
        System.out.println("Animal kêu");
    }

    public void setName(String name) {
        this.name = name;
    }
    //abstract: Lớp "trừu tượng" -> có thể được sửa lớp con
    //Lớp con định nghĩa lại hành vi mà nó muốn
    //giống bản thiết kế
    //Tính đa hình
    //Không bao gồm code bên trong, không thể khởi tạo đối tượng
    //khác với interface, abstract class có thể viết phương thức có thân∂i
    //Thuộc về lớp abstract
    public abstract String getAnimalName();

}