package ull.patrones.practica4.estado;

import java.awt.Color;

public interface IEstadoSemaforo extends Runnable
{
	public Color getColor();
	public IEstadoSemaforo apagar();
	public void encender();
	public void run();
}
