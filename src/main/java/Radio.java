public class Radio {


    private int minStation = 0;
    private int maxStation = 9;

    public int currentNumberStation = minStation;

    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume = minVolume;



    public Radio(int sizeStation) {

        this.maxStation = minStation + sizeStation - 1;
    }

    public Radio() {
        int sizeStation = 10;
    }


    public int getMinStation() {
        return minStation;
    }

    public int getMaxStation() {

        return maxStation;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentNumberStation() {
        return currentNumberStation;
    }

    public void setVolume(int newVolume) {

        if (newVolume >= minVolume && newVolume <= maxVolume) {
            currentVolume = newVolume;
        }
        currentVolume = newVolume;
    }

    public void setNumberStation(int newNumberStation) {

        if (newNumberStation > maxStation) {
            return;
        }
        currentNumberStation = newNumberStation;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        } else {
            return;
        }
        currentVolume = currentVolume;
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        } else {
            return;
        }
        currentVolume = currentVolume;

    }

    public void increaseNumberStation() {
        if (currentNumberStation < maxStation) {
            currentNumberStation = currentNumberStation + 1;
        } else {
            currentNumberStation = minStation;
        }
        currentNumberStation = currentNumberStation;
    }

    public void decreaseNumberStation() {
        if (currentNumberStation > minStation) {
            currentNumberStation = currentNumberStation - 1;
        } else {
            currentNumberStation = maxStation;
        }
        currentNumberStation = currentNumberStation;
    }


    public void concreteNumberStation() {

        int newNumberStation = currentNumberStation;
        setNumberStation(newNumberStation);
    }


}
