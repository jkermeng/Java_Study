package quiz;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import gamePlane.ShootGame;

public class asbasb {
	public static void main(String[] args)  {
		try {
			BufferedImage read = ImageIO.read(ShootGame.class.getResource("background.png"));
			System.out.println(read);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
