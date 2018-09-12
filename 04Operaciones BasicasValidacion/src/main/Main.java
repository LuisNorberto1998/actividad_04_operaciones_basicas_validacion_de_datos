package main;

import models.ModelBasicOperations;
import views.ViewBasicOperations;
import controllers.ControllerBasicOperations;

//@author Norberto
public class Main {
    
    private static ModelBasicOperations modelBasicOperations;
    private static ViewBasicOperations viewBasicOperations;
    private static ControllerBasicOperations controllerBasicOperations;
    
    public static void main(String[] args) {
        modelBasicOperations = new ModelBasicOperations();
        viewBasicOperations = new ViewBasicOperations();
        controllerBasicOperations = new ControllerBasicOperations(modelBasicOperations, viewBasicOperations);
    }
    
}
