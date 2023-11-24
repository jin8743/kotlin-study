package javaCode.lecture10;

public class JavaCat extends JavaAnimal {

    public JavaCat(String species) {
        super(species, 4);
    }

    @Override
    void move() {
        System.out.println("고양이가 걷는다");
    }
}
