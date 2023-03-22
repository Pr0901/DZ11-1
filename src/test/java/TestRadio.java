import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestRadio {

    @Test
    public void increaseVolumeMiddle() {
        Radio volume = new Radio();
        volume.setVolume(5);

        volume.increaseVolume();
        int expected = 6;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void increaseVolumeMax() {
        Radio volume = new Radio();
        volume.setVolume(10);

        volume.increaseVolume();
        int expected = 10;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void decreaseVolumeMiddle() {
        Radio volume = new Radio();
        volume.setVolume(5);

        volume.decreaseVolume();
        int expected = 4;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void decreaseVolumeMin() {
        Radio volume = new Radio();
        volume.setVolume(0);

        volume.decreaseVolume();
        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

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
        int expected = 0;
        int actual = numberStation.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);

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
        int expected = 9;
        int actual = numberStation.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);

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


}
