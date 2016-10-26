package ull.patrones.practica4.iu;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.ScrollPane;

import javax.swing.JFrame;

import ull.patrones.practica4.estado.p.Contexto;
import ull.patrones.practica4.estado.p.SemaforoRojo;
import ull.patrones.practica4.estado.p.SemaforoVerde;

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
		m_contexto = new Contexto(new SemaforoVerde());

		while (true)
		{
			m_scrollPanelSemaforo.add(m_ColorSaforo);

			m_ColorSaforo.cambiarColor(m_contexto.colorEstado());
			m_contexto.ejecucion();
			m_scrollPanelSemaforo.add(m_ColorSaforo);
			m_scrollPanelSemaforo.repaint();

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