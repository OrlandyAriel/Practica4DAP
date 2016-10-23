package ull.patrones.practica4.estado;

public class MainContex
{

	public static void main(String[] args)
	{
		Contexto t_conte = new Contexto(new SemaforoEnRojo());
		t_conte.estadoActual();
		t_conte.cambiarEstado();
		t_conte.estadoActual();
		t_conte.cambiarEstado();
		t_conte.estadoActual();
	}
}
