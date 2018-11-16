/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uttt.edu.controller.dispatcher;

import javax.swing.JOptionPane;
import mx.uttt.edu.front.controller.view.ProductosView;
import mx.uttt.edu.front.controller.view.VentaView;

/**
 *
 * @author karlo
 */
public class Dispatcher {

    private ProductosView produt;
    private VentaView venta;

    public Dispatcher() {
        produt = new ProductosView();
        venta = new VentaView();
    }

    public void dispatch(String request) {
        try {
            if (request.equalsIgnoreCase("Producto")) {

                produt.show();
            } else if (request.equalsIgnoreCase("venta"));
            {
                venta.show();
            }
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "La opcion escogida no existe ", "Error", 0);
        }
    }

}
