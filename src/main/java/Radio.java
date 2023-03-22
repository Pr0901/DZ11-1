public class Radio {


    private int currentVolume;

    private int currentNumberStation;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentNumberStation() {
        return currentNumberStation;
    }

    public void setVolume(int newVolume) {

        if (newVolume > 0 && newVolume < 10) {
            currentVolume = newVolume;
        }
        currentVolume = newVolume;
    }

    public void setNumberStation(int newNumberStation) {

        if (newNumberStation > 9) {
            return;
        }
        currentNumberStation = newNumberStation;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        } else {
            return;
        }
        currentVolume = currentVolume;
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else {
            return;
        }
        currentVolume = currentVolume;

    }

    public void increaseNumberStation() {
        if (currentNumberStation < 9) {
            currentNumberStation = currentNumberStation + 1;
        } else {
            currentNumberStation = 0;
        }
        currentNumberStation = currentNumberStation;
    }

    public void decreaseNumberStation() {
        if (currentNumberStation > 0) {
            currentNumberStation = currentNumberStation - 1;
        } else {
            currentNumberStation = 9;
        }
        currentNumberStation = currentNumberStation;
    }


    public void concreteNumberStation() {

        int newNumberStation = currentNumberStation;
        setNumberStation(newNumberStation);
    }


}
