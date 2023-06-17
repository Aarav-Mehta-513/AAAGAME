import de.gurkenlabs.litiengine.Game;

public class Program {
    public static void main(String[] args) {
        // meta info
        Game.info().setName("Super cool game");
        Game.info().setSubTitle("Placeholder");
        Game.info().setVersion("v0.0.1");
        Game.info().setWebsite("https://github.com/Aarav-Mehta-513/AAAGAME");
        Game.info().setDescription("A super cool side scroll shooter(placeholder)");

        // init
        Game.init(args);

        //scales rendering by 4x
        Game.graphics().setBaseRenderScale(4f);

        Game.start();
    }
}
