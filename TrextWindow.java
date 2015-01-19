
import java.awt.Color;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.swing.*;
import javax.swing.text.*;
import javax.swing.event.*;
import javax.swing.GroupLayout.*;

public class TrextWindow extends JFrame{
	private JTextArea _text_area;
	private JScrollPane _scroll_pane;
	
	private void _init()
	{
		this.setSize(300, 400);
		this.setTitle("Trext");
		this.setAlwaysOnTop(true);
		this.setLocation(
				GraphicsEnvironment
				.getLocalGraphicsEnvironment()
				.getDefaultScreenDevice()
				.getDefaultConfiguration()
				.getBounds()
				.width - 310, 
				GraphicsEnvironment
				.getLocalGraphicsEnvironment()
				.getDefaultScreenDevice()
				.getDefaultConfiguration()
				.getBounds()
				.height - 450);
		_text_area = new JTextArea();

		_scroll_pane = new JScrollPane(_text_area);
		this.add(_scroll_pane);
		this.setVisible(true);
	}
	
	public void append_text(String text)
	{
	    _text_area.append(text);
	}
	
	
	public TrextWindow()
	{
		_init();
	}
}
