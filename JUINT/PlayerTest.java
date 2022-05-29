import org.junit.jupiter.api.*;

public class PlayerTest {
    static Player tester1;
     Player tester2;
  String message;

    Exception ex = null;

    @BeforeAll
    static void setupPlayer1() {
        try {
            tester1 = Player.createPlayer("Tester1");
        } catch (NoMorePlayersAllowedException e) {
        }
    }
    @Test
    void getName(){
        String name = tester1.getName();
        Assertions.assertEquals(name, "Tester1");
    }
    @Test
    void getToken(){
        char token = tester1.getToken();
        Assertions.assertEquals(token, 'X');
    }
    @Test
    public void create() throws NoMorePlayersAllowedException {
        tester2 = Player.createPlayer("Tester2");
        Assertions.assertTrue(tester2 != null);

    }
    @Test
    public void noMorePlayersAllowedException(){
        try {
            Player tester3 = Player.createPlayer("Tester3");
        } catch (NoMorePlayersAllowedException e) {
            ex = e;
        }
        Assertions.assertTrue(ex instanceof NoMorePlayersAllowedException);
    }
}
