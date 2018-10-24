package Domain;

import Domain.Sphere;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SphereTest {
    @Test
    public void calculateVolume() throws Exception {
        Sphere sphere = new Sphere(5.0);
        Assert.assertEquals(523.59877, sphere.calculateVolume(), 0.00001);

        sphere.setRadius(13.25);
        Assert.assertEquals( 9743.9768643435, sphere.calculateVolume(), 0.00000001);

        sphere.setRadius(25.6384);
        Assert.assertEquals(70592.955717374, sphere.calculateVolume(), 0.000000001);
    }

}