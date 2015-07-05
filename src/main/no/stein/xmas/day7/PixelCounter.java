package no.stein.xmas.day7;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.Map;

import javax.imageio.ImageIO;

import com.google.common.collect.Maps;

public class PixelCounter {

	private BufferedImage image;

	public PixelCounter(String filename) {
		try {
			URL resource = this.getClass().getResource(filename);
			image = ImageIO.read(resource);
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}

	public Map<Integer, Integer> usages() {
		Map<Integer, Integer> usages = Maps.newHashMap();
		int width = image.getWidth();
		int height = image.getHeight();
		System.out.println("width, height: " + width + ", " + height);

		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				int pixel = image.getRGB(j, i);
				incrementColorCount(pixel, usages);
			}
		}
		return usages;
	}

	private void incrementColorCount(int pixel, Map<Integer, Integer> usages) {
		Integer oldValue = usages.get(pixel) == null ? 0 : usages.get(pixel);
		usages.put(pixel, oldValue + 1);
	}
}
