import javaconfig.JavaConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import races.BaseRace;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {JavaConfig.class})
public class JavaConfigBasedApp {

    @Autowired
    BaseRace human;

    @Test
    public void testJavaConfigApp() {
        human.respondToAction();
        assertEquals(human.getMessage(), "Нужно больше зиггуратов!");
    }

}
