// dependencias para entorno de ventanas
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.JButton;
import javax.swing.JComboBox;


public class VentanaPrincipal extends JFrame implements ActionListener, DocumentListener {
    
    // componentes de la interfaz gráfica
    private JComboBox selectIncidencias;
    private JComboBox selectTecnicos;
    private JLabel infoIncidencia;
    private JButton informes;    
    private JLabel incidenciaId;
    private JTextField descripcion;
    private JTextField fechaCreacion;
    private JTextField tecnico;
    private JTextField estado;
    private JTextField tiempoResolucion;
    private JButton actualizar;
    private JButton asignar;
    private JButton cancelar;
    // incidencias y tecnicos    
    private Incidencia[] incidencias = new Incidencia[10];   
    private Tecnico[] tecnicos = new Tecnico[10];
    //ventana informe
    private VentanaInforme ventanaInforme;
    
    public void VentanaPrincipal() {

        super("Aplicacion para asignación de incidencias a técnicos");
        //creo las incidencias y los tecnicos
        incidencias[0] = new Incidencia("1", "Problema con la pantalla", "01/01/2017", null);
        incidencias[1] = new Incidencia("2", "Problema con el teclado", "01/01/2017", null);
        incidencias[2] = new Incidencia("3", "Problema con el ratón", "01/01/2017", null);
        incidencias[3] = new Incidencia("4", "Problema con el monitor", "01/01/2017", null);
        incidencias[4] = new Incidencia("5", "Problema con el sistema operativo", "01/01/2017", null);
        incidencias[5] = new Incidencia("6", "Problema con el software", "01/01/2017", null);
        
        //crear 3 tecnicos
        tecnicos[0] = new Tecnico("Juan Perez", "NIVEL 1");
        tecnicos[1] = new Tecnico("Pedro Martinez", "NIVEL 2");
        tecnicos[2] = new Tecnico("Luis Gomez", "NIVEL 3");
       



        

    }
    

}



   
