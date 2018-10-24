package Domain;

import Domain.Cone;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConeTest {
    @Test
    public void calculateVolume() throws Exception {
        Cone cone = new Cone(3, 4);
        Assert.assertEquals(37.69911, cone.calculateVolume(), 0.00001);

        cone.setRadius(5.78);
        cone.setHeight(6.65);
        Assert.assertEquals(232.65154, cone.calculateVolume(), 0.00001);

        cone.setRadius(7.14587);
        cone.setHeight(12.96587);
        Assert.assertEquals(693.33082, cone.calculateVolume(), 0.00001);
    }

}
