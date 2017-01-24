package net.ausiasmarch.estadistica.gui;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import net.ausiasmarch.common.Convert;
import net.ausiasmarch.estadistica.modelo.Ciudad;
import net.ausiasmarch.estadistica.modelo.GestorCiudades;
import net.ausiasmarch.estadistica.utils.RenderGrid;
import net.ausiasmarch.estadistica.utils.ValidatorAnnotation;

/**
 * Main.java
 *
 * @author Administrador
 */
public class Main extends javax.swing.JFrame {
    // Gestor de ciudades
    private final GestorCiudades gestorCiudades;
    // Lista de ciudades
    private final List<Ciudad> ciudades;
    // Array de nombres de columnas para la cabecera del grid de ciudades
    private final String[] columnas = {"Comunidad","Ciudad", "Habitantes"};
    
    /**
     * Crea un form Main
     */
    public Main() {
        initComponents();
        ciudades = new ArrayList();            // creamos la lista de ciudades
        gestorCiudades = new GestorCiudades(); // creamos Gestor de ciudades      
        iniciaGrid();                          // iniciamos los grids
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldCiudad = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButtonAgregar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldBusqueda = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldNumHabitantes = new javax.swing.JTextField();
        jButtonBuscarCiudad = new javax.swing.JButton();
        jTextFieldPorcentaje = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldNumCiudades = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldMediaHabitantes = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldCiudadMayorHab = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextFieldMayorHabitantes = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldTotal = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldHabitantes = new javax.swing.JTextField();
        jButtonCalcular = new javax.swing.JButton();
        jButtonLimpiar = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        gridCiudades = new net.ausiasmarch.estadistica.utils.Grid();
        jButtonBorrarCiudad = new javax.swing.JButton();
        jComboBoxOrdenar = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxComunidad = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ciudades");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldCiudad.setToolTipText("Nombre de la ciudad");
        jTextFieldCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCiudadActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 150, 20));

        jLabel1.setText("Jugador");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 60, 20));

        jButtonAgregar.setBackground(new java.awt.Color(102, 153, 255));
        jButtonAgregar.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButtonAgregar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/net/ausiasmarch/estadistica/res/Add.png"))); // NOI18N
        jButtonAgregar.setText("Añadir");
        jButtonAgregar.setToolTipText("");
        jButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 30, 110, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar"));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Jugador");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 23, -1, -1));
        jPanel1.add(jTextFieldBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 20, 140, -1));

        jLabel4.setText("Bajas/Partido");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, -1, -1));

        jTextFieldNumHabitantes.setEditable(false);
        jTextFieldNumHabitantes.setBackground(new java.awt.Color(204, 204, 255));
        jTextFieldNumHabitantes.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel1.add(jTextFieldNumHabitantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 110, -1));

        jButtonBuscarCiudad.setBackground(new java.awt.Color(0, 153, 51));
        jButtonBuscarCiudad.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButtonBuscarCiudad.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBuscarCiudad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/net/ausiasmarch/estadistica/res/Find.png"))); // NOI18N
        jButtonBuscarCiudad.setText(" Buscar");
        jButtonBuscarCiudad.setToolTipText("");
        jButtonBuscarCiudad.setEnabled(false);
        jButtonBuscarCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarCiudadActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonBuscarCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 110, -1));

        jTextFieldPorcentaje.setEditable(false);
        jTextFieldPorcentaje.setBackground(new java.awt.Color(204, 204, 255));
        jTextFieldPorcentaje.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldPorcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPorcentajeActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldPorcentaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, 60, -1));

        jLabel7.setText("%");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 20, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 800, 60));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultados estadísticos"));
        jPanel2.setOpaque(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Equipo");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 140, -1));

        jTextFieldNumCiudades.setEditable(false);
        jTextFieldNumCiudades.setBackground(new java.awt.Color(204, 204, 255));
        jTextFieldNumCiudades.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel2.add(jTextFieldNumCiudades, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 110, -1));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Media de Bajas/Partido");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 150, -1));

        jTextFieldMediaHabitantes.setEditable(false);
        jTextFieldMediaHabitantes.setBackground(new java.awt.Color(204, 204, 255));
        jTextFieldMediaHabitantes.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel2.add(jTextFieldMediaHabitantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 110, -1));

        jLabel11.setText("Jugador con mayor indice de Bajas/Partido");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 310, -1));

        jTextFieldCiudadMayorHab.setEditable(false);
        jTextFieldCiudadMayorHab.setBackground(new java.awt.Color(204, 204, 255));
        jTextFieldCiudadMayorHab.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel2.add(jTextFieldCiudadMayorHab, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 310, -1));

        jLabel13.setText("Rango");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 40, -1, -1));

        jTextFieldMayorHabitantes.setEditable(false);
        jTextFieldMayorHabitantes.setBackground(new java.awt.Color(204, 204, 255));
        jTextFieldMayorHabitantes.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel2.add(jTextFieldMayorHabitantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 60, 100, -1));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Bajas ultimo partido");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 150, -1));

        jTextFieldTotal.setEditable(false);
        jTextFieldTotal.setBackground(new java.awt.Color(204, 204, 255));
        jTextFieldTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel2.add(jTextFieldTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 110, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 800, 130));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, -1, 20));

        jTextFieldHabitantes.setToolTipText("Número de habitantes");
        getContentPane().add(jTextFieldHabitantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 110, 20));

        jButtonCalcular.setBackground(new java.awt.Color(102, 153, 255));
        jButtonCalcular.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButtonCalcular.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCalcular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/net/ausiasmarch/estadistica/res/Sum.png"))); // NOI18N
        jButtonCalcular.setText(" Calcular");
        jButtonCalcular.setToolTipText("");
        jButtonCalcular.setEnabled(false);
        jButtonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 240, 120, -1));

        jButtonLimpiar.setBackground(new java.awt.Color(255, 102, 102));
        jButtonLimpiar.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButtonLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/net/ausiasmarch/estadistica/res/clear.png"))); // NOI18N
        jButtonLimpiar.setText(" Limpiar");
        jButtonLimpiar.setToolTipText("");
        jButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 490, 140, -1));

        jButtonSalir.setBackground(new java.awt.Color(255, 102, 102));
        jButtonSalir.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButtonSalir.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/net/ausiasmarch/estadistica/res/exit.png"))); // NOI18N
        jButtonSalir.setText("Salir");
        jButtonSalir.setToolTipText("");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 490, 120, -1));

        gridCiudades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(gridCiudades);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 121, 790, 110));

        jButtonBorrarCiudad.setBackground(new java.awt.Color(102, 153, 255));
        jButtonBorrarCiudad.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButtonBorrarCiudad.setForeground(new java.awt.Color(0, 0, 0));
        jButtonBorrarCiudad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/net/ausiasmarch/estadistica/res/Remove.gif"))); // NOI18N
        jButtonBorrarCiudad.setText("Borrar ciudad");
        jButtonBorrarCiudad.setToolTipText("");
        jButtonBorrarCiudad.setEnabled(false);
        jButtonBorrarCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBorrarCiudadActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBorrarCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, 180, -1));

        jComboBoxOrdenar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Más bajas", "Más victorias", "Alfabeticamente" }));
        jComboBoxOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxOrdenarActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxOrdenar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 240, -1));

        jLabel3.setText("Ordenar por");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 90, 20));

        jComboBoxComunidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cloud9", "Gamer2", "Ninjas in Pyjamas", "Virtus.Pro", "Na’Vi", "TSM", "EnVyUs", "Fnatic" }));
        jComboBoxComunidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxComunidadActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxComunidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 270, -1));

        jLabel10.setText("Equipos Profesionales CSGO");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Agrega ciudades
     *
     * @param evt
     */
    private void jButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarActionPerformed
        StringBuilder sb = new StringBuilder();   // para mensajes de error
        // Datos de una ciudad
        String sComunidad, sCiudad, sHabitantes;
        long habitantes;
        Ciudad ciudad;
        
        // Objeto para validar las anotaciones de la clase Ciudad
        ValidatorAnnotation validator = new ValidatorAnnotation();

        // Obtenemos los datos de entrada
        sCiudad = jTextFieldCiudad.getText();
        sHabitantes = jTextFieldHabitantes.getText();
        sComunidad = jComboBoxComunidad.getSelectedItem().toString().toUpperCase();

        // Comprobamos si la ciudad esta la lista
        if (gestorCiudades.buscarCiudad(sCiudad) != null) {
            mensaje(sCiudad.toUpperCase() + " ya está en la lista");
            return;
        }

        // Validamos los habitantes 
        if (!Convert.isValidInt(sHabitantes)) {
            sb.append("- Habitantes: Número no válido\n");
        }

        // Mostramos los posibles mensajes de error de entrada
        if (mensajesError(sb.toString())) {
            return;
        }

        // Convertimos los datos 
        habitantes = Convert.parseLong(sHabitantes);
        
        // creamos la ciudad
        ciudad = new Ciudad(sComunidad,sCiudad.toUpperCase(), habitantes);

        // Validamos los datos de la ciudad usando el objeto validator y 
        // añadimos la lista de errores devuelta al StringBuilder 
        sb.append(validator.getListErrors(ciudad));

        // Si hay errores de valicidacion, los mostramos 
        if (mensajesError(sb.toString())) {
            return;
        }

        // Agregamos el objeto ciudad a la lista de ciudades
        ciudades.add(ciudad);
        // Pasamos la lista de ciudades al gestor de ciudades
        gestorCiudades.setCiudades(ciudades);

        // Limpiamos los campos de entrada
        limpiaCamposEntrada();

        // Mostramos la lista de ciudades en el grid
        actualizarGrid(ciudades);
        // Ordenamos la lista
        ordenar();

        // Activamos botones
        activaOnOff(true);
    }//GEN-LAST:event_jButtonAgregarActionPerformed

    /**
     * Limpia los campos de entrada
     */
    private void limpiaCamposEntrada(){
         jTextFieldCiudad.setText("");
        jTextFieldHabitantes.setText("");
    }
    
    /**
     * Comprueba si hay mensajes de error
     *
     * @param mensaje
     * @return boolean
     */
    private boolean mensajesError(String mensaje) {
        if (mensaje.length() > 0) {
            mensaje(mensaje);
            return true;
        }
        return false;
    }

    /**
     * Activa / desactiva componentes
     *
     * @param sn
     */
    private void activaOnOff(boolean sn) {
        jButtonCalcular.setEnabled(sn);
        jButtonBorrarCiudad.setEnabled(sn);
        jButtonBuscarCiudad.setEnabled(sn);
        gridCiudades.setEnabled(sn);
    }

    /**
     * Actualiza el grid usando el list de ciudades
     */
    private void actualizarGrid(List<Ciudad> ciudades) {
        int fila = 0;    
        // Convertimos el objeto ciudad en un List
      //  List lista = gestorCiudades.asListCiudad(ciudades.get(0));
      
        List<List> lista = gestorCiudades.aslistaCiudades(ciudades);
        gridCiudades.clear();
        gridCiudades.loadFromList(lista, columnas);
        
      //  gridCiudades.setTypeColumn(lista, columnas, false);
       /* 
        for (Ciudad c : ciudades){
            gridCiudades.setValueAt(c.getComunidad(),fila, 0);
            gridCiudades.setValueAt(c.getCiudad(),fila, 1);
            gridCiudades.setValueAt(c.getHabitantes(),fila, 2);
            fila++;
        }*/
        gridCiudades.firstRow();
    }

    /**
     * Borra una ciudad de la lista
     *
     * @param evt
     */
    private void jButtonBorrarCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrarCiudadActionPerformed
        String ciudad;
        // Seleccionamos la fila del grid
        int fila = gridCiudades.getSelectedRow();
        
        // Si hay una fila seleccionada...
        if (fila >= 0) {
            // Obtenemos la columna nombre
            ciudad = gridCiudades.getValueAt(fila, 1).toString();
            gestorCiudades.borrarCiudad(ciudad);
        }
        
        // Si la lista quedo vacia...
        if (ciudades.isEmpty()) {
            activaOnOff(false);
            limpiarDatos();
            return;
        }
        
         actualizarGrid(ciudades);
    }//GEN-LAST:event_jButtonBorrarCiudadActionPerformed

    /**
     * Obtiene los datos estadisticos
     *
     * @param evt
     */
    private void jButtonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalcularActionPerformed
        // Obtenemos los calculos
        double total = gestorCiudades.sumaHabitantes();
        double mediaHabitantes = gestorCiudades.mediaHabitantes();
        int numCiudades = gestorCiudades.numCiudades();
        Ciudad ciudadMayor = gestorCiudades.ciudadMayorHabitantes();
        // Mostramos los calculos
        jTextFieldTotal.setText(Convert.format(total, 2));
        jTextFieldNumCiudades.setText(Convert.format(numCiudades));
        jTextFieldMediaHabitantes.setText(Convert.format(mediaHabitantes, 2));
        jTextFieldCiudadMayorHab.setText(ciudadMayor.getCiudad());
        jTextFieldMayorHabitantes.setText(Convert.format(ciudadMayor.getHabitantes()));
    }//GEN-LAST:event_jButtonCalcularActionPerformed

    /**
     * Limpia los datos
     *
     * @param evt
     */
    private void jButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarActionPerformed
        activaOnOff(false);
        limpiarDatos();
    }//GEN-LAST:event_jButtonLimpiarActionPerformed

    /**
     * Finaliza la aplicacion
     *
     * @param evt
     */
    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonSalirActionPerformed

    /**
     * Busca una ciudad en la lista de ciudades
     *
     * @param evt
     */
    private void jButtonBuscarCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarCiudadActionPerformed
        long habitantes;
        double porc;
        
        String nombre = jTextFieldBusqueda.getText().toUpperCase();
        
        
        // Buscamos la ciudad
        Ciudad ciudad = gestorCiudades.buscarCiudad(nombre);

        if (ciudad == null) {
            mensaje("No se encuentra esa ciudad");
            return;
        }
       
        // Obtenemos los habitantesde la ciudad
        habitantes = ciudad.getHabitantes();
        // Calculamos el porcenteje
        porc = habitantes * 100 / gestorCiudades.sumaHabitantes();
        
       jTextFieldNumHabitantes.setText(Convert.format(habitantes)); 
       jTextFieldPorcentaje.setText(Convert.format(porc,2));
        
    }//GEN-LAST:event_jButtonBuscarCiudadActionPerformed

    private void jComboBoxOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxOrdenarActionPerformed
        ordenar();
    }//GEN-LAST:event_jComboBoxOrdenarActionPerformed

    private void jComboBoxComunidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxComunidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxComunidadActionPerformed

    private void jTextFieldPorcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPorcentajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPorcentajeActionPerformed

    private void jTextFieldCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCiudadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCiudadActionPerformed

    // Ordena la lista de ciudades 
    private void ordenar() {
        // Si la lista de ciudades no esta vacia
        if (!ciudades.isEmpty()) {
            int valor = jComboBoxOrdenar.getSelectedIndex();
            switch (valor) {
                case 0:case 1:
                    gestorCiudades.ordenarComunidadCiudad();
                    break;
                case 2:
                    gestorCiudades.ordenarHabitantesAsc();
                    break;
                case 3:
                    gestorCiudades.ordenarHabitantesDesc();
                    break;
            }
             actualizarGrid(ciudades);;
        }
    }

    /**
     * Limpia todos los datos del form
     */
    private void limpiarDatos() {
        jTextFieldMediaHabitantes.setText("");
        jTextFieldNumCiudades.setText("");
        jTextFieldCiudadMayorHab.setText("");
        jTextFieldMayorHabitantes.setText("");
        jTextFieldBusqueda.setText("");
        jTextFieldNumHabitantes.setText("");
        jTextFieldTotal.setText("");
        jComboBoxComunidad.setSelectedIndex(0);
        jComboBoxOrdenar.setSelectedIndex(0);
        gridCiudades.clear();
        ciudades.clear();
        iniciaGrid();
    }

    /**
     * Muestra un mensaje en un JOptionPane
     *
     * @param mensaje
     */
    private void mensaje(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje);
    }

    /**
     * Inicia grid
     */
    private void iniciaGrid() {
        RenderGrid formato = new RenderGrid();
        formato.setColorFillSelected(Color.WHITE, new Color(20,120,255));
        // Grid principal de ciudades
        gridCiudades.getTableHeader().setBackground(Color.BLUE);
        gridCiudades.getTableHeader().setForeground(Color.white);
        gridCiudades.setColumnIdentifiers(columnas);  // columnas
        gridCiudades.setNumRows(5);                   // filas del grid
        gridCiudades.setEnabled(false);               // activa el grid    
        gridCiudades.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        gridCiudades.getTableHeader().setReorderingAllowed(false);
        gridCiudades.setDefaultRenderer(String.class, formato);
        gridCiudades.setDefaultRenderer(Integer.class, formato);
        gridCiudades.setDefaultRenderer(Long.class, formato);
        gridCiudades.setDefaultRenderer(Double.class, formato);
    }

    /**
     * Metodo Main
     *
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Main main = new Main();
                main.getContentPane().setBackground(Color.WHITE);
                main.setSize(830, 580);
                main.setLocationRelativeTo(null);
                main.setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private net.ausiasmarch.estadistica.utils.Grid gridCiudades;
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JButton jButtonBorrarCiudad;
    private javax.swing.JButton jButtonBuscarCiudad;
    private javax.swing.JButton jButtonCalcular;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JComboBox<String> jComboBoxComunidad;
    private javax.swing.JComboBox<String> jComboBoxOrdenar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldBusqueda;
    private javax.swing.JTextField jTextFieldCiudad;
    private javax.swing.JTextField jTextFieldCiudadMayorHab;
    private javax.swing.JTextField jTextFieldHabitantes;
    private javax.swing.JTextField jTextFieldMayorHabitantes;
    private javax.swing.JTextField jTextFieldMediaHabitantes;
    private javax.swing.JTextField jTextFieldNumCiudades;
    private javax.swing.JTextField jTextFieldNumHabitantes;
    private javax.swing.JTextField jTextFieldPorcentaje;
    private javax.swing.JTextField jTextFieldTotal;
    // End of variables declaration//GEN-END:variables
}
