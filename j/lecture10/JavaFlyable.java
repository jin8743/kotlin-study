package j.lecture10;

public interface JavaFlyable {

    default void act() {
        System.out.println("파닥 파닥");
    }

}
