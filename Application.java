import java.util.Timer;
import java.util.TimerTask;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;



public class Application {
    
    static String buffer = "";
    static String cb_text = "";

    public static void main(String[] args) 
    {
	// TODO Auto-generated method stub
	final TrextWindow tw = new TrextWindow();
	Toolkit toolkit = Toolkit.getDefaultToolkit();
	final Clipboard clipboard = toolkit.getSystemClipboard();
	Timer timer = new Timer();
		
		
	timer.scheduleAtFixedRate(
		new TimerTask()
		{
		   @Override
		   public void run()
		   {
		       try {
			cb_text = (String) clipboard.getData(DataFlavor.stringFlavor);
		    } catch (UnsupportedFlavorException e) {
			
		    } catch (IOException e) {
			
		    }
		       if (!cb_text.equals(buffer))
		       {
			   tw.append_text(cb_text + "\n");
			   buffer = cb_text;
		       }
		   }
		}, 500L, 500L);
	
    }

}
