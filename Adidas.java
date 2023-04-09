package Pictures;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class Adidas {
	
	private static int width = 920;
	private static int height = 600;
	
	private static int PIXEL_SIZE = 40;
	private static Graphics2D g;
	
	static Color blue = new Color(4,124,236);
	
	
    static BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
    
	public static void paint() {
		drawBackground(PIXEL_SIZE,blue);
        drawHorizontalLine(2,6,12,Color.black);
        drawHorizontalLine(3,6,11,Color.black);
        drawHorizontalLine(9,13,12,Color.black);
        drawHorizontalLine(16,20,12,Color.black);
        drawHorizontalLine(15,19,11,Color.black);
        drawHorizontalLine(13,17,8,Color.black);
        drawHorizontalLine(12,14,3,Color.black);
        fillRect(12,6,5,2,Color.black);
        fillRect(11,4,5,2,Color.black);
        fillRect(14,9,5,2,Color.black);
        fillRect(8,7,3,5,Color.black);
        drawVerticalLine(9,12,11,Color.black);
        drawVerticalLine(10,12,12,Color.black);
        drawVerticalLine(7,9,7,Color.black);
        putPixel(6,8,Color.black);
        putPixel(13,2,Color.black);
        putPixel(9,6,Color.black);
        putPixel(5,10,Color.black);
        drawSquareGrid(PIXEL_SIZE, Color.black);
		try {
			ImageIO.write(image, "jpg", new File("ADIDAS.jpg"));
			System.out.println("Impossible is nothing");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void drawBackground(int size, Color c) {
    	g.setColor(c);
    	for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                g.fillRect(i * PIXEL_SIZE, j * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);                
            }
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
