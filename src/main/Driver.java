package main;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Random;

import javax.imageio.ImageIO;

public class Driver {

	public static void main(String[] args) {

		long startTime = System.nanoTime();

		Random random = new Random();

		int width = 1600;
		int height = 900;

		File image = new File("image.png");

		BufferedImage buffer = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

		// write to image
		for (int y = 0; y < height; y++) {

			for (int x = 0; x < width; x++) {

				buffer.setRGB(x, y, 16711680);

			}
		}

		try {
			ImageIO.write(buffer, "PNG", image);
		} catch (Exception e) {
			System.out.println("Could not write image: " + e);
			System.exit(1);
		}
		
		long endTime = System.nanoTime();
		
		System.out.println("Loop time = " + (endTime - startTime)/(1000000000.0F) + " seconds");

	}
}