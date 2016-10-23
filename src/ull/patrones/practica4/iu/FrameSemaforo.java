package ull.patrones.practica4.iu;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.ScrollPane;

import javax.swing.JFrame;
import ull.patrones.practica4.estado.Contexto;
import ull.patrones.practica4.estado.SemaforoEnRojo;

public class FrameSemaforo extends JFrame
{
	private PanelColor m_ColorSaforo;
	private Contexto m_contexto;
	private ScrollPane m_scrollPanelSemaforo;

	public FrameSemaforo()
	{
		panelColor();
		initComponent();
		cambiaPanel();
	}
	
	private void cambiaPanel() 
	{
		m_contexto = new Contexto(new SemaforoEnRojo());
		
		while(true)
		{
			m_scrollPanelSemaforo.add(m_ColorSaforo);
			Thread t_thread = new Thread()// Hilo
			{
				@Override
				public void run()
				{
					m_ColorSaforo.cambiarColor(m_contexto.color());
					m_contexto.estadoActual();
					m_contexto.cambiarEstado();
					m_scrollPanelSemaforo.add(m_ColorSaforo);
					m_scrollPanelSemaforo.repaint();
				}
			};
			t_thread.start();
			m_ColorSaforo.run();
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
}
