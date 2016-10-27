package ull.patrones.practica4.estado;

import java.awt.Color;

import ull.patrones.practica4.sonido.Sonido;

public class SemaforoRojo implements IEstadoSemaforo
{
	private Sonido m_sonido;
	public SemaforoRojo()
	{
		m_sonido = new Sonido("sonidoRojo.wav");
	}
	@Override
	public Color getColor()
	{
		return Color.RED;
	}

	@Override
	public IEstadoSemaforo apagar()
	{
		m_sonido.detenerSonido();
		return new SemaforoVerde();
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
			Thread.sleep(10000);
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	@Override
	public String toString()
	{
		return "Semáforo en Rojo";
	}

}
