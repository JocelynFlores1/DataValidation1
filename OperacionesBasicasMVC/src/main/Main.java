
package main;
import controllers.ControllerOperacionesBasicas;
import models.ModelOperacionesBasicas;
import views.ViewOperacionesBasicas;
public class Main {

    public static void main(String[] args) {
       ModelOperacionesBasicas modelOperacionesBasicas = new ModelOperacionesBasicas();
       ViewOperacionesBasicas viewOperacionesBasicas = new ViewOperacionesBasicas();
       ControllerOperacionesBasicas controllerOperacionesBasicas = new ControllerOperacionesBasicas();
       viewOperacionesBasicas.setVisible(true);
    }
    
}
