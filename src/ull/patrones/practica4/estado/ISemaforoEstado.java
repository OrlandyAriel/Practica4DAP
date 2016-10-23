package ull.patrones.practica4.estado;

public interface ISemaforoEstado
{
	public ISemaforoEstado cambiarEstado();
	public ISemaforoEstado cambiarEstado(ISemaforoEstado a_estadoSiguiente);
	
}
