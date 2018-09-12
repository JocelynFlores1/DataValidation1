package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.ModelOperacionesBasicas;
import views.ViewOperacionesBasicas;
import extras.DataValidation;

/**
 *
 * @author Jocelyn
 */
public class ControllerOperacionesBasicas implements ActionListener {

    ModelOperacionesBasicas modelOperacionesBasicas;
    ViewOperacionesBasicas viewOperacionesBasicas;
    DataValidation dataValidation = new DataValidation();
    
    public ControllerOperacionesBasicas(ModelOperacionesBasicas modelOperacionesBasicas, ViewOperacionesBasicas viewOperacionesBasicas) {
        this.modelOperacionesBasicas = modelOperacionesBasicas;
        this.viewOperacionesBasicas = viewOperacionesBasicas;
        this.viewOperacionesBasicas.jb_suma.addActionListener(this);
        this.viewOperacionesBasicas.jb_resta.addActionListener(this);
        this.viewOperacionesBasicas.jb_multiplicacion.addActionListener(this);
        this.viewOperacionesBasicas.jb_division.addActionListener(this);
        this.viewOperacionesBasicas.jb_modulo.addActionListener(this);
    }

    public ControllerOperacionesBasicas() {
        
    }
   
    @Override
    public void actionPerformed(ActionEvent e){
        modelOperacionesBasicas.setNumero1(dataValidation.string2Int(viewOperacionesBasicas.jtf_numero1.getText()));
        modelOperacionesBasicas.setNumero1(dataValidation.string2Float(viewOperacionesBasicas.jtf_numero1.getText()));
        modelOperacionesBasicas.setNumero1((float) dataValidation.string2Double(viewOperacionesBasicas.jtf_numero1.getText()));
        modelOperacionesBasicas.setNumero2(dataValidation.string2Int(viewOperacionesBasicas.jtf_numero2.getText()));
        modelOperacionesBasicas.setNumero2(dataValidation.string2Float(viewOperacionesBasicas.jtf_numero2.getText()));
        modelOperacionesBasicas.setNumero2((float) dataValidation.string2Double(viewOperacionesBasicas.jtf_numero2.getText()));
        if (e.getSource()==viewOperacionesBasicas.jb_suma) {
            modelOperacionesBasicas.suma ();
        }
        if (e.getSource()==viewOperacionesBasicas.jb_resta) {
            modelOperacionesBasicas.resta ();
        }
        if (e.getSource()==viewOperacionesBasicas.jb_multiplicacion) {
            modelOperacionesBasicas.multiplicacion ();
        }
        if (e.getSource()==viewOperacionesBasicas.jb_division) {
            modelOperacionesBasicas.division ();
        }
        if (e.getSource()==viewOperacionesBasicas.jb_modulo) {
            modelOperacionesBasicas.modulo ();
        }
        viewOperacionesBasicas.jl_resultado.setText(String.valueOf(modelOperacionesBasicas.getResultado()));
        
    }
}
