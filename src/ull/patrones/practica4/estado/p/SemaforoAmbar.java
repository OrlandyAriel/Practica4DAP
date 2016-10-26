package ull.patrones.practica4.estado.p;

import java.awt.Color;

public class SemaforoAmbar implements IEstadoSemaforo
{

	@Override
	public Color getColor()
	{
		return new Color(255, 126, 0);
	}
	@Override
	public IEstadoSemaforo apagar()
	{
		return new SemaforoRojo();
	}

	@Override
	public void encender()
	{
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
