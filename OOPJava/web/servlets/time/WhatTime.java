import javax.servlet.ServletException;
import javax.servlet.ServletConfig;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class WhatTime extends HttpServlet
{
	@Override
		public void init( ServletConfig config )
		throws ServletException
		{
			super.init( config );
		}

	@Override
		public void doGet( HttpServletRequest request, HttpServletResponse response )
		throws IOException, ServletException
		{
			procesarPeticion( request, response );
		}

	@Override
		public void doPost( HttpServletRequest request, HttpServletResponse response )
		throws IOException, ServletException
		{
			procesarPeticion( request, response );	
		}

	protected void procesarPeticion( HttpServletRequest request, HttpServletResponse response )
	throws IOException, ServletException
	{
		Calendar fechaHora = new GregorianCalendar();
		PrintWriter out = response.getWriter();

		out.printf( "Fecha --> Dia : %s, Mes : %s, Año : %s", 
								fechaHora.get( Calendar.DAY_OF_MONTH ), 
								fechaHora.get( Calendar.MONTH + 1 ), 
								fechaHora.get( Calendar.YEAR ) );


		out.printf( "\n\nHora --> Hora : %s, Minuto : %s, Segundo : %s", 
								fechaHora.get( Calendar.HOUR_OF_DAY ), 
								fechaHora.get( Calendar.MINUTE ), 
								fechaHora.get( Calendar.SECOND ) );
	}
}
















