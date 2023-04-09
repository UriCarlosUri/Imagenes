package Pictures;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class Pixar {
	
	private static int width = 1160;
	private static int height = 920;
	
	private static int PIXEL_SIZE = 40;
	private static Graphics2D g;
	
	static Color backblue = new Color(189,226,248);
	static Color blue = new Color(43,93,161);
	static Color red = new Color(178,51,31);
	static Color yellow = new Color(218,179,64);
	
    static BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
    
	public static void paint() {
		drawBackground(PIXEL_SIZE,backblue);
		fillRect(11,1,6,20,yellow);
		fillRect(9,2,10,19,yellow);
		fillRect(4,8,21,6,yellow);
		fillRect(5,7,19,10,yellow);
		drawHorizontalLine(8,20,3,yellow);
		drawHorizontalLine(7,21,4,yellow);
		drawHorizontalLine(6,22,5,yellow);
		drawHorizontalLine(5,22,6,yellow);
		drawHorizontalLine(6,22,17,yellow);
		drawHorizontalLine(7,21,18,yellow);
		drawHorizontalLine(8,20,19,yellow);
		drawHorizontalLine(9,18,20,yellow);
		drawHorizontalLine(12,16,21,blue);
		drawHorizontalLine(19,20,3,blue);
		drawHorizontalLine(20,21,4,blue);
		drawHorizontalLine(9,18,20,blue);
		drawHorizontalLine(12,18,19,blue);
		drawHorizontalLine(14,19,18,blue);
		drawHorizontalLine(15,20,17,blue);
		drawHorizontalLine(16,21,16,blue);
		drawHorizontalLine(17,22,15,blue);
		drawHorizontalLine(18,22,14,blue);
		drawVerticalLine(7,12,23,blue);
		fillRect(20,5,3,11,blue);
		fillRect(19,12,4,4,blue);
		fillRect(7,4,4,6,red);
		fillRect(4,8,9,2,red);
		fillRect(10,9,4,2,red);
		drawVerticalLine(3,10,8,red);
		drawVerticalLine(10,13,6,red);
		drawVerticalLine(10,15,7,red);
		drawVerticalLine(10,11,14,red);
		drawHorizontalLine(7,13,4,red);
		drawHorizontalLine(11,14,3,red);
		drawHorizontalLine(7,11,5,red);
		drawHorizontalLine(6,10,6,red);
		drawHorizontalLine(5,11,7,red);
		
		
        drawSquareGrid(PIXEL_SIZE, Color.black);
		try {
			ImageIO.write(image, "jpg", new File("PELOTA.jpg"));
			System.out.println("Lampara");
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
