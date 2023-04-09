package Pictures;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class BadBunny {
	private static int width = 520;
	private static int height = 480;
	
	private static int PIXEL_SIZE = 40;
	private static Graphics2D g;
	
	static Color softblue = new Color(98,178,221);
	static Color red = new Color(212,2,28);
	
	
    static BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
    
	public static void paint() {
		drawBackground(PIXEL_SIZE,softblue);
		fillRect(0,2,13,4,red);
		fillRect(2,0,3,8,red);
		fillRect(8,0,3,8,red);
		drawHorizontalLine(1,5,1,red);
		drawHorizontalLine(7,11,1,red);
		drawHorizontalLine(1,11,6,red);
		drawHorizontalLine(2,10,7,red);
		drawHorizontalLine(3,9,8,red);
		drawHorizontalLine(4,8,9,red);
		drawHorizontalLine(5,7,10,red);
		putPixel(6,11,red);
		fillRect(5,3,2,3,Color.white);
		drawHorizontalLine(5,7,7,Color.black);
		drawVerticalLine(4,5,5,Color.black);
		putPixel(4,8,Color.black);
		putPixel(8,8,Color.black);
		
        drawSquareGrid(PIXEL_SIZE, Color.black);
		try {
			ImageIO.write(image, "jpg", new File("UVST.jpg"));
			System.out.println("Moscow Mule");
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
