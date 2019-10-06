package view;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;

import domain.BiDimensional;
import domain.UniDimensional;
import model.Figura;

public class FiguraView extends JFrame{
	private static final long serialVersionUID = 1L;

	private JLabel figuraLabel;
	private JComboBox<Figura> figuraComboBox;
	private JLabel simboloLabel;
	private JTextField simboloTextField;
	private JLabel alturaLabel;
	private JSpinner alturaSpinner;
	private JLabel larguraLabel;
	private JSpinner larguraSpinner;
	private JButton desenharButton;
	private JButton limparButton;
	private DesenhoView desenhoView;
	
	public FiguraView() {
		initComponents();
		initView();
		init();
	}
	
	private void escolherFigura(ActionEvent e) {
		Figura f = (Figura) figuraComboBox.getSelectedItem();
		simboloTextField.setText(f.getSimbolo());
		alturaSpinner.setValue(f.getAltura());
		larguraSpinner.setValue(f.getLargura());
		
		boolean isUni = f instanceof UniDimensional;
		alturaLabel.setText(isUni ? "Lado:" : "Altura:");
		larguraLabel.setVisible(!isUni);
		larguraSpinner.setVisible(!isUni);
		
		this.limparFigura(e);
	}
	
	private void desenharFigura(ActionEvent e) {
		Figura f = (Figura) figuraComboBox.getSelectedItem();
		f.setSimbolo(simboloTextField.getText().trim());
		
		if (f instanceof UniDimensional) {
			UniDimensional d = (UniDimensional) f;
			d.setLado((int) alturaSpinner.getValue());
		} else if(f instanceof BiDimensional) {
			f.setAltura((int) alturaSpinner.getValue());
			f.setLargura((int) larguraSpinner.getValue()); 
		}
		
		desenhoView.desenhar(f.desenhar());
		limparButton.setEnabled(true);
	}
	
	void limparFigura(ActionEvent e) {
		desenhoView.limpar();
		limparButton.setEnabled(false);
	}
	
	//PREPARA INFORMAÇÕES ESPECIFICAS DA JANELA E PREPARA AS AÇÕES DISPONIVEIS
	private void init() {
		figuraComboBox.addActionListener(e -> escolherFigura(e));
		
		desenharButton.addActionListener(e -> desenharFigura(e));
		
		limparButton.addActionListener(e -> limparFigura(e));
		
		escolherFigura(null);
		limparButton.setEnabled(false);
		this.setTitle("Impacta Figura");
		this.setSize(250, 150);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	//INICIAR/INSTANCIAR TODOS OS COMPONENTES QUE PERTENCEM A JANELA
	private void initComponents() {
		figuraLabel = new JLabel("Figura:");
		figuraComboBox = new FiguraComboBox();
		simboloLabel = new JLabel("Símbolo:");
		simboloTextField = new JTextField("*");
		alturaLabel = new JLabel("Altura:");
		alturaSpinner = new JSpinner(new SpinnerNumberModel(5, 0, 50, 1));
		larguraLabel = new JLabel("Largura:");
		larguraSpinner = new JSpinner(new SpinnerNumberModel(9, 0, 50, 1));
		desenharButton = new JButton("Desenhar");
		limparButton = new JButton("Limpar");
		desenhoView = new DesenhoView();
	}
	
	//PREPARA A VISUALIZAÇÃO/LAYOUT PARA OS COMPONENTES DA JANELA
	private void initView() {
		JPanel painel = new JPanel();
		painel.setLayout(new GridLayout(0, 2));
		
		painel.add(figuraLabel);
		painel.add(figuraComboBox);
		painel.add(simboloLabel);
		painel.add(simboloTextField);
		painel.add(alturaLabel);
		painel.add(alturaSpinner);
		painel.add(larguraLabel);
		painel.add(larguraSpinner);
		painel.add(desenharButton);
		painel.add(limparButton);
		
		this.add(painel);
	}
	
}
