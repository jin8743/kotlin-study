package j.lecture10;

public class JavaPenguin extends JavaAnimal implements JavaFlyable, JavaSwimable{

    private final int wingCount;

    public JavaPenguin(String species, int legCount) {
        super(species, 2);
        this.wingCount = 2;
    }

    @Override
    void move() {
        System.out.println("걷는다");
    }

    @Override
    public int getLegCount() {
        return super.getLegCount() + this.wingCount;
    }

    @Override
    public void act() {
        JavaFlyable.super.act();
        JavaSwimable.super.act();
    }
}
