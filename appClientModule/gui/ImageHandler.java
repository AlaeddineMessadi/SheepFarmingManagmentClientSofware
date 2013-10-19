package gui;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import javax.imageio.ImageIO;
import javax.imageio.ImageReadParam;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;

public class ImageHandler {
	private static int IMG_WIDTH = 285;
	private static int IMG_HEIGHT = 319;
	private BufferedImage originalImage;
	private static File originalImageFile;

	public ImageHandler(String imgPath) {
		readImageFile(imgPath);
		try {
			originalImage = ImageIO.read(originalImageFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public ImageHandler() {}

	public BufferedImage resizeImage() {
		BufferedImage resizedImage = new BufferedImage(IMG_WIDTH, IMG_HEIGHT,originalImage.getType());
		Graphics2D g = resizedImage.createGraphics();
		g.drawImage(originalImage, 0, 0, IMG_WIDTH, IMG_HEIGHT, null);
		g.dispose();
		return resizedImage;
	}

	private void readImageFile(String imgPath) {
		try {
			originalImageFile = new File(imgPath);
			if (!originalImageFile.exists())
				throw new Exception("Image file not found");
			if (!originalImageFile.canRead())
				throw new Exception("Unable to read from image file");
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}
	}
	
	public byte[] getImageBytes(BufferedImage img){
		try {
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			ImageIO.write( img, "jpg", baos );
			baos.flush();
			byte[] imageInByte = baos.toByteArray();
			baos.close();
			return imageInByte;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public Image getImage(byte[] bytes){
		try {
			ByteArrayInputStream inputStream = new ByteArrayInputStream(bytes);
			Iterator<?> readers = ImageIO.getImageReadersByFormatName("jpg");
			ImageReader reader = (ImageReader) readers.next();
			Object source = inputStream;
			ImageInputStream imgInputStream = ImageIO.createImageInputStream(source);
			reader.setInput(imgInputStream,true);
			ImageReadParam param = reader.getDefaultReadParam();
			Image img = reader.read(0,param);
			BufferedImage bufferedImage = new BufferedImage(img.getWidth(null), img.getHeight(null), BufferedImage.TYPE_INT_RGB);
			Graphics2D g2 = bufferedImage.createGraphics();
			g2.drawImage(img, null, null);
			return bufferedImage;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
		
	}
}
