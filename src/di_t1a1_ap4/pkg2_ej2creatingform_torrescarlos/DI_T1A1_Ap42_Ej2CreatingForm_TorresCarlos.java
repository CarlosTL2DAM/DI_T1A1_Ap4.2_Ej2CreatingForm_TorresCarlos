/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package di_t1a1_ap4.pkg2_ej2creatingform_torrescarlos;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author usuario
 */
public class DI_T1A1_Ap42_Ej2CreatingForm_TorresCarlos extends Application {

    @Override
    public void start(Stage primaryStage) {
        //Parte 1
        //Introducimos un título a la ventana emergente
        primaryStage.setTitle("JavaFX Welcome");
        //Mostramos la ventana emergente
        primaryStage.show();

        
        //Parte 2.1 ...
        //Creamos un GridPane
        GridPane grid = new GridPane();
        //Alineamos el GridPane en el centro de la ventana
        grid.setAlignment(Pos.CENTER);
        //Ajustamos que los huecos horizontales sean de 10px
        grid.setHgap(10);
        //Ajustamos que los huecos verticales sean de 10px
        grid.setVgap(10);
        //Ajustamos que el tamaño de los huecos para la matriz sean de 25
        grid.setPadding(new Insets(25, 25, 25, 25));

        
        //Parte 3
        //Añadimos un titulo para la escena
        Text scenetitle = new Text("Welcome");
        //Seleccionamos la familia, el tamaño y el peso de la fuente
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        //Añadimos el lugar donde se encuentra dentro del grid, y que ocupa 2 columnas y 1 fila
        grid.add(scenetitle, 0, 0, 2, 1);

        //Creamos el primer label y añadimos su texto
        Label userName = new Label("User Name: ");
        //Añadimos la etiqueta en el grid, en la posición Columna 0 Fila 1
        grid.add(userName, 0, 1);

        //Añadimos un campo de texto
        TextField userTextField = new TextField();
        //Incluimos el campo de texto en la posición Columna 1 Fila 1
        grid.add(userTextField, 1, 1);

        //Incluimos una segunda etiqueta
        Label pw = new Label("Password: ");
        //Añadimos la etiqueta en la posicónn Columna 0 Fila 2
        grid.add(pw, 0, 2);

        //Añadimos un campo para añadir una contraseña
        PasswordField pwBox = new PasswordField();
        //Incluimos el campo de contraseña en el grid en la posición Columna 1 Fila 2
        grid.add(pwBox, 1, 2);

        
        //Parte 4
        //Creamos el boton
        Button btn = new Button("Sing in");
        //Creamos  otro layout donde incluiremos el Boton con un espacio de 10px.
        HBox hbBtn = new HBox(10);
        //Alineamos el layout en la posición Abajo derecha
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        //Incluimos el botón dentro del HBox
        hbBtn.getChildren().add(btn);
        //Incluimos el HBox dentro del GridPane
        grid.add(hbBtn, 1, 4);

        
        //Parte 5
        //Muestra un texto al final en principio vacio
        final Text actiontarget = new Text();
        //Lo almacena en la posición Columna 1 Fila 6
        grid.add(actiontarget, 1, 6);

        //El método Set On Action permite regitrar un evento controlador, en este caso Evento de accion
        //El evento de accion es un evento en relación a que se realiza una acción, en este caso dar clic al botón
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            //Método manejador del evento de acción
            public void handle(ActionEvent e) {
                //Añade el color FIREBRICK al texto de actiontarget
                actiontarget.setFill(Color.FIREBRICK);
                //Introduce el mensaje tras haber pulsado el boton en el texto actiontarget
                actiontarget.setText("Sign in button pressed");
            }
        });

        
        //...Parte 2.2
        //Creamos la escena, incluyendo el Layout Grid que hemos creado
        Scene scene = new Scene(grid, 300, 275);
        //Incluimos la escena dentro de la Stage
        primaryStage.setScene(scene);

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
