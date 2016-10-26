package ull.patrones.practica4.estado;

import java.awt.Color;

import ull.patrones.practica4.iu.FrameSemaforo;

public class Contexto
{
	public static void main(String[] args)
	{
		new FrameSemaforo();
		// Contexto a = new Contexto(new SemaforoRojo());
		// a.cambiarEstado();
	}

	private IEstadoSemaforo m_semaforo;

	public Contexto(IEstadoSemaforo a_semaforo)
	{
		m_semaforo = a_semaforo;
	}

	public Color colorEstado()
	{
		return m_semaforo.getColor();
	}
	public void ejecucion()
	{
		m_semaforo.encender();
		m_semaforo = m_semaforo.apagar();

	}
}
