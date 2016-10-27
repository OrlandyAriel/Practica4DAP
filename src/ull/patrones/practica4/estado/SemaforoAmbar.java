package ull.patrones.practica4.estado;

import java.awt.Color;

import ull.patrones.practica4.sonido.Sonido;

public class SemaforoAmbar implements IEstadoSemaforo
{
	private Sonido m_sonido;
	public SemaforoAmbar()
	{
		m_sonido = new Sonido("sonidoAmbar.wav");
	}
	@Override
	public Color getColor()
	{
		return new Color(255, 126, 0);
	}
	@Override
	public IEstadoSemaforo apagar()
	{
		m_sonido.detenerSonido();
		return new SemaforoRojo();
	}

	@Override
	public void encender()
	{
		m_sonido.reproducir();
		run();
	}

	@Override
	public void run()
	{
		try{
			Thread.sleep(3000);
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	@Override
	public String toString()
	{
		return "Semáforo en Ambar";
	}
}
