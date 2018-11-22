/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

/**
 *
 * @author Andy
 */
public class ViewAdministradores extends javax.swing.JFrame {

    /**
     * Creates new form ViewAdministradores
     */
    public ViewAdministradores() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jl_idadmin = new javax.swing.JLabel();
        jl_rfc = new javax.swing.JLabel();
        jtf_idadmin = new javax.swing.JTextField();
        jtf_rfc = new javax.swing.JTextField();
        jl_nomusuario = new javax.swing.JLabel();
        jpf_passwd = new javax.swing.JPasswordField();
        jl_nombre = new javax.swing.JLabel();
        jtf_nombre = new javax.swing.JTextField();
        jl_apellidopat = new javax.swing.JLabel();
        jtf_apellidopat = new javax.swing.JTextField();
        jl_apellidomate = new javax.swing.JLabel();
        jtf_apellidomate = new javax.swing.JTextField();
        jl_fechanac = new javax.swing.JLabel();
        jtf_anio = new javax.swing.JTextField();
        jcb_dia = new javax.swing.JComboBox<>();
        jcb_mes = new javax.swing.JComboBox<>();
        jl_fechain = new javax.swing.JLabel();
        jl_telefono = new javax.swing.JLabel();
        jcb_diain = new javax.swing.JComboBox<>();
        jcb_mesin = new javax.swing.JComboBox<>();
        jtf_anioin = new javax.swing.JTextField();
        jtf_telefono = new javax.swing.JTextField();
        jl_correoelectronico = new javax.swing.JLabel();
        jl_calle = new javax.swing.JLabel();
        jtf_correoelectronico = new javax.swing.JTextField();
        jl_colonia = new javax.swing.JLabel();
        jtf_calle = new javax.swing.JTextField();
        jl_codigopostal = new javax.swing.JLabel();
        jtf_colonia = new javax.swing.JTextField();
        jtf_ciudad = new javax.swing.JTextField();
        jl_ciudad = new javax.swing.JLabel();
        jtf_codigopostal = new javax.swing.JTextField();
        jl_estado = new javax.swing.JLabel();
        jtf_estado = new javax.swing.JTextField();
        jb_nuevo = new javax.swing.JButton();
        jb_insertar = new javax.swing.JButton();
        jb_modificar = new javax.swing.JButton();
        jb_eliminar = new javax.swing.JButton();
        jb_primero = new javax.swing.JButton();
        jb_anterior = new javax.swing.JButton();
        jb_siguiente = new javax.swing.JButton();
        jb_ultimo = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jl_passwd1 = new javax.swing.JLabel();
        jtf_nomusuario = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jPanel2.setBackground(new java.awt.Color(153, 0, 0));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ferreteria ACME");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Administradores");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1Admin.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel2)))
                .addContainerGap())
        );

        jl_idadmin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jl_idadmin.setForeground(new java.awt.Color(255, 255, 255));
        jl_idadmin.setText("ID Administradores:");

        jl_rfc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jl_rfc.setForeground(new java.awt.Color(255, 255, 255));
        jl_rfc.setText("R.F.C:");

        jtf_idadmin.setEnabled(false);

        jl_nomusuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jl_nomusuario.setForeground(new java.awt.Color(255, 255, 255));
        jl_nomusuario.setText("Nombre de Usuario:");

        jpf_passwd.setText("jPasswordField1");

        jl_nombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jl_nombre.setForeground(new java.awt.Color(255, 255, 255));
        jl_nombre.setText("Nombre:");

        jl_apellidopat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jl_apellidopat.setForeground(new java.awt.Color(255, 255, 255));
        jl_apellidopat.setText("Apellido Paterno:");

        jl_apellidomate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jl_apellidomate.setForeground(new java.awt.Color(255, 255, 255));
        jl_apellidomate.setText("Apellido Materno:");

        jl_fechanac.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jl_fechanac.setForeground(new java.awt.Color(255, 255, 255));
        jl_fechanac.setText("Fecha de Nacimiento:");

        jcb_dia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18 19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jcb_mes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        jl_fechain.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jl_fechain.setForeground(new java.awt.Color(255, 255, 255));
        jl_fechain.setText("Fecha de Ingreso:");

        jl_telefono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jl_telefono.setForeground(new java.awt.Color(255, 255, 255));
        jl_telefono.setText("Telefono:");

        jcb_diain.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18 19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jcb_mesin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        jl_correoelectronico.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jl_correoelectronico.setForeground(new java.awt.Color(255, 255, 255));
        jl_correoelectronico.setText("Correo electronico:");

        jl_calle.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jl_calle.setForeground(new java.awt.Color(255, 255, 255));
        jl_calle.setText("Calle No.:");

        jl_colonia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jl_colonia.setForeground(new java.awt.Color(255, 255, 255));
        jl_colonia.setText("Colonia:");

        jl_codigopostal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jl_codigopostal.setForeground(new java.awt.Color(255, 255, 255));
        jl_codigopostal.setText("Codigo Postal:");

        jl_ciudad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jl_ciudad.setForeground(new java.awt.Color(255, 255, 255));
        jl_ciudad.setText("Ciudad:");

        jl_estado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jl_estado.setForeground(new java.awt.Color(255, 255, 255));
        jl_estado.setText("Estado:");

        jb_nuevo.setBackground(new java.awt.Color(153, 153, 153));
        jb_nuevo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jb_nuevo.setText("Nuevo");
        jb_nuevo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));

        jb_insertar.setBackground(new java.awt.Color(153, 153, 153));
        jb_insertar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jb_insertar.setText("Insertar");
        jb_insertar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 153, 0), new java.awt.Color(0, 153, 0), new java.awt.Color(0, 153, 0), new java.awt.Color(0, 153, 0)));

        jb_modificar.setBackground(new java.awt.Color(153, 153, 153));
        jb_modificar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jb_modificar.setText("Modificar");
        jb_modificar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 153, 0), new java.awt.Color(0, 153, 0), new java.awt.Color(0, 153, 0), new java.awt.Color(0, 153, 0)));

        jb_eliminar.setBackground(new java.awt.Color(153, 153, 153));
        jb_eliminar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jb_eliminar.setText("Eliminar");
        jb_eliminar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 0, 0), new java.awt.Color(255, 0, 0), new java.awt.Color(255, 0, 0), new java.awt.Color(255, 0, 0)));

        jb_primero.setBackground(new java.awt.Color(153, 153, 153));
        jb_primero.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jb_primero.setForeground(new java.awt.Color(51, 51, 51));
        jb_primero.setText("|<");
        jb_primero.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));

        jb_anterior.setBackground(new java.awt.Color(204, 204, 204));
        jb_anterior.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jb_anterior.setForeground(new java.awt.Color(51, 51, 51));
        jb_anterior.setText("<<");
        jb_anterior.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));

        jb_siguiente.setBackground(new java.awt.Color(204, 204, 204));
        jb_siguiente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jb_siguiente.setForeground(new java.awt.Color(51, 51, 51));
        jb_siguiente.setText(">>");
        jb_siguiente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));

        jb_ultimo.setBackground(new java.awt.Color(153, 153, 153));
        jb_ultimo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jb_ultimo.setForeground(new java.awt.Color(51, 51, 51));
        jb_ultimo.setText(">|");
        jb_ultimo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1insertar.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1inser.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1editar.png"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1eliminar.png"))); // NOI18N

        jl_passwd1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jl_passwd1.setForeground(new java.awt.Color(255, 255, 255));
        jl_passwd1.setText("Contraseña:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jl_rfc, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jl_idadmin, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 18, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtf_idadmin, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtf_rfc, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22))
                            .addComponent(jl_nombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jl_fechanac)
                                        .addComponent(jl_correoelectronico)
                                        .addComponent(jl_calle)
                                        .addComponent(jl_telefono)
                                        .addComponent(jl_fechain)
                                        .addComponent(jl_colonia)
                                        .addComponent(jl_codigopostal)
                                        .addComponent(jl_apellidopat))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jl_apellidomate)
                                        .addGap(29, 29, 29)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtf_apellidopat)
                                            .addComponent(jtf_apellidomate)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtf_colonia, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jtf_calle, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jtf_correoelectronico, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jtf_telefono)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jcb_dia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jcb_diain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jcb_mesin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jcb_mes, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jtf_anio)
                                                    .addComponent(jtf_anioin)))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jtf_codigopostal, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE)))))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jb_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jb_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jb_insertar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(jb_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jl_estado)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jtf_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jl_ciudad)
                                        .addGap(28, 28, 28)
                                        .addComponent(jtf_ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jl_nomusuario)
                                    .addComponent(jl_passwd1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtf_nomusuario)
                                    .addComponent(jpf_passwd, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(jb_primero, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jb_anterior, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jb_siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jb_ultimo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_idadmin)
                    .addComponent(jtf_idadmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_nomusuario)
                    .addComponent(jtf_nomusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_rfc)
                    .addComponent(jtf_rfc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpf_passwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_passwd1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_nombre)
                            .addComponent(jtf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_apellidopat)
                            .addComponent(jtf_apellidopat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_apellidomate)
                            .addComponent(jtf_apellidomate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jl_fechanac)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jcb_dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jcb_mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtf_anio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_fechain)
                            .addComponent(jcb_diain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcb_mesin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtf_anioin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jl_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtf_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_correoelectronico)
                            .addComponent(jtf_correoelectronico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jb_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jb_insertar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jb_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jb_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl_calle)
                    .addComponent(jtf_calle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtf_colonia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_colonia)
                    .addComponent(jl_ciudad)
                    .addComponent(jtf_ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_codigopostal)
                    .addComponent(jtf_codigopostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_estado)
                    .addComponent(jtf_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_primero, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_anterior, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_ultimo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ViewAdministradores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewAdministradores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewAdministradores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewAdministradores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewAdministradores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JButton jb_anterior;
    public javax.swing.JButton jb_eliminar;
    public javax.swing.JButton jb_insertar;
    public javax.swing.JButton jb_modificar;
    public javax.swing.JButton jb_nuevo;
    public javax.swing.JButton jb_primero;
    public javax.swing.JButton jb_siguiente;
    public javax.swing.JButton jb_ultimo;
    public javax.swing.JComboBox<String> jcb_dia;
    public javax.swing.JComboBox<String> jcb_diain;
    public javax.swing.JComboBox<String> jcb_mes;
    public javax.swing.JComboBox<String> jcb_mesin;
    public javax.swing.JLabel jl_apellidomate;
    public javax.swing.JLabel jl_apellidopat;
    public javax.swing.JLabel jl_calle;
    public javax.swing.JLabel jl_ciudad;
    public javax.swing.JLabel jl_codigopostal;
    public javax.swing.JLabel jl_colonia;
    public javax.swing.JLabel jl_correoelectronico;
    public javax.swing.JLabel jl_estado;
    public javax.swing.JLabel jl_fechain;
    public javax.swing.JLabel jl_fechanac;
    public javax.swing.JLabel jl_idadmin;
    public javax.swing.JLabel jl_nombre;
    public javax.swing.JLabel jl_nomusuario;
    public javax.swing.JLabel jl_passwd1;
    public javax.swing.JLabel jl_rfc;
    public javax.swing.JLabel jl_telefono;
    public javax.swing.JPasswordField jpf_passwd;
    public javax.swing.JTextField jtf_anio;
    public javax.swing.JTextField jtf_anioin;
    public javax.swing.JTextField jtf_apellidomate;
    public javax.swing.JTextField jtf_apellidopat;
    public javax.swing.JTextField jtf_calle;
    public javax.swing.JTextField jtf_ciudad;
    public javax.swing.JTextField jtf_codigopostal;
    public javax.swing.JTextField jtf_colonia;
    public javax.swing.JTextField jtf_correoelectronico;
    public javax.swing.JTextField jtf_estado;
    public javax.swing.JTextField jtf_idadmin;
    public javax.swing.JTextField jtf_nombre;
    public javax.swing.JTextField jtf_nomusuario;
    public javax.swing.JTextField jtf_rfc;
    public javax.swing.JTextField jtf_telefono;
    // End of variables declaration//GEN-END:variables
}
