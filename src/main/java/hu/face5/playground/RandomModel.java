package hu.face5.playground;

public class RandomModel {
    private boolean trusy;
    private boolean falsy;

    public RandomModel() {
        trusy = true;
        falsy = false;
    }

    // https://www.youtube.com/watch?v=c-OviftusB8
    public boolean isItSafe() {
        return trusy & falsy;
    }

}
