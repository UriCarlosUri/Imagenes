package Pictures;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class Pato {
	
	private static int width = 800;
	private static int height = 960;
	
	private static int PIXEL_SIZE = 40;
	private static Graphics2D g;
	
	static Color white = new Color(253,248,226);
	static Color softblack = new Color(32,31,29);
	static Color softgray = new Color(238,242,255);
	static Color yellow = new Color(240,201,73);
	static Color softbrown =new Color(209,147,70);
	static Color brown = new Color(204,121,55);
	static Color darkorange = new Color(218,100,46);
	static Color orange = new Color(236,129,49);
	static Color red = new Color(215, 25, 25);
	
    static BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
    
	public static void paint() {
		drawBackground(PIXEL_SIZE,softgray);
		drawHorizontalLine(9,17,0,softblack);
		drawHorizontalLine(9,17,14,softblack);
		drawVerticalLine(0,22,9,softblack);
		drawVerticalLine(0,14,17,softblack);
        fillRect(9, 0, 9, 15,softblack);
        drawHorizontalLine(7,20,6,softblack);
        drawHorizontalLine(7,20,7,softblack);
        drawVerticalLine(10,13,18,softblack);
        drawVerticalLine(9,22,8,softblack);
        drawHorizontalLine(6,15,14,softblack);
        drawHorizontalLine(5,16,15,softblack);
        fillRect(1,16,18,4,softblack);
        drawVerticalLine(17,18,0,softblack);
        drawHorizontalLine(2,17,20,softblack);
        drawHorizontalLine(3,16,21,softblack);
        drawHorizontalLine(5,14,22,softblack);
        drawHorizontalLine(5,14,23,softblack);
        drawHorizontalLine(8,11,23,softblack);
        putPixel(10,8,softbrown);
        drawVerticalLine(9,10,9,softbrown);
        drawHorizontalLine(11,16,8,yellow);
        drawHorizontalLine(10,16,9,yellow);
        drawHorizontalLine(10,17,10,yellow);
        fillRect(9,11,2,2,yellow);
        drawHorizontalLine(13,16,11,yellow);
        drawHorizontalLine(8,12,13,yellow);
        drawHorizontalLine(12,13,14,yellow);
        drawHorizontalLine(6,7,13,softblack);
        putPixel(5,14,softblack);
        putPixel(4,15,softblack);
        fillRect(6,14,6,5,yellow);
        fillRect(4,16,2,2,yellow);
        putPixel(5,15,yellow);
        fillRect(12,15,2,3,red);
        fillRect(15,15,2,3,red);
        putPixel(14,16,red);
        putPixel(3,18,yellow);
        drawHorizontalLine(2,5,19,yellow);
        drawHorizontalLine(3,8,20,yellow);
        drawHorizontalLine(6,7,21,yellow);
        drawHorizontalLine(8,10,19,yellow);
        fillRect(1,17,2,2,softbrown);
        putPixel(3,17,softbrown);
        putPixel(9,17,softbrown);
        putPixel(13,13,softbrown);
        putPixel(14,15,softbrown);
        putPixel(14,17,softbrown);
        drawHorizontalLine(14,15,14,softbrown);
        drawVerticalLine(16,19,17,softbrown);
        fillRect(12,18,5,3,softbrown);
        drawHorizontalLine(8,14,21,softbrown);
        drawHorizontalLine(9,11,20,softbrown);
        putPixel(11,19,softbrown);
        drawHorizontalLine(8,11,23,white);
        putPixel(1,17,brown);
        putPixel(8,18,brown);
        putPixel(16,20,brown);
        putPixel(17,13,brown);
        putPixel(16,14,brown);
        drawHorizontalLine(13,14,21,brown);
        drawHorizontalLine(14,16,13,darkorange);
        drawHorizontalLine(13,16,12,orange);
        putPixel(8,13,white);
        putPixel(9,14,white);
        putPixel(10,15,white);
        putPixel(11,16,white);

        
        drawSquareGrid(PIXEL_SIZE, Color.black);
		try {
			ImageIO.write(image, "jpg", new File("PATO.jpg"));
			System.out.println("PATO creado con exito");
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
