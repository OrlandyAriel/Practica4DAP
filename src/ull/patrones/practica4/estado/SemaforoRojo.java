package ull.patrones.practica4.estado;

import java.awt.Color;

public class SemaforoRojo implements IEstadoSemaforo
{
	@Override
	public Color getColor()
	{
		return Color.RED;
	}

	@Override
	public IEstadoSemaforo apagar()
	{
		return new SemaforoVerde();
	}

	@Override
	public void encender()
	{
		getColor();
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
