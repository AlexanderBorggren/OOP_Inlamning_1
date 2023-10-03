import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class KaktusTest {

    public Växter igge = new Kaktus(20);
    public Växter ref = new Kaktus(40);

    @Test
    void getVätskeBehov() {
        assert(igge.getVätskeBehov() == 2);
        assert(ref.getVätskeBehov() == 2);

    }
}