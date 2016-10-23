package ull.patrones.practica4.estado;

import java.awt.Color;

public class SemaforoEnAmbar implements ISemaforoEstado
{
	@Override
	public ISemaforoEstado cambiarEstado()
	{
		return new SemaforoEnVerde();
	}
	@Override
	public String toString()
	{
		return "Semáforo en Ambar";
	}
	@Override
	public ISemaforoEstado cambiarEstado(ISemaforoEstado a_estadoSiguiente)
	{
		return a_estadoSiguiente;
	}
	@Override
	public Color getColor()
	{
		return new Color(255, 126, 0);
	}
}
