package Pictures;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class Snoopy {
	
	private static int width = 760;
	private static int height = 1040;
	
	private static int PIXEL_SIZE = 40;
	private static Graphics2D g;
	
	static Color gray = new Color(56,56,56);
	static Color red = new Color(165,55,57);
	static Color blue = new Color(188,230,245);
	
    static BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
    
	public static void paint() {
		drawBackground(PIXEL_SIZE,blue);
		fillRect(9,1,5,10,gray);
		fillRect(8,2,3,23,gray);
		fillRect(8,2,7,9,gray);
		drawHorizontalLine(7,15,3,gray);
		fillRect(4,4,13,7,gray);
		drawVerticalLine(5,9,3,gray);
		fillRect(1,6,2,2,gray);
		putPixel(2,8,gray);
		drawVerticalLine(6,10,17,gray);
		drawHorizontalLine(6,11,11,gray);
		drawHorizontalLine(13,16,11,gray);
		drawHorizontalLine(14,15,12,gray);
		fillRect(7,13,5,8,gray);
		drawVerticalLine(14,19,6,gray);
		drawVerticalLine(16,18,5,gray);
		fillRect(5,23,8,2,gray);
		drawHorizontalLine(6,11,22,gray);
		drawVerticalLine(16,17,12,gray);
		drawVerticalLine(19,21,12,gray);
		putPixel(13,20,gray);
		putPixel(11,21,gray);
		fillRect(9,2,5,3,Color.white);
		drawHorizontalLine(8,14,3,Color.white);
		drawHorizontalLine(7,15,4,Color.white);
		fillRect(4,5,4,5,Color.white);
		drawVerticalLine(6,8,3,Color.white);
		drawHorizontalLine(9,12,5,Color.white);
		fillRect(9,5,3,6,Color.white);
		fillRect(6,7,3,4,Color.white);
		drawHorizontalLine(9,10,11,Color.white);
		drawHorizontalLine(8,10,12,red);
		drawHorizontalLine(8,10,13,Color.white);
		fillRect(7,14,2,6,Color.white);
		drawVerticalLine(16,18,6,Color.white);
		drawVerticalLine(13,17,10,Color.white);
		drawVerticalLine(16,17,11,Color.white);
		drawVerticalLine(18,23,9,Color.white);
		drawHorizontalLine(6,11,23,Color.white);
		drawHorizontalLine(8,10,22,Color.white);
		drawHorizontalLine(8,12,20,Color.white);
		putPixel(10,19,Color.white);
		
		
		
        drawSquareGrid(PIXEL_SIZE,Color.black);
		try {
			ImageIO.write(image, "jpg", new File("SNOOPY.jpg"));
			System.out.println("Peanuts");
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
