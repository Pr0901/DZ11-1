import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestRadio {

    @Test
    public void increaseVolumeMiddle() {
        Radio volume = new Radio();
        volume.setVolume(50);

        volume.increaseVolume();
        int expected = 51;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void increaseVolumeMax() {
        Radio volume = new Radio();
        volume.setVolume(100);

        volume.increaseVolume();


        Assertions.assertEquals(volume.getMaxVolume(), volume.getCurrentVolume());

    }

    @Test
    public void decreaseVolumeMiddle() {
        Radio volume = new Radio();
        volume.setVolume(50);

        volume.decreaseVolume();
        int expected = 49;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void decreaseVolumeMin() {
        Radio volume = new Radio();
        volume.setVolume(0);

        volume.decreaseVolume();

        Assertions.assertEquals(volume.getMinVolume(), volume.getCurrentVolume());

    }

    @Test
    public void increaseNumberStationMiddle() {
        Radio numberStation = new Radio();
        numberStation.setNumberStation(4);

        numberStation.increaseNumberStation();
        int expected = 5;
        int actual = numberStation.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void increaseNumberStationMax() {
        Radio numberStation = new Radio();
        numberStation.setNumberStation(9);

        numberStation.increaseNumberStation();

        Assertions.assertEquals(numberStation.getMinStation(), numberStation.getCurrentNumberStation());

    }

    @Test
    public void decreaseNumberStationMiddle() {
        Radio numberStation = new Radio();
        numberStation.setNumberStation(4);

        numberStation.decreaseNumberStation();
        int expected = 3;
        int actual = numberStation.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void decreaseNumberStationMin() {
        Radio numberStation = new Radio();
        numberStation.setNumberStation(0);

        numberStation.decreaseNumberStation();

        Assertions.assertEquals(numberStation.getMaxStation(), numberStation.getCurrentNumberStation());

    }


    @Test
    public void numberStationRight() {
        Radio numberStation = new Radio();
        numberStation.setNumberStation(8);


        numberStation.concreteNumberStation();
        int expected = 8;
        int actual = numberStation.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numberStationWrong() {
        Radio numberStation = new Radio();
        numberStation.setNumberStation(15);


        numberStation.concreteNumberStation();
        int expected = 0;
        int actual = numberStation.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numberStationMoreRight() {
        Radio numberStation = new Radio(15);
        numberStation.setNumberStation(14);


        numberStation.concreteNumberStation();
        int expected = 14;
        int actual = numberStation.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numberStationMin() {
        Radio numberStation = new Radio(15);
        numberStation.setNumberStation(0);


        numberStation.concreteNumberStation();
        int expected = 0;
        int actual = numberStation.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }


}
