package ull.patrones.practica4.estado.p;

import java.awt.Color;

public class SemaforoVerde implements IEstadoSemaforo
{
	private long m_tiempo;
	private Color m_color;
	public  SemaforoVerde()
	{
		m_tiempo = 1000;
		m_color = Color.GREEN;
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
		m_tiempo = 100;
		for (int i = 0; i < 3; i++)
		{
			m_color = Color.BLACK;
			System.out.println("negro");
			run();
			m_color = Color.GREEN;
			m_tiempo = 100;
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
