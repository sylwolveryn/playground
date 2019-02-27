package hu.face5.playground;

public class RandomWrapper {
    private RandomModel randomModel;

    public RandomWrapper(RandomModel randomModel) {
        this.randomModel = randomModel;
    }


    public boolean isItSafe() {
        return randomModel.isItSafe();
    }
}
