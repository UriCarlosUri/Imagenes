package Pictures;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class Punisher {
	private static int width = 1000;
	private static int height = 1120;
	
	static Color softblack = new Color(32,31,29);

	
	private static int PIXEL_SIZE = 40;
	private static Graphics2D g;
	
    static BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
    
	public static void paint() {
		fillRect(3,6,19,4,Color.red);
		fillRect(9,1,7,11,Color.red);
		fillRect(4,17,2,2,Color.red);
		fillRect(19,17,2,2,Color.red);
		fillRect(5,15,3,3,Color.red);
		fillRect(17,15,3,3,Color.red);
		drawVerticalLine(7,13,3,Color.red);
		drawVerticalLine(7,13,21,Color.red);
		drawVerticalLine(15,25,9,Color.red);
		drawVerticalLine(18,26,11,Color.red);
		drawVerticalLine(18,26,13,Color.red);
		drawVerticalLine(15,25,15,Color.red);
		drawVerticalLine(16,18,12,Color.red);
		drawHorizontalLine(7,17,2,Color.red);
		drawHorizontalLine(6,18,3,Color.red);
		drawHorizontalLine(5,19,4,Color.red);
		drawHorizontalLine(4,20,5,Color.red);
		drawHorizontalLine(4,5,14,Color.red);
		drawHorizontalLine(19,20,14,Color.red);
		drawHorizontalLine(7,17,10,Color.red);
		drawHorizontalLine(8,16,11,Color.red);
		drawHorizontalLine(10,14,12,Color.red);
		drawHorizontalLine(11,13,13,Color.red);
		drawHorizontalLine(8,11,15,Color.red);
		drawHorizontalLine(13,17,15,Color.red);
		drawHorizontalLine(8,10,16,Color.red);
		drawHorizontalLine(14,16,16,Color.red);
		drawHorizontalLine(9,15,18,Color.red);
		putPixel(4,13,Color.red);
		putPixel(20,13,Color.red);
		putPixel(12,14,Color.red);
		putPixel(10,17,Color.red);
		putPixel(14,17,Color.red);
        drawSquareGrid(PIXEL_SIZE, softblack);
		try {
			ImageIO.write(image, "jpg", new File("PUNISHER.jpg"));
			System.out.println("Time to Punish");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void drawVerticalLine(int a, int b, int x, Color c){
   	    g.setColor(c);
    	for(int i=a;i<=b;i++){
    		 putPixel(x, i, c);
        }
    }
    
    private static void drawHorizontalLine(int a, int b, int y, Color c){
    	g.setColor(c);
        for(int i=a;i<=b;i++){
        	 putPixel(i, y, c);
        }
    }
    private static void putPixel(int x, int y, Color c){       
 	   g.setColor(c);
 	   g.fillRect(x * PIXEL_SIZE, y * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);    
     }
    private static void fillRect(int x, int y, int width, int height, Color c){
    	g.setColor(c);
    	g.fillRect(x * PIXEL_SIZE, y * PIXEL_SIZE, width*PIXEL_SIZE, height*PIXEL_SIZE);
    }
    private static void drawSquareGrid(int size, Color c) {
    	g.setColor(c);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) { 
                g.drawRect(i * PIXEL_SIZE, j * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);
            }
        }
    }
	public static void main(String[] args) {
		g = image.createGraphics();
		paint();
	}

}
