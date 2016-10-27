package ull.patrones.practica4.sonido;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;

public class Sonido
{
	private AudioClip m_clip;
	private URL m_url;
	public Sonido( String a_url)
	{
		setURL(a_url);
		
	}
	
	public void reproducir() 
	{
		m_clip.loop();;
		try
		{
			Thread.sleep(0);
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	public void detenerSonido()
	{
		m_clip.stop();
	}
	public void setURL(String a_url)
	{
		m_url =  Sonido.class.getResource(a_url);
		m_clip = Applet.newAudioClip(m_url);
	}
}
