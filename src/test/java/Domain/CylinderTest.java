package Domain;

import Domain.Cylinder;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

//import Cylinder;

public class CylinderTest {
    @Test
    public void calculateVolume() throws Exception {
        Cylinder cylinder = new Cylinder(5.0, 6.0);
        Assert.assertEquals(471.23889, cylinder.calculateVolume(), 0.00001);

        cylinder.setRadius(5.88);
        cylinder.setHeight(2.37);
        Assert.assertEquals(257.42627, cylinder.calculateVolume(), 0.00001);

        cylinder.setRadius(17.6535);
        cylinder.setHeight(5.3645);
        Assert.assertEquals(5252.19408, cylinder.calculateVolume(), 0.00001);
    }

}
