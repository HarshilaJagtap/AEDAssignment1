/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.aed.view;

import com.aed.model.Contact_Info;
import com.aed.model.Employee;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yashpawar
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    int id = 1, personId = 0;
    List<Employee> emp = new ArrayList<>();
    boolean a = emp.add(new Employee(id++, "Yash Pawar", 24, "Male",
            "2020-12-05",
            "A5", "IKEA", "Developer", new Contact_Info("9822519697", "abc@gmail.com")));
    boolean b = emp.add(new Employee(id++, "Piyush Jain", 28, "Male",
            "2021-01-12",
            "A3", "SIEMENS", "Developer", new Contact_Info("2207891155", "bac@gmail.com")));
    boolean c = emp.add(new Employee(id++, "Nikunj Doshi", 30, "Male",
            "2015-10-23",
            "M2", "CISCO", "Manager", new Contact_Info("9579971845", "ias122@gmail.com")));
    boolean d = emp.add(new Employee(id++, "Harshila Jagtap", 27, "Female",
            "2017-02-20",
            "A9", "Infosys", "Consultant", new Contact_Info("6172387744", "prem@gmail.com")));

    public MainFrame() {
        initComponents();
        resetAction();
        setEmployeeTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ageField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        genderField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        dateField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        levelField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        teamField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        positionField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        contactField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        photoField = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        submitButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        employeeTable = new javax.swing.JTable();

        jButton1.setText("jButton1");

        jButton2.setText("Submit");

        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Delete");

        jButton5.setText("Reset");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Employee Details"));
        jPanel1.setLayout(new java.awt.GridLayout(10, 2, 4, 5));

        jLabel1.setText("Name");
        jPanel1.add(jLabel1);

        nameField.setText("jTextField1");
        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });
        jPanel1.add(nameField);

        jLabel2.setText("Age");
        jPanel1.add(jLabel2);

        ageField.setText("jTextField2");
        jPanel1.add(ageField);

        jLabel3.setText("Gender");
        jPanel1.add(jLabel3);

        genderField.setText("jTextField3");
        jPanel1.add(genderField);

        jLabel4.setText("Start Date");
        jPanel1.add(jLabel4);

        dateField.setText("jTextField4");
        jPanel1.add(dateField);

        jLabel5.setText("Level");
        jPanel1.add(jLabel5);

        levelField.setText("jTextField5");
        jPanel1.add(levelField);

        jLabel6.setText("Team Information");
        jPanel1.add(jLabel6);

        teamField.setText("jTextField6");
        jPanel1.add(teamField);

        jLabel7.setText("Position");
        jPanel1.add(jLabel7);

        positionField.setText("jTextField7");
        positionField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                positionFieldActionPerformed(evt);
            }
        });
        jPanel1.add(positionField);

        jLabel8.setText("Contact Number");
        jPanel1.add(jLabel8);

        contactField.setText("jTextField8");
        jPanel1.add(contactField);

        jLabel9.setText("Email");
        jPanel1.add(jLabel9);

        emailField.setText("jTextField9");
        jPanel1.add(emailField);

        jLabel10.setText("Photo");
        jPanel1.add(jLabel10);

        photoField.setText("jTextField10");
        jPanel1.add(photoField);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Operations"));
        jPanel3.setLayout(new java.awt.GridLayout(1, 4, 10, 0));

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });
        jPanel3.add(submitButton);

        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        jPanel3.add(updateButton);

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        jPanel3.add(deleteButton);

        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });
        jPanel3.add(resetButton);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Employee's Details"));

        employeeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        employeeTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                employeeTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(employeeTable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(617, 916));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed

    private void positionFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_positionFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_positionFieldActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void resetAction() {
        // TODO add your handling code here:
        nameField.setText("");
        ageField.setText("");
        genderField.setText("");
        dateField.setText("");
        levelField.setText("");
        teamField.setText("");
        positionField.setText("");
        contactField.setText("");
        emailField.setText("");
        photoField.setText("");
    }

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        // TODO add your handling code here:
        nameField.setText("");
        ageField.setText("");
        genderField.setText("");
        dateField.setText("");
        levelField.setText("");
        teamField.setText("");
        positionField.setText("");
        contactField.setText("");
        emailField.setText("");
        photoField.setText("");
    }//GEN-LAST:event_resetButtonActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
        emp.add(new Employee(id++, nameField.getText(), Integer.parseInt(ageField.getText()), genderField.getText(),
                dateField.getText(), levelField.getText(), teamField.getText(),
                positionField.getText(), new Contact_Info(contactField.getText(), emailField.getText())));
        JOptionPane.showMessageDialog(this, "Record submitted");
        resetButtonActionPerformed(evt);
        setEmployeeTable();
    }//GEN-LAST:event_submitButtonActionPerformed


    private void employeeTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employeeTableMouseClicked
        // TODO add your handling code here:
        personId = Integer.parseInt(employeeTable.getValueAt(employeeTable.getSelectedRow(), NORMAL).toString());
        Employee obj = null;
        for (Employee e : emp) {
            if (e.getEmployeeID() == personId) {
                obj = e;
            }
        }
        nameField.setText(obj.getName());
        ageField.setText(obj.getAge() + "");
        genderField.setText(obj.getGender());
        dateField.setText(obj.getStart_date() + "");
        levelField.setText(obj.getLevel());
        teamField.setText(obj.getTeam_info());
        positionField.setText(obj.getPosition_title());
        contactField.setText(obj.getContact_Info().getCellphone_number());
        emailField.setText(obj.getContact_Info().getEmail());

    }//GEN-LAST:event_employeeTableMouseClicked

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        Employee employee = null;
        int counter = 0;
        if (personId != 0) {
            // add validation, one of the field must be changed, only then update
            for (Employee obj : emp) {
                if (obj.getEmployeeID() == personId) {
                    obj.setEmployeeID(personId);
                    obj.setName(nameField.getText());
                    obj.setAge(Integer.parseInt(ageField.getText()));
                    obj.setGender(genderField.getText());
                    obj.setStart_date(nameField.getText());
                    obj.setLevel(levelField.getText());
                    obj.setTeam_info(teamField.getText());
                    obj.setPosition_title(positionField.getText());
                    obj.getContact_Info().setCellphone_number(contactField.getText());
                    obj.getContact_Info().setEmail(emailField.getText());
                    employee = obj;
                    break;
                }//if
                counter++;
            }//for
            emp.remove(counter);
            emp.add(employee);

        }//if
        JOptionPane.showMessageDialog(this, "Record Updated");
        setEmployeeTable();
        resetAction();
        personId = 0;
    }//GEN-LAST:event_updateButtonActionPerformed
    //used for sorting elements by id 
    class SortById implements Comparator<Employee> {
// Used for sorting in ascending order of ID  

        public int compare(Employee a, Employee b) {
            return a.getEmployeeID() - b.getEmployeeID();
        }
    }

    private void setEmployeeTable() {
        int rIndex = 0;
        //DateTimeFormatter dateFormatter3 = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        String[][] data = new String[emp.size()][10];
        Collections.sort(emp, new SortById());
        for (Employee e : emp) {
            //data[rIndex][0]=String.valueOf(e.getEmployeeID());
            data[rIndex][0] = e.getEmployeeID() + "";
            data[rIndex][1] = e.getName();
            data[rIndex][2] = String.valueOf(e.getAge());
            data[rIndex][3] = e.getGender();
            data[rIndex][4] = e.getStart_date();
            data[rIndex][5] = e.getLevel();
            data[rIndex][6] = e.getTeam_info();
            data[rIndex][7] = e.getPosition_title();
            data[rIndex][8] = e.getContact_Info().getCellphone_number();
            data[rIndex][9] = e.getContact_Info().getEmail();
            rIndex++;
        }

        String[] col = {"ID", "Name", "Age", "Gender", "Start Date", "Level", "Team Information",
            "Position", "Contact Number", "Email"};

        DefaultTableModel model = new DefaultTableModel(data, col);
        employeeTable.setModel(model);
    }

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        if (personId != 0) {
            for (Employee obj : emp) {
                if (obj.getEmployeeID() == personId) {
                    emp.remove(obj);
                    break;
                }
            }
        }
        JOptionPane.showMessageDialog(this, "Deleted");
        resetAction();
        setEmployeeTable();
        personId = 0;
    }//GEN-LAST:event_deleteButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ageField;
    private javax.swing.JTextField contactField;
    private javax.swing.JTextField dateField;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextField emailField;
    private javax.swing.JTable employeeTable;
    private javax.swing.JTextField genderField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField levelField;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField photoField;
    private javax.swing.JTextField positionField;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton submitButton;
    private javax.swing.JTextField teamField;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}

