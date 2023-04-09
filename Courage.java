package Pictures;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class Courage {
	
	private static int width = 920;
	private static int height = 1240;
	
	private static int PIXEL_SIZE = 40;
	private static Graphics2D g;
	
	static Color pink = new Color(241,178,218);
	static Color brown = new Color(82,58,49);
	
    static BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
    
	public static void paint() {
		drawBackground(PIXEL_SIZE,Color.gray);
		fillRect(2,1,4,3,Color.black);
		putPixel(1,2,Color.black);
		fillRect(17,1,4,3,Color.black);
		putPixel(21,2,Color.black);
		fillRect(6,4,11,20,Color.black);
		drawHorizontalLine(10,12,3,Color.black);
		fillRect(5,2,2,3,Color.black);
		putPixel(7,3,Color.black);
		fillRect(16,2,2,3,Color.black);
		putPixel(15,3,Color.black);
		drawHorizontalLine(5,17,12,Color.black);
		fillRect(4,13,15,4,Color.black);
		drawHorizontalLine(2,20,14,Color.black);
		drawHorizontalLine(3,19,16,Color.black);
		drawHorizontalLine(7,15,24,Color.black);
		drawHorizontalLine(8,14,25,Color.black);
		fillRect(8,26,3,3,Color.black);
		fillRect(12,26,3,3,Color.black);
		putPixel(9,29,Color.black);
		putPixel(13,29,Color.black);
		drawHorizontalLine(2,5,2,brown);
		drawHorizontalLine(17,20,2,brown);
		drawVerticalLine(3,4,6,brown);
		drawVerticalLine(3,4,16,brown);
		putPixel(5,3,brown);
		putPixel(17,3,brown);
		drawHorizontalLine(6,16,12,pink);
		fillRect(8,5,7,8,Color.white);
		fillRect(7,6,9,6,Color.white);
		fillRect(10,4,3,2,pink);
		drawVerticalLine(5,11,11,pink);
		fillRect(10,12,3,2,pink);
		fillRect(5,13,3,3,pink);
		fillRect(15,13,3,3,pink);
		drawHorizontalLine(5,15,13,pink);
		putPixel(8,14,pink);
		putPixel(14,14,pink);
		drawHorizontalLine(6,8,16,pink);
		drawHorizontalLine(14,16,16,pink);
		drawHorizontalLine(7,15,18,pink);
		drawVerticalLine(18,23,7,pink);
		drawVerticalLine(18,23,15,pink);
		drawVerticalLine(17,28,9,pink);
		drawVerticalLine(17,28,13,pink);
		drawVerticalLine(18,24,11,pink);
		fillRect(8,22,7,3,pink);
		putPixel(9,22,Color.black);
		putPixel(13,22,Color.black);
		drawHorizontalLine(10,13,15,brown);
		putPixel(6,14,Color.black);
		putPixel(17,14,Color.black);
		putPixel(16,15,Color.black);
		drawHorizontalLine(8,9,10,Color.black);
		drawHorizontalLine(13,14,10,Color.black);
		drawVerticalLine(7,9,9,Color.black);
		drawVerticalLine(7,9,14,Color.black);

		
        drawSquareGrid(PIXEL_SIZE,Color.darkGray);
		try {
			ImageIO.write(image, "jpg", new File("COURAGE.jpg"));
			System.out.println("Ahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!!!!!!!!!!!");
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
