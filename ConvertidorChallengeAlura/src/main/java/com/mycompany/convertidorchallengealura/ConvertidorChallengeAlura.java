/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.convertidorchallengealura;

import javax.swing.JOptionPane;

/**
 *
 * @author Carlos Alberto
 */
public class ConvertidorChallengeAlura extends javax.swing.JFrame {

    /**
     * Creates new form Conversor
     */
    public ConvertidorChallengeAlura() {
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

        lblTitulo = new javax.swing.JLabel();
        btnConvesorMoneda = new javax.swing.JButton();
        btnConversorTemperatura = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 204));

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Conversor");

        btnConvesorMoneda.setBackground(new java.awt.Color(0, 153, 204));
        btnConvesorMoneda.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnConvesorMoneda.setForeground(new java.awt.Color(255, 255, 255));
        btnConvesorMoneda.setText("Moneda");
        btnConvesorMoneda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvesorMonedaActionPerformed(evt);
            }
        });

        btnConversorTemperatura.setBackground(new java.awt.Color(0, 153, 204));
        btnConversorTemperatura.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnConversorTemperatura.setForeground(new java.awt.Color(255, 255, 255));
        btnConversorTemperatura.setText("Temperatura");
        btnConversorTemperatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConversorTemperaturaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnConvesorMoneda, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnConversorTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnConvesorMoneda, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(btnConversorTemperatura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnConvesorMonedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvesorMonedaActionPerformed
        System.out.println("Click Conversor de Moneda");
        convertidorMoneda();
    }//GEN-LAST:event_btnConvesorMonedaActionPerformed

    private void btnConversorTemperaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConversorTemperaturaActionPerformed
        // TODO add your handling code here:
        System.out.println("Click Conversor de Temperatura");
        convertidorTemperatura();
    }//GEN-LAST:event_btnConversorTemperaturaActionPerformed

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
            java.util.logging.Logger.getLogger(ConvertidorChallengeAlura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConvertidorChallengeAlura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConvertidorChallengeAlura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConvertidorChallengeAlura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConvertidorChallengeAlura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConversorTemperatura;
    private javax.swing.JButton btnConvesorMoneda;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables

    private void convertidorMoneda(){
        // TODO add your handling code here:
        
        
        
        String[] opciones = {"De Soles a Dólares", "De Soles a Euros", "De Soles a Libras esterlinas", "De Soles a Yenes japonés","De Soles a Wones sul-coreano",
            "De Dólares a Soles","De Euros a Soles","De Libras esterlinas a Soles","De Yenes japonés a Soles","De Wones sul-coreano a Soles"};
        //JOptionPane de seleccionar moneda y monto a convetir
        String monedasSeleccionadas = (String) JOptionPane.showInputDialog(null, "Selecciona una moneda",
                "Conversor de Divisas Perú", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
        if(monedasSeleccionadas != null){
            
                String valorAConvertirStr = JOptionPane.showInputDialog(null, "Ingresa el valor a convertir",
                    "Conversor de Divisas", JOptionPane.QUESTION_MESSAGE);
                
                //Convirtiendo valores de string.
                double valorAConvertir = 0;
                try{
                    valorAConvertir = Double.parseDouble(valorAConvertirStr);
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, "Valor no valido");
                }
                //Proceso de calculo de resultado
                double resultado = 0;
                String monedaIncioMensaje = "Soles Peruanos";
                String monedaFinalMensaje = "Soles Peruanos";
                switch (monedasSeleccionadas) {
                    case "De Soles a Dólares" -> {
                        monedaFinalMensaje = "Dolares";
                        resultado = valorAConvertir * 0.27;
                    }
                    case "De Soles a Euros" -> {
                        monedaFinalMensaje = "Euros";
                        resultado = valorAConvertir * 0.25;
                    }
                    case "De Soles a Libras esterlinas" -> {
                        monedaFinalMensaje = "Libras esterlinas";
                        resultado = valorAConvertir * 0.22;
                    }
                    case "De Soles a Yenes japonés" -> {
                        monedaFinalMensaje = "Yenes japonés";
                        resultado = valorAConvertir * 37.98;
                    }
                    case "De Soles a Wones sul-coreano" -> {
                        monedaFinalMensaje = "Wones sul-coreano";
                        resultado = valorAConvertir * 354.69;
                    }
                    case "De Dólares a Soles" -> {
                        monedaIncioMensaje = "Dolares";
                        resultado = valorAConvertir * 3.67;
                    }
                    case "De Euros a Soles" -> {
                        monedaIncioMensaje = "Euros";
                        resultado = valorAConvertir * 3.96;
                    }
                    case "De Libras esterlinas a Soles" -> {
                        monedaIncioMensaje= "Libras esterlinas";
                        resultado = valorAConvertir * 4.60;
                    }
                    case "De Yenes japonés a Soles" -> {
                        monedaIncioMensaje = "Yenes japonés";
                        resultado = valorAConvertir * 0.026;
                    }
                    case "De Wones sul-coreano a Soles" -> {
                        monedaIncioMensaje = "Wones sul-coreano";
                        resultado = valorAConvertir * 0.0028;
                    }
                    default -> JOptionPane.showMessageDialog(null, "Aaaaa...... Error esto es malo y raro para mi");
                }

                JOptionPane.showMessageDialog(null, valorAConvertir +" "+monedaIncioMensaje+" equivale a "+resultado+" "+monedaFinalMensaje);
                
                int opcion = JOptionPane.showConfirmDialog(null, "¿Quieres continuar con el Programa?", "Confirmar", JOptionPane.YES_NO_OPTION);

                if (opcion == JOptionPane.YES_OPTION) {
                    // Aquí puedes agregar el código que se ejecutará si el usuario elige continuar.
                    System.out.println("Continuando");
                } else {
                    JOptionPane.showMessageDialog(null, "Programa finalizado");
                    System.exit(0);
                }
        }
    }
    
    private void convertidorTemperatura(){
        String[] opciones = { "Celsius a Fahrenheit", "Fahrenheit a Celsius", "Celsius a Kelvin",
                "Kelvin a Celsius", "Fahrenheit a Kelvin", "Kelvin a Fahrenheit" };

        String opcionSeleccionada = (String) JOptionPane.showInputDialog(null, "Elige la opción de conversión:",
                "Convertidor de Temperatura", JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);
        if(opcionSeleccionada != null){
            
            double temperatura, resultado;

            switch (opcionSeleccionada) {
                case "Celsius a Fahrenheit":
                    temperatura = obtenerTemperatura("Ingresa la temperatura en Celsius:");
                    resultado = celsiusToFahrenheit(temperatura);
                    mostrarResultado("La temperatura en Fahrenheit es: " + resultado);
                    break;
                case "Fahrenheit a Celsius":
                    temperatura = obtenerTemperatura("Ingresa la temperatura en Fahrenheit:");
                    resultado = fahrenheitToCelsius(temperatura);
                    mostrarResultado("La temperatura en Celsius es: " + resultado);
                    break;
                case "Celsius a Kelvin":
                    temperatura = obtenerTemperatura("Ingresa la temperatura en Celsius:");
                    resultado = celsiusToKelvin(temperatura);
                    mostrarResultado("La temperatura en Kelvin es: " + resultado);
                    break;
                case "Kelvin a Celsius":
                    temperatura = obtenerTemperatura("Ingresa la temperatura en Kelvin:");
                    resultado = kelvinToCelsius(temperatura);
                    mostrarResultado("La temperatura en Celsius es: " + resultado);
                    break;
                case "Fahrenheit a Kelvin":
                    temperatura = obtenerTemperatura("Ingresa la temperatura en Fahrenheit:");
                    resultado = fahrenheitToKelvin(temperatura);
                    mostrarResultado("La temperatura en Kelvin es: " + resultado);
                    break;
                case "Kelvin a Fahrenheit":
                    temperatura = obtenerTemperatura("Ingresa la temperatura en Kelvin:");
                    resultado = kelvinToFahrenheit(temperatura);
                    mostrarResultado("La temperatura en Fahrenheit es: " + resultado);
                    break;
            }
            int opcion = JOptionPane.showConfirmDialog(null, "¿Quieres continuar con el Programa?", "Confirmar", JOptionPane.YES_NO_OPTION);

                if (opcion == JOptionPane.YES_OPTION) {
                    // Aquí puedes agregar el código que se ejecutará si el usuario elige continuar.
                    System.out.println("Continuando");
                } else {
                    JOptionPane.showMessageDialog(null, "Programa finalizado");
                    System.exit(0);
                }
        }
    }
    public static double obtenerTemperatura(String mensaje) {
        double resultado = 0;
        boolean validando = true;
        while(validando){
            try{
                String input = JOptionPane.showInputDialog(null, mensaje);
                resultado = Double.parseDouble(input);
                validando = false;
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Valor no valido");
                int opcion = JOptionPane.showConfirmDialog(null, "¿Desea continuar", "Cerrar programa",
                JOptionPane.YES_NO_OPTION);

                if (opcion == JOptionPane.YES_OPTION) {
                    JOptionPane.showMessageDialog(null, "Continuando...");
                } else {
                    
                    JOptionPane.showMessageDialog(null, "Programa cerrado");
                    System.exit(0);
                }
            }
        }
        
        return resultado;
    }

    public static void mostrarResultado(String resultado) {
        JOptionPane.showMessageDialog(null, resultado);
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit + 459.67) * 5 / 9;
    }

    public static double kelvinToFahrenheit(double kelvin) {
        return (kelvin * 9 / 5) - 459.67;
    }
}
