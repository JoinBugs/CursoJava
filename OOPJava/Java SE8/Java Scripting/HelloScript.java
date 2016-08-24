import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class HelloScript
{
	public static void main( String[] args )
	{ 
		ScriptEngineManager manager = new ScriptEngineManager();

		ScriptEngine engine = manager.getEngineByName( "JavaScript" );

		String script = " print( 'Hello World' ) ";

		try
		{
			engine.eval( script );
		}
		catch( ScriptException ex )
		{
			ex.printStackTrace();
		}
	}
}