package view;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class DesenhoView extends JFrame{
	private static final long serialVersionUID = 1L;
	
	private JTextArea area;
	
	public DesenhoView() {
		
		initComponents();
		initView();
		init();
	}
	
	public void desenhar(String desenho) {
		area.setText(desenho);
		this.setVisible(true);
	}
	
	public void limpar() {
		area.setText("");
	}
	
	private void init() {
		this.setTitle("Impacta Desenho");
		this.setSize(480, 320);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
	}

	private void initView() {
		area.setFont(new Font(Font.MONOSPACED, Font.BOLD, 14));
		area.setEditable(false);
		JScrollPane painel = new JScrollPane(area);
		
		this.add(painel);
	}

	private void initComponents() {
		area = new JTextArea();
	}
}
