package ull.patrones.practica4.estado;

import java.awt.Color;

import ull.patrones.practica4.iu.FrameSemaforo;
import ull.patrones.practica4.sonido.Sonido;

public class SemaforoVerde implements IEstadoSemaforo
{
	private long m_tiempo;
	private Color m_color;
	private Color m_colorParpadeo;
	private Sonido m_sonido;
	public  SemaforoVerde()
	{
		m_tiempo = 7000;
		m_color = new Color(0, 169, 62);
		m_colorParpadeo = new Color(0,53,19);
		m_sonido= new Sonido("sonidoVerde.wav");
	}
	@Override
	public Color getColor()
	{
		return m_color;
	}
	@Override
	public IEstadoSemaforo apagar()
	{
		m_sonido.detenerSonido();
		return new SemaforoAmbar();
	}
	@Override
	public void encender()
	{
		m_sonido.reproducir();
		run();
		for (int i = 0; i < 3; i++)
		{ 
			m_tiempo = 500;
			m_sonido.detenerSonido();
			m_sonido.setURL("sonidoParpadeo.wav");
			m_sonido.reproducir();
			FrameSemaforo.cambiarColor(m_colorParpadeo);
			run();
			m_tiempo = 500;
			FrameSemaforo.cambiarColor(m_color);
			run();
		}
	}

	@Override
	public void run()
	{
		try{
			Thread.sleep(m_tiempo);
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	@Override
	public String toString()
	{
		return "Semáforo en verde";
	}
}
