package View;
import java.awt.*;
import java.awt.event.*;

public class MiVentana extends java.awt.Frame{

	final Color Color_ventana = Color.green;
	final Color Color_usuario = Color.yellow;
	final Color Color_contrasenia = Color.white;
	
	
	final Font fuente_normal = new Font("Arial", Font.PLAIN , 12);
	final Font fuente_negrita = new Font("Arial", Font.BOLD , 12);
	
	
	public static void main(String[] args) {
		MiVentana myapp = new MiVentana();
		myapp.crearVentana();
	}
	
	
	
	private void crearVentana() {
		
		
		//cerrar ventana
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we) {
				Controller.Controlador.salir();
			}
		});

		setIconImage(Toolkit.getDefaultToolkit().createImage("logo.png"));
		
		setTitle("Creando componentes");
		setBounds(100, 100, 600,400);
		setBackground(Color_ventana);
		setLayout(new BorderLayout());
		
		
		crearComponentes();

		setVisible(true);
	}
	
	private void crearComponentes() {
	
		
		/*
		Button btnAceptar = new Button();
		btnAceptar.setLabel("Aceptar");
		
		Button btnAceptar = new Button("ACEPTAR");
		btnAceptar.setBounds(10, 40,80,40);
		add(btnAceptar);
		Button btnCancelar = new Button("CANCELAR"); 
		btnCancelar.setBounds(95, 40, 80,40);
		add(btnCancelar);
		*/
		MenuBar bar = new MenuBar();
		Menu mnuArchivo = new Menu("Archivo");
		Menu mnuEditar = new Menu("Editar");
		Menu mnuExportar = new Menu("Exportar");
		Menu mnuConvertir = new Menu("Convertir");
		Menu mnuAyuda = new Menu("Ayuda");
		
		MenuItem mniAbrir = new MenuItem("Abrir");
		MenuItem mniGuardar = new MenuItem("Guardar");
		MenuItem mniGuardarComo = new MenuItem("GuardarComo");
		MenuItem mniSalir = new MenuItem("Salir");
		
		MenuItem mniWord = new MenuItem("WORD");
		MenuItem mniPdf = new MenuItem("PDF");
		MenuItem mniTexto = new MenuItem("Texto");

		MenuItem mniCopiar = new MenuItem("Copiar");
		MenuItem mniCortar = new MenuItem("Cortar");
		MenuItem mniPegar = new MenuItem("Pegar");
		MenuItem mniSeleccionarTodo = new MenuItem("SeleccionarTodo");
		
		Menu mniImagen = new Menu("Imagen");
		Menu mniBD = new Menu("BD");
		
		MenuItem mniJpg = new MenuItem("Jpg");
		MenuItem mniPng = new MenuItem("Png");
		MenuItem mniBmp = new MenuItem("Bmp");
		
		MenuItem mniOracle = new MenuItem("Oracle");
		MenuItem mniMysql = new MenuItem("Mysql");
		
		MenuItem Manual = new MenuItem("Manual");
		MenuItem AcercaDe = new MenuItem("Acerca de");
		
		
		
		mnuArchivo.add(mniAbrir);
		mnuArchivo.add(mniGuardar);
		mnuArchivo.add(mniGuardarComo);
		mnuArchivo.add(mniSalir);
		
		mnuExportar.add(mniWord);
		mnuExportar.add(mniPdf);
		mnuExportar.add(mniTexto);
		
		mnuEditar.add(mniCopiar);
		mnuEditar.add(mniCortar);
		mnuEditar.add(mniPegar);
		mnuEditar.addSeparator();
		mnuEditar.add(mniSeleccionarTodo);
		
		mnuConvertir.add(mniImagen);
		mnuConvertir.add(mniBD);
		
		mniImagen.add(mniJpg);
		mniImagen.add(mniPng);
		mniImagen.add(mniBmp);
		
		mniBD.add(mniOracle);
		mniBD.add(mniMysql);
		
		
		
		
		mnuAyuda.add(Manual);
		mnuAyuda.add(AcercaDe);
		
		
		bar.add(mnuArchivo);
		bar.add(mnuEditar);
		bar.add(mnuExportar);
		bar.add(mnuConvertir);
		bar.add(mnuAyuda);
		
		
		setMenuBar(bar);

		//Eventos
		
		
		
		
		
		/*
		
		Button btnSevilla = new Button("SEVILLA");
		Button btnNo = new Button("NO");
		Button btnSi = new Button("SI");
		Button btnAndalucia = new Button("ANDALUCIA");
		Label lblCentro = new Label("El centroooo");
		Button btn5 = new Button("Boton5");
		Button btn6 = new Button("Boton6");
		Button btn7 = new Button("Boton7");
		Button btn8 = new Button("Boton8");
		Button btn9 = new Button("Boton9");


		
		Panel pan2 = new Panel();
		Panel panOperanciones = new Panel();
		panOperanciones.setLayout(new FlowLayout());
		pan2.setLayout(new GridLayout(2,3));
		
		panOperanciones.add(btnAndalucia);
		panOperanciones.add(btnSevilla);
		panOperanciones.add(btnSi);
		panOperanciones.add(btnNo);
		panOperanciones.add(lblCentro);
		pan2.add(btn5);
		pan2.add(btn6);
		pan2.add(btn7);
		pan2.add(btn8);
		pan2.add(btn9);

		add(pan2,BorderLayout.CENTER);
		add(panOperanciones, BorderLayout.SOUTH);
		
		
		/*Label lblUsuario = new Label("Usuario: ");
		lblUsuario.setBounds(10,150,50,40);
		Label lblContrasenia = new Label("Contraseña: ");
		lblContrasenia.setBounds(10,200,70,40);
		lblContrasenia.setBackground(Color.blue);
		lblUsuario.setBackground(Color.red);
		lblUsuario.setForeground(Color_usuario);
		lblContrasenia.setForeground(Color_contrasenia);
		
		
		lblUsuario.setFont(fuente_negrita);
		lblContrasenia.setFont(fuente_negrita);
		
		add(lblUsuario);
		add(lblContrasenia);
		
		
		TextField txtUserName = new TextField(8);
		txtUserName.setBounds(100,200,100,40);
		add(txtUserName);
		
		TextField txtContrasenia = new TextField(8);
		txtContrasenia.setBounds(100,150,100,40);
		add(txtContrasenia);
		*/
	}
}
