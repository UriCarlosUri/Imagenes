package Pictures;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class Jordan1 {
	
	private static int width = 1360;
	private static int height = 880;
	
	private static int PIXEL_SIZE = 40;
	private static Graphics2D g;
	
	static Color green = new Color(177,177,177);
	static Color red = new Color(179,15,19);
	static Color black = new Color(30,27,27);
	static Color white = new Color(228,229,228);
	
    static BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
    
	public static void paint() {
		drawBackground(PIXEL_SIZE,green);
		drawHorizontalLine(1,30,20,red);
		fillRect(1,18,31,2,white);
		drawHorizontalLine(26,31,19,red);
		fillRect(25,17,8,2,white);
		putPixel(32,18,red);
		fillRect(1,13,4,5,red);
		drawHorizontalLine(2,3,12,red);
		drawVerticalLine(14,17,5,red);
		drawVerticalLine(16,17,6,red);
		putPixel(7,17,red);
		drawHorizontalLine(8,18,17,white);
		fillRect(19,16,6,2,red);
		fillRect(25,15,6,2,red);
		putPixel(31,16,red);
		drawHorizontalLine(6,7,15,white);
		drawHorizontalLine(7,9,16,white);
		drawHorizontalLine(16,18,16,white);
		drawHorizontalLine(23,24,15,white);
		fillRect(6,13,2,2,black);
		fillRect(8,14,3,2,black);
		fillRect(10,15,6,2,black);
		fillRect(14,14,3,2,black);
		fillRect(20,13,3,3,red);
		fillRect(22,13,5,2,white);
		fillRect(17,13,3,3,white);
		drawHorizontalLine(22,29,14,white);
		fillRect(10,10,4,4,white);
		drawHorizontalLine(11,13,14,white);
		fillRect(8,11,3,3,white);
		drawHorizontalLine(2,4,11,black);
		drawHorizontalLine(4,5,12,black);
		drawHorizontalLine(5,6,13,black);
		drawHorizontalLine(2,3,9,white);
		putPixel(2,10,black);
		drawHorizontalLine(3,6,10,white);
		drawHorizontalLine(5,16,11,white);
		drawHorizontalLine(6,10,12,white);
		fillRect(16,12,2,2,white);
		fillRect(15,11,2,2,white);
		drawHorizontalLine(14,15,13,black);
		putPixel(14,12,black);
		fillRect(2,3,4,3,black);
		drawHorizontalLine(2,3,6,black);
		fillRect(6,2,4,2,black);
		drawHorizontalLine(6,7,4,black);
		fillRect(2,7,8,2,red);
		fillRect(4,6,5,4,red);
		fillRect(8,4,4,3,red);
		putPixel(7,10,red);
		drawVerticalLine(7,8,9,red);
		drawHorizontalLine(6,12,5,red);
		putPixel(11,9,white);
		drawHorizontalLine(8,9,10,black);
		drawHorizontalLine(9,10,9,black);
		fillRect(10,7,2,2,black);
		putPixel(12,6,black);
		drawHorizontalLine(10,11,1,white);
		putPixel(11,2,white);
		drawHorizontalLine(10,11,3,red);
		putPixel(10,2,red);
		drawVerticalLine(1,2,12,red);
		drawVerticalLine(3,4,12,white);
		drawHorizontalLine(6,7,7,black);
		drawHorizontalLine(7,8,6,black);
		drawHorizontalLine(18,22,12,red);
		drawHorizontalLine(17,20,11,red);
		drawHorizontalLine(14,18,10,red);
		drawHorizontalLine(12,16,9,red);
		drawHorizontalLine(12,14,8,red);
		drawHorizontalLine(12,13,7,red);
		putPixel(13,8,black);
		putPixel(15,9,black);
		putPixel(17,10,black);
		putPixel(19,11,black);
		putPixel(21,12,black);

		
        drawSquareGrid(PIXEL_SIZE,Color.black);
		try {
			ImageIO.write(image, "jpg", new File("J1.jpg"));
			System.out.println("AIR");
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
