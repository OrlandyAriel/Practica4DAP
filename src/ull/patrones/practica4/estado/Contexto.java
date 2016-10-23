package ull.patrones.practica4.estado;

public class Contexto
{
	private ISemaforoEstado m_semaforo;
	public Contexto(ISemaforoEstado a_estadoInicial)
	{
		m_semaforo = a_estadoInicial;
	}
	public void cambiarEstado()
	{
		m_semaforo = m_semaforo.cambiarEstado();
	}
	public void estadoActual()
	{
		System.out.println(m_semaforo);
	}
}