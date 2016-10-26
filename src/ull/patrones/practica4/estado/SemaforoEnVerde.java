package ull.patrones.practica4.estado;

import java.awt.Color;

public class SemaforoEnVerde implements ISemaforoEstado
{
	@Override
	public ISemaforoEstado cambiarEstado()
	{
		return new SemaforoEnRojo();
	}
	@Override
	public String toString()
	{
		return "Sem�foro en Verde";
	}
	@Override
	public ISemaforoEstado cambiarEstado(ISemaforoEstado a_estadoSiguiente)
	{
		return null;
	}
	@Override
	public Color getColor()
	{
		return Color.GREEN;
	}
	@Override
	public void run()
	{
		// TODO Auto-generated method stub
		
	}
}
