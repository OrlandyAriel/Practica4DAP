package ull.patrones.practica4.estado;

import java.awt.Color;

public class SemaforoEnRojo implements ISemaforoEstado
{
	public SemaforoEnRojo()
	{
	}
	@Override
	public ISemaforoEstado cambiarEstado()
	{
		return new SemaforoEnAmbar();
	}
	@Override
	public String toString()
	{
		return "Semáforo en Rojo";
	}
	@Override
	public ISemaforoEstado cambiarEstado(ISemaforoEstado a_estadoSiguiente)
	{
		return null;
	}
	@Override
	public Color getColor()
	{
		return Color.RED;
	}
	@Override
	public void run()
	{
		try
		{
			Thread.sleep(25500);
			System.out.println("hooasdf");
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		
	}

}
