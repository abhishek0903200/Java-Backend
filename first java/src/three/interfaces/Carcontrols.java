package three.interfaces;

public interface Carcontrols {
    void turnLeft();
    void turnRight();
    void applyBrakes();

    default void acceleration(){}
}
