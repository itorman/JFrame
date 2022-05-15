// dependencias para entorno de ventanas
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class VentanaPrincipal extends JFrame implements ActionListener {
    
    // componentes de la interfaz gráfica
    private JComboBox selectIncidencias;
    private JComboBox selectTecnicos;
    private JLabel infoIncidencia;
    private JButton informes;    
    private JLabel incidenciaId;
    private JTextField descripcion;
    private JTextField fechaCreacion;
    private JLabel tecnico;
    private JTextField estado;
    private JTextField tiempoResolucion;
    private JButton actualizar;
    private JButton asignar;
    private JButton cancelar;
    // incidencias y tecnicos    
    private Incidencia[] incidencias = new Incidencia[5];
    private Tecnico[] tecnicos = new Tecnico[2];
    
    //ventana informe
    private VentanaInforme ventanaInforme;
    

    // constructorque crea la ventana principal
    public void VentanaPrincipal() {

        //super("Aplicacion para asignación de incidencias a tecnicos");  --> no es necesario
        super.setTitle("Aplicación para asignación de incidencias a tecnicos");
        //creo las incidencias
        incidencias[0] = new Incidencia("IC001", "Problema aplicacion Outlook", "02/03/2020", null, null);
        incidencias[1] = new Incidencia("IC002", "Problema en disco", "07/04/2021", null,  null);
        incidencias[2] = new Incidencia("IC003", "Problema en Sharepoint", "07/04/2021", null, null);
        incidencias[3] = new Incidencia("IC004", "Problema en Sharepoint", "08/04/2021", null, null);
        incidencias[4] = new Incidencia("IC005", "Problema en Adobe", "07/04/2021", null, null);
        
        //creo los tecnicos
        tecnicos[0] = new Tecnico("Andres Quiron Perez", "NIVEL 1");
        tecnicos[1] = new Tecnico("Alberto Jimenez Garcia", "NIVEL 2");
        // lo que sigo lo podría haber hecho directamente en la incidencia
        // asigno incidencias a tecnicos
        incidencias[0].setTecnico(tecnicos[0]);
        incidencias[1].setTecnico(tecnicos[0]);
        incidencias[2].setTecnico(tecnicos[0]);
        incidencias[3].setTecnico(tecnicos[1]);
        incidencias[4].setTecnico(tecnicos[1]);

        // asigno estado de la incidencia
        incidencias[0].setEstado("En progreso");
        incidencias[1].setEstado("En progreso");
        incidencias[2].setEstado("En progreso");
        incidencias[3].setEstado("Cerrada");
        incidencias[4].setEstado("Abierta");

        // inicializo con un metodo propio llamado init. este seria parte del constructor
        initComponentes();
    }

    public void initComponentes() {

        // Creación de controles gráficos
        selectIncidencias = new JComboBox<String>();
        selectTecnicos = new JComboBox<String>();
        infoIncidencia = new JLabel("Información de la incidencia");
        informes = new JButton("Informes");
        incidenciaId = new JLabel("ID");
        descripcion = new JTextField("Descripcion");
        fechaCreacion = new JTextField("Creada");
        tecnico = new JLabel("Tecnico");
        estado = new JTextField("Estado");
        tiempoResolucion = new JTextField("Tiempo");
        actualizar = new JButton("Actualizar");
        asignar = new JButton("Asignar");
        cancelar = new JButton("Cancelar");

        //Se añaden los elementos de los comboBox		
        for (Incidencia i : incidencias) {
            selectIncidencias.addItem(i.getId());
        }
        for (Tecnico t : tecnicos) {
            selectTecnicos.addItem(t.getNombre());
        }
        
        // Dimensionamos la ventana principal
        this.setSize(600, 300);
        // Posicionamos la ventana en la pantalla
        this.setLocationRelativeTo(null);
        // Hacemos que la ventana sea visible
        this.setVisible(true);

        // Disponemos los controles en el panel de la ventana
        this.getContentPane().setLayout(new FlowLayout());
        this.getContentPane().add(selectIncidencias);
        this.getContentPane().add(selectTecnicos);
        this.getContentPane().add(infoIncidencia);
        this.getContentPane().add(informes);
        this.getContentPane().add(incidenciaId);
        this.getContentPane().add(descripcion);
        this.getContentPane().add(fechaCreacion);
        this.getContentPane().add(tecnico);
        this.getContentPane().add(estado);
        this.getContentPane().add(tiempoResolucion);
        this.getContentPane().add(actualizar);
        this.getContentPane().add(asignar);
        this.getContentPane().add(cancelar);

        // Aqui se añaden los manejadores de eventos a los controles
        selectIncidencias.addActionListener(this);
        selectTecnicos.addActionListener(this);
        informes.addActionListener(this);
        actualizar.addActionListener(this);
        asignar.addActionListener(this);
        cancelar.addActionListener(this);

    }
    // FIN DEL CONSTRUCTOR

    // INICIO MANEJADOR DE EVENTOS

    @Override
    public void actionPerformed(ActionEvent e) {
       // La propia ventana es el manejador de los eventos que se generan en sus controles
		Object o= e.getSource();
		
		if(o.equals(selectIncidencias)){			
			System.out.println("Selecciono incidencia");
			
        } else if (o.equals(selectTecnicos)) {
            System.out.println("Selecciono tecnico");

        } else if (o.equals(informes)) {
            System.out.println("Entro a ventana informes");

        } else if (o.equals(actualizar)) {
            System.out.println("Actualizo");
            
        } else if (o.equals(asignar)) {
            System.out.println("Asigno tecnico");
            
        } else if (o.equals(cancelar)) {
            System.out.println("Cancelo");
            
        } else {
            System.out.println("Error de algun tipo");
        }
		System.out.println(e.getActionCommand().toString()); // TODO Auto-generated method stub
        
    }
}



   
