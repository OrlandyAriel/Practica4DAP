package ull.patrones.practica4.estado;

public class SemaforoEnVerde implements ISemaforoEstado
{
	@Override
	public ISemaforoEstado cambiarEstado()
	{
		return new SemaforoEnAmbar();
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
}
