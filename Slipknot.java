package Pictures;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class Slipknot {
	private static int width = 800;
	private static int height = 1600;
	
	private static int PIXEL_SIZE = 40;
	private static Graphics2D g;
	
	static Color darkred = new Color(122,22,20);
	static Color softblack = new Color(38,41,40);
	static Color red = new Color(229,16,14);
	
	
    static BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
    
	public static void paint() {
		drawBackground(PIXEL_SIZE,darkred);
		fillRect(2,6,14,26,red);
		fillRect(7,2,3,5,red);
		fillRect(1,5,3,3,red);
		fillRect(3,32,9,5,red);
		fillRect(1,35,2,3,red);
		fillRect(9,37,3,3,red);
		fillRect(17,11,2,3,red);
		fillRect(12,31,4,3,red);
		drawVerticalLine(0,20,7,red);
		drawVerticalLine(10,18,1,red);
		drawVerticalLine(14,17,0,red);
		drawVerticalLine(22,30,1,red);
		drawVerticalLine(24,29,0,red);
		drawVerticalLine(8,32,16,red);
		drawVerticalLine(12,33,17,red);
		drawVerticalLine(18,25,18,red);
		drawVerticalLine(28,32,18,red);
        drawHorizontalLine(7,10,4,red);
        drawHorizontalLine(6,15,5,red);
        drawHorizontalLine(13,15,4,red);
        drawHorizontalLine(6,8,1,red);
        putPixel(14,3,red);
        putPixel(2,4,red);
        putPixel(2,34,red);
        putPixel(0,36,red);
        putPixel(19,12,red);
        putPixel(12,34,red);
        putPixel(14,34,red);
		fillRect(6,6,9,2,softblack);
		fillRect(3,7,3,3,softblack);
		fillRect(2,10,3,3,softblack);
		fillRect(3,13,2,2,softblack);
		fillRect(4,15,2,2,softblack);
		fillRect(5,16,2,2,softblack);
		fillRect(6,17,5,2,softblack);
		fillRect(8,18,4,2,softblack);
		fillRect(8,14,8,2,softblack);
		fillRect(7,13,2,2,softblack);
		fillRect(6,12,2,2,softblack);
		fillRect(15,15,2,2,softblack);
		fillRect(16,18,2,2,softblack);
		fillRect(4,20,3,3,softblack);
		fillRect(3,21,6,2,softblack);
		fillRect(2,22,2,2,softblack);
		fillRect(8,22,2,2,softblack);
		fillRect(1,24,2,6,softblack);
		fillRect(9,23,2,4,softblack);
		fillRect(6,28,3,2,softblack);
		fillRect(2,29,2,2,softblack);
		fillRect(3,30,2,2,softblack);
		fillRect(5,31,2,2,softblack);
		fillRect(6,32,4,3,softblack);
		fillRect(9,35,2,2,softblack);
		fillRect(3,34,4,2,softblack);
		fillRect(10,31,2,3,softblack);
		drawVerticalLine(2,9,8,softblack);
		drawVerticalLine(4,15,14,softblack);
		drawVerticalLine(5,7,2,softblack);
		drawVerticalLine(20,22,11,softblack);
		drawVerticalLine(20,26,12,softblack);
		drawVerticalLine(8,16,15,softblack);
		drawVerticalLine(12,15,13,softblack);
		drawVerticalLine(4,5,9,softblack);
		drawVerticalLine(15,19,16,softblack);
		drawVerticalLine(18,25,17,softblack);
		drawVerticalLine(14,17,1,softblack);
		drawVerticalLine(25,27,4,softblack);
		drawVerticalLine(27,28,5,softblack);
		drawVerticalLine(27,28,11,softblack);
		drawVerticalLine(35,39,10,softblack);
		drawVerticalLine(18,33,14,softblack);
		drawVerticalLine(30,32,12,softblack);
		drawVerticalLine(28,31,13,softblack);
		drawVerticalLine(21,29,15,softblack);
		drawVerticalLine(27,30,16,softblack);
		drawVerticalLine(28,32,17,softblack);
        drawHorizontalLine(13,15,8,softblack);
        drawHorizontalLine(6,8,8,softblack);
        drawHorizontalLine(10,12,20,softblack);
        drawHorizontalLine(16,18,12,softblack);
        drawHorizontalLine(11,14,13,softblack);
        drawHorizontalLine(1,2,17,softblack);
        drawHorizontalLine(2,3,18,softblack);
        drawHorizontalLine(3,4,19,softblack);
        drawHorizontalLine(8,9,27,softblack);
        drawHorizontalLine(1,2,36,softblack);
		putPixel(7,1,softblack);
		putPixel(16,11,softblack);
		putPixel(7,11,softblack);
		putPixel(2,35,softblack);
		putPixel(5,24,softblack);
		putPixel(10,29,softblack);
		putPixel(13,17,softblack);
		
        drawSquareGrid(PIXEL_SIZE, Color.black);
		try {
			ImageIO.write(image, "jpg", new File("SLIPKNOT.jpg"));
			System.out.println("Angels Lie To Keep Control");
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
