package ull.patrones.practica4.estado;

import java.awt.Color;

public interface ISemaforoEstado
{
	public ISemaforoEstado cambiarEstado();
	public ISemaforoEstado cambiarEstado(ISemaforoEstado a_estadoSiguiente);
	public Color getColor();
}
