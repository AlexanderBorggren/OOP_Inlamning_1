import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalmTest {

    Växter laura = new Palm(500);
    Växter olof = new Palm(100);
    Växter ref = new Palm(300);

    @Test
    void getVätskeBehov() {
        assert(laura.getVätskeBehov() == 250);
        assert(olof.getVätskeBehov() == 50);
        assert(ref.getVätskeBehov() == 150);

    }
}