import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KöttätandeTest {
    Växter meatloaf = new Köttätande(70);
    Växter ref = new Köttätande(50);
    @Test
    void getVätskeBehov() {
        assert(meatloaf.getVätskeBehov() == 24);
        assert(ref.getVätskeBehov() == 20);
    }
}