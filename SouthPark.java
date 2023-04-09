package Pictures;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class SouthPark {
	
	private static int width = 1000;
	private static int height = 1120;
	
	private static int PIXEL_SIZE = 40;
	private static Graphics2D g;
	
	static Color gray = new Color(187,186,184);
	static Color back = new Color(123,123,122);
	static Color red = new Color(234,9,4);
	static Color yellow = new Color(226,224,9);
	static Color blue = new Color(5,147,241);
	static Color white = new Color(236,236,236);
	static Color pink = new Color(243,191,121);
	static Color brown = new Color(182,64,0);
	
    static BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
    
	public static void paint() {
		drawBackground(PIXEL_SIZE,gray);
		fillRect(10,3,5,22,Color.black);
		fillRect(4,7,17,9,Color.black);
		fillRect(4,17,17,6,Color.black);
		drawVerticalLine(9,13,3,Color.black);
		drawVerticalLine(9,13,21,Color.black);
		drawVerticalLine(19,21,2,Color.black);
		drawVerticalLine(18,22,3,Color.black);
		drawVerticalLine(19,21,22,Color.black);
		drawVerticalLine(18,22,21,Color.black);
		drawHorizontalLine(8,16,4,Color.black);
		drawHorizontalLine(6,18,5,Color.black);
		drawHorizontalLine(5,19,6,Color.black); 
		drawHorizontalLine(5,19,16,Color.black);
		drawHorizontalLine(5,19,23,Color.black);
		drawHorizontalLine(4,20,24,Color.black);
		drawHorizontalLine(10,14,4,yellow);
		drawHorizontalLine(8,9,5,blue);
		drawHorizontalLine(15,16,5,blue);
		fillRect(6,6,13,2,blue);
		drawVerticalLine(7,8,5,blue);
		drawVerticalLine(7,8,19,blue);
		drawHorizontalLine(9,15,7,yellow);
		drawHorizontalLine(6,8,8,yellow);
		drawHorizontalLine(4,5,9,yellow);
		drawHorizontalLine(16,18,8,yellow);
		drawHorizontalLine(19,20,9,yellow);
		fillRect(4,11,3,3,pink);
		fillRect(18,11,3,3,pink);
		fillRect(5,14,3,2,pink);
		fillRect(17,14,3,2,pink);
		drawHorizontalLine(8,16,15,pink);
		drawHorizontalLine(6,10,16,pink);
		drawHorizontalLine(14,18,16,pink);
		drawHorizontalLine(8,16,17,pink);
		drawHorizontalLine(6,7,10,pink);
		drawHorizontalLine(17,18,10,pink);
		drawHorizontalLine(9,15,9,white);
		drawHorizontalLine(8,16,10,white);
		drawHorizontalLine(8,16,14,white);
		fillRect(7,11,11,3,white);
		putPixel(12,9,pink);
		putPixel(12,14,pink);
		putPixel(11,11,Color.black);
		putPixel(13,11,Color.black);
		fillRect(3,20,2,2,yellow);
		fillRect(20,20,2,2,yellow);
		drawHorizontalLine(6,7,23,brown);
		drawHorizontalLine(17,18,23,brown);
		fillRect(8,19,4,4,red);
		fillRect(13,19,4,4,red);
		fillRect(6,20,2,2,red);
		fillRect(17,20,2,2,red);
		drawHorizontalLine(4,7,18,red);
		drawHorizontalLine(17,20,18,red);
		drawHorizontalLine(3,5,19,red);
		drawHorizontalLine(19,21,19,red);
		putPixel(7,19,red);
		putPixel(17,19,red);
		
        drawSquareGrid(PIXEL_SIZE,back);
		try {
			ImageIO.write(image, "jpg", new File("CARTMAN.jpg"));
			System.out.println("Guess who I am guys");
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
