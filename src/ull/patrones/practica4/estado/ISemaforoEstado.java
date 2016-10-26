package ull.patrones.practica4.estado;

import java.awt.Color;

public interface ISemaforoEstado extends Runnable
{
	public ISemaforoEstado cambiarEstado();
	public ISemaforoEstado cambiarEstado(ISemaforoEstado a_estadoSiguiente);
	public Color getColor();
}
