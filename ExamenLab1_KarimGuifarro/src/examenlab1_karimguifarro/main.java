/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenlab1_karimguifarro;

import java.awt.Color;
import java.util.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class main extends javax.swing.JFrame {

    public main() {
        initComponents();
        DefaultComboBoxModel estad
                = (DefaultComboBoxModel) cb_estado.getModel();
        estad.addElement(new estado("Disponible"));
        estad.addElement(new estado("Fuera de Inventario"));
        ((estado) estad.getElementAt(0)).setNombre("Prestado");
        estad.removeElementAt(1);

        cb_estado.setModel(estad);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adm = new javax.swing.JFrame();
        admin = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jautor = new javax.swing.JTextField();
        jtitulo = new javax.swing.JTextField();
        jgenero = new javax.swing.JTextField();
        jeditoriales = new javax.swing.JTextField();
        jidioma = new javax.swing.JTextField();
        jcreacion = new javax.swing.JTextField();
        jisbn = new javax.swing.JTextField();
        jingreso = new javax.swing.JTextField();
        jpersona = new javax.swing.JTextField();
        jcuenta = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        cb_estado = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        isbn2 = new javax.swing.JTextField();
        gen = new javax.swing.JTextField();
        tit = new javax.swing.JTextField();
        aut = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        sig = new javax.swing.JFrame();
        sign = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        usertxt = new javax.swing.JTextField();
        apellidotxt = new javax.swing.JTextField();
        create = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        admintxt = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        nombretxt = new javax.swing.JTextField();
        edadtxt = new javax.swing.JTextField();
        reg = new javax.swing.JFrame();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        pass = new javax.swing.JTextField();
        login = new javax.swing.JButton();
        signin = new javax.swing.JButton();

        adm.setLocation(new java.awt.Point(0, 0));
        adm.setMaximumSize(new java.awt.Dimension(500, 500));
        adm.setMinimumSize(new java.awt.Dimension(500, 500));
        adm.setResizable(false);
        adm.setSize(new java.awt.Dimension(400, 400));

        admin.setPreferredSize(new java.awt.Dimension(400, 400));

        jLabel6.setText("Autor");

        jLabel7.setText("Titulo");

        jLabel8.setText("Genero");

        jLabel9.setText("Editoriales");

        jLabel10.setText("Idioma");

        jLabel11.setText("Año de Creacion:");

        jLabel12.setText("ISBN:");

        jLabel13.setText("Año de Ingreso:");

        jLabel14.setText("Persona que posee el libro:");

        jLabel15.setText("Numero de Cuenta:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Autor", "Título", "Genero", "ISBN", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel16.setText("Estado:");

        jButton1.setText("Agregar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jeditoriales)
                    .addComponent(jgenero, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtitulo)
                    .addComponent(jautor)
                    .addComponent(jidioma, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jcreacion)
                    .addComponent(jisbn)
                    .addComponent(jingreso)
                    .addComponent(cb_estado, 0, 85, Short.MAX_VALUE))
                .addGap(38, 38, 38))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel14))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jpersona)
                            .addComponent(jcuenta, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))))
                .addGap(51, 51, 51))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(194, 194, 194)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel11)
                    .addComponent(jautor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcreacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jgenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jeditoriales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jidioma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13)
                                    .addComponent(jingreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jisbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(cb_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jpersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        admin.addTab("Ingresar producto", jPanel1);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Autor", "Título", "Genero", "ISBN", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable3);

        jLabel21.setText("ISBN:");

        jLabel22.setText("Genero:");

        jLabel23.setText("Titulo:");

        jLabel24.setText("Autor:");

        jButton2.setText("Buscar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel24))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(isbn2, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                                    .addComponent(gen)
                                    .addComponent(tit)
                                    .addComponent(aut))))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(isbn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addGap(26, 26, 26)
                .addComponent(jButton2)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        admin.addTab("Listar Inventario", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 398, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 456, Short.MAX_VALUE)
        );

        admin.addTab("Editar Inventario", jPanel3);

        javax.swing.GroupLayout admLayout = new javax.swing.GroupLayout(adm.getContentPane());
        adm.getContentPane().setLayout(admLayout);
        admLayout.setHorizontalGroup(
            admLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(admLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(admin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        admLayout.setVerticalGroup(
            admLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(admLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(admin, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
                .addContainerGap())
        );

        sig.setMaximumSize(new java.awt.Dimension(400, 400));
        sig.setMinimumSize(new java.awt.Dimension(400, 400));
        sig.setResizable(false);

        jLabel3.setText("Usuario:");

        jLabel4.setText("Apellido:");

        create.setText("Crear Usuario");
        create.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createMouseClicked(evt);
            }
        });

        jLabel5.setText("Admin:");

        jLabel18.setText("Nombre:");

        jLabel20.setText("Edad:");

        javax.swing.GroupLayout signLayout = new javax.swing.GroupLayout(sign);
        sign.setLayout(signLayout);
        signLayout.setHorizontalGroup(
            signLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signLayout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(create)
                .addContainerGap(111, Short.MAX_VALUE))
            .addGroup(signLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(signLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(signLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel18)
                        .addComponent(jLabel3))
                    .addComponent(jLabel5)
                    .addComponent(jLabel20))
                .addGap(47, 47, 47)
                .addGroup(signLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(nombretxt)
                    .addComponent(apellidotxt)
                    .addComponent(usertxt)
                    .addComponent(edadtxt, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                    .addComponent(admintxt, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        signLayout.setVerticalGroup(
            signLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(signLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(usertxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(signLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(nombretxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(signLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apellidotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(27, 27, 27)
                .addGroup(signLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(edadtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(signLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(admintxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addComponent(create)
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout sigLayout = new javax.swing.GroupLayout(sig.getContentPane());
        sig.getContentPane().setLayout(sigLayout);
        sigLayout.setHorizontalGroup(
            sigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sigLayout.createSequentialGroup()
                .addComponent(sign, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );
        sigLayout.setVerticalGroup(
            sigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sigLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sign, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Reservar", jTabbedPane2);

        javax.swing.GroupLayout regLayout = new javax.swing.GroupLayout(reg.getContentPane());
        reg.getContentPane().setLayout(regLayout);
        regLayout.setHorizontalGroup(
            regLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(regLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addContainerGap())
        );
        regLayout.setVerticalGroup(
            regLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(regLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel17.setText("jLabel17");

        jLabel19.setText("jLabel19");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("princi");
        setMaximumSize(new java.awt.Dimension(400, 400));
        setMinimumSize(new java.awt.Dimension(400, 400));
        setResizable(false);

        jLabel1.setText("codigo:");

        jLabel2.setText("Contraseña:");

        login.setText("Log in");
        login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginMouseClicked(evt);
            }
        });

        signin.setText("Sing in");
        signin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signinMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pass, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                            .addComponent(user)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(login)
                        .addGap(18, 18, 18)
                        .addComponent(signin)))
                .addContainerGap(128, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(login)
                    .addComponent(signin))
                .addContainerGap(124, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleDescription("princi");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseClicked
        String codigo, admin = "1324";
        codigo = user.getText();
        JOptionPane.showMessageDialog(this,
                 "para ser admin ingresar codigo 1324");
           
                adm.setVisible(true);
            
        
    }//GEN-LAST:event_loginMouseClicked

    private void signinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signinMouseClicked
        sig.setVisible(true);
    }//GEN-LAST:event_signinMouseClicked

    private void createMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createMouseClicked
        String codigo,nombre,apellido,edad,admin;
        codigo = usertxt.getText();
        nombre = nombretxt.getText();
        apellido=apellidotxt.getText();
        edad=edadtxt.getText();
        admin = admintxt.getText();
        use.add(new usuario(codigo,nombre,apellido,edad,admin));
    }//GEN-LAST:event_createMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        String autores, titulo, genero, editoriales, idioma, ISBN, año_ingreso, estado, libro_persona, cuenta_persona, creacion;
        try {
            titulo = jtitulo.getText();
            estado = cb_estado.getSelectedItem().toString();
            editoriales = jeditoriales.getText();
            idioma = jidioma.getText();
            genero = jgenero.getText();
            ISBN = jisbn.getText();
            libro_persona = jpersona.getText();
            cuenta_persona = jcuenta.getText();
            año_ingreso = jingreso.getText();
            creacion = jcreacion.getText();
            autores = jautor.getText();
            jautor.setText("");
            jtitulo.setText("");
            jgenero.setText("");
            jeditoriales.setText("");
            jcreacion.setText("");
            jisbn.setText("");
            jingreso.setText("");
            jpersona.setText("");
            jcuenta.setText("");
            cb_estado.setSelectedIndex(0);
            libro.add(new Inventario(autores, titulo, genero, editoriales, idioma, ISBN, año_ingreso, estado, libro_persona, cuenta_persona, creacion));
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this,
                    "Ocurrio un error y no se guardaron los datos");
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        String isbn,titulo,genero,autor;
        isbn=isbn2.getText();
        titulo=tit.getText();
        genero=gen.getText();
        autor=aut.getText();
        for (int i = 0; i < libro.size(); i++) {
            if (libro.get(i).equals(isbn)||libro.get(i).equals(autor)||libro.get(i).equals(genero)||libro.get(i).equals(titulo)) {
                
            }
        }
    }//GEN-LAST:event_jButton2MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame adm;
    private javax.swing.JTabbedPane admin;
    private javax.swing.JTextField admintxt;
    private javax.swing.JTextField apellidotxt;
    private javax.swing.JTextField aut;
    private javax.swing.JComboBox<String> cb_estado;
    private javax.swing.JButton create;
    private javax.swing.JTextField edadtxt;
    private javax.swing.JTextField gen;
    private javax.swing.JTextField isbn2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jautor;
    private javax.swing.JTextField jcreacion;
    private javax.swing.JTextField jcuenta;
    private javax.swing.JTextField jeditoriales;
    private javax.swing.JTextField jgenero;
    private javax.swing.JTextField jidioma;
    private javax.swing.JTextField jingreso;
    private javax.swing.JTextField jisbn;
    private javax.swing.JTextField jpersona;
    private javax.swing.JTextField jtitulo;
    private javax.swing.JButton login;
    private javax.swing.JTextField nombretxt;
    private javax.swing.JTextField pass;
    private javax.swing.JFrame reg;
    private javax.swing.JFrame sig;
    private javax.swing.JPanel sign;
    private javax.swing.JButton signin;
    private javax.swing.JTextField tit;
    private javax.swing.JTextField user;
    private javax.swing.JTextField usertxt;
    // End of variables declaration//GEN-END:variables
public static ArrayList<usuario> use = new ArrayList();
    public static ArrayList<Inventario> libro = new ArrayList();

}
