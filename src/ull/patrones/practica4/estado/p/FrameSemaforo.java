package ull.patrones.practica4.estado.p;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.ScrollPane;

import javax.swing.JFrame;

import ull.patrones.practica4.iu.PanelColor;

public class FrameSemaforo extends JFrame
{
	public static PanelColor m_ColorSaforo;
	private Contexto m_contexto;
	public static ScrollPane m_scrollPanelSemaforo;

	public FrameSemaforo()
	{
		panelColor();
		initComponent();
		cambiaPanel();
	}

	private void cambiaPanel()
	{
		m_contexto = new Contexto(new SemaforoVerde());
		m_scrollPanelSemaforo.add(m_ColorSaforo);
		while (true)
		{
			m_ColorSaforo.cambiarColor(m_contexto.colorEstado());
			m_contexto.ejecucion();
			m_scrollPanelSemaforo.add(m_ColorSaforo);
			m_scrollPanelSemaforo.repaint();
		
		}
	}

	private void panelColor()
	{
		m_scrollPanelSemaforo = new ScrollPane();
		m_scrollPanelSemaforo.setPreferredSize(new Dimension(30, 30));
		m_ColorSaforo = new PanelColor(Color.white);
	}

	private void initComponent()
	{
		setTitle("Ventana principal");
		setSize(400, 250);
		setVisible(true);
		setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(m_scrollPanelSemaforo);
	}

	public static void cambiarColor(Color a_color)
	{
		m_ColorSaforo.cambiarColor(a_color);
		m_scrollPanelSemaforo.repaint();
		m_scrollPanelSemaforo.add(m_ColorSaforo);
	}
}
