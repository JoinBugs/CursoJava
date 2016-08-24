import javax.servlet.ServletException;
import javax.servlet.ServletConfig;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Cookie;

import java.io.IOException;
import java.io.PrintWriter;

public class CuentaCk extends HttpServlet
{
	@Override
		public void init( ServletConfig config )
		throws ServletException
		{
			super.init( config );
		}

	@Override
		public void doGet( HttpServletRequest request, HttpServletResponse response )
		throws ServletException, IOException
		{
			response.setContentType( "text/html" );
			PrintWriter out = response.getWriter();

			String scuenta = null;
			Integer objCuenta = null;
			Cookie[] cookies = request.getCookies();
			int i, l;

			out.println( "Galle " + cookies );

			for( i = 0, l = cookies.length; cookies != null && i < l; i++ )
				if( cookies[ i ].getName().equals( "cuenta.ck" ) )
					break;
			scuenta = i < l ? cookies[ i ].getValue() : null;
			
			if( scuenta == null )
				objCuenta = new Integer( 1 );
			else
				objCuenta = new Integer( Integer.parseInt( scuenta ) + 1 );

			Cookie c = new Cookie( "cuenta.ck", objCuenta.toString() );
			response.addCookie( c );

			out.println( "<html>" );
			out.println( "has visitado esta pagina " +  objCuenta.toString() + " " +
									( objCuenta  < 2 ? "vez" : "veces" ) );

			out.println( "</html>" );
			out.close();
		}

	@Override
	public String getServletInfo()
	{
		return "Servlet CuentaCk ";
	}

	@Override
		public void doPost( HttpServletRequest request, HttpServletResponse respons )
		throws ServletException, IOException
		{
			
		}
}