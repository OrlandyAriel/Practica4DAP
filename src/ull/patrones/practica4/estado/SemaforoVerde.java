package ull.patrones.practica4.estado;

import java.awt.Color;

import ull.patrones.practica4.iu.FrameSemaforo;

public class SemaforoVerde implements IEstadoSemaforo
{
	private long m_tiempo;
	private Color m_color;
	private Color m_colorParpadeo;
	public  SemaforoVerde()
	{
		m_tiempo = 7000;
		m_color = new Color(0, 169, 62);
		m_colorParpadeo = new Color(0,53,19);
	}
	@Override
	public Color getColor()
	{
		return m_color;
	}
	@Override
	public IEstadoSemaforo apagar()
	{
		return new SemaforoAmbar();
	}
	@Override
	public void encender()
	{
		run();
		
		for (int i = 0; i < 3; i++)
		{ 
			m_tiempo = 500;
			FrameSemaforo.cambiarColor(m_colorParpadeo);
			run();
			m_tiempo = 200;
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
