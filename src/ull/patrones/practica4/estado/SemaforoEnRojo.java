package ull.patrones.practica4.estado;

public class SemaforoEnRojo implements ISemaforoEstado
{
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

}
