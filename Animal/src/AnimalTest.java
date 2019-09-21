import org.junit.Before;

import static org.junit.Assert.*;

public class AnimalTest {
    private Animal animal;


    @Before
    public void animalObjects() {
        animal = new Animal(4, 70, true, "Cheetah");

    }
    @org.junit.Test
    public void getNumLegs() {
        int expected = 4;
        int actual = animal.getNumLegs();
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void setNumLegs() {
        int expected = 4;
        animal.setNumLegs(expected);
        int actual = animal.getNumLegs();
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void getTopSpeed() {
        int expected = 70;
        int actual = animal.getTopSpeed();
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void setTopSpeed() {
        int expected = 30;
        animal.setNumLegs(expected);
        int actual = animal.getNumLegs();
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void getEndangered() {
        boolean expected = true;
        boolean actual = animal.getEndangered();
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void setEndangered() {
        boolean expected = true;
        animal.setEndangered(expected);
        boolean actual = animal.getEndangered();
        assertEquals(expected, actual);

    }

    @org.junit.Test
    public void getName() {
        String expected = "cheetah";
        String actual = animal.getName();
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void setName() {
        String expected = "Lion";
        animal.setName(expected);
        String actual = animal.getName();
        assertEquals(expected, actual);
    }
}