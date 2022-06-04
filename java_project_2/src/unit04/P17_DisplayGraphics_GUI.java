package unit04;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class P17_DisplayGraphics_GUI extends Canvas {

	public static void main(String[] args) {
		P17_DisplayGraphics_GUI o = new P17_DisplayGraphics_GUI();

		JFrame f = new JFrame();
		f.add(o);
		
		f.setSize(500, 280);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void paint(Graphics grap) {

//		grap.drawOval(25, 140, 40, 70);
		
//		grap.drawLine(FRAMEBITS, ERROR, ALLBITS, ABORT);
//		
		setForeground(Color.RED);
//		grap.fillOval(140, 140, 40, 60);
//		
		grap.drawArc(10, 20, 140, 150, 90, 60);
//
//		grap.drawRect(150, 40, 140, 60);
		
	}

}
