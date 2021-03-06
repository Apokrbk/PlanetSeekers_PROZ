package SpaceGame.SpaceGameView;

import SpaceGame.SpaceGameModel.Missile;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * Created by Apok on 07.11.2016.
 */
class MissileView {

    private BufferedImage missilei;
    MissileView()
    {
        try
        {
            missilei = ImageIO.read(getClass().getResource("/missile.png"));
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }


    public void render(Graphics g, double x, double y)
    {
        g.drawImage(missilei, (int)x,(int)y, null);
    }

}
