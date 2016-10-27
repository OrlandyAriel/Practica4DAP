package ull.patrones.practica4.iu;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import javax.swing.JPanel;
/**
 * @author Orlandy Ariel Sánchez A.
 * Clase que dibuja un circulo para rellenarlo con el color del estado
 * del semarofo
 */
public class PanelColor extends JPanel
{
	private Color m_color;
	private Ellipse2D mCirculo;
	public PanelColor(Color a_color)
	{
		a_color = m_color;
		initComponent();
	}
	private void initComponent()
	{
		setVisible(true);
		setPreferredSize(new Dimension(30, 30));
		setLayout(new BorderLayout());
	}
	public void setColor(Color a_color)
	{
		m_color = a_color;
		repaint();
	}
	@Override
	public void paint(Graphics g)
	{
		super.paint(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setStroke(new BasicStroke(2.0F));
		mCirculo = new Ellipse2D.Float(120F, 10F, 150F, 150F);
		g2.setColor(m_color); // relleno del circulo
		g2.fill(mCirculo);
		g2.setColor(m_color);
		g2.draw(mCirculo);
	}
}
