import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        TableView<Estudiante> table = new TableView<>();

        // Columnas
        TableColumn<Estudiante, Integer> colId = new TableColumn<>("ID");
        colId.setCellValueFactory(new PropertyValueFactory<>("id"));

        TableColumn<Estudiante, String> colNombre = new TableColumn<>("Nombre");
        colNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));

        TableColumn<Estudiante, Integer> colEdad = new TableColumn<>("Edad");
        colEdad.setCellValueFactory(new PropertyValueFactory<>("edad"));

        TableColumn<Estudiante, String> colCorreo = new TableColumn<>("Correo");
        colCorreo.setCellValueFactory(new PropertyValueFactory<>("correo"));

        table.getColumns().addAll(colId, colNombre, colEdad, colCorreo);

        VBox vbox = new VBox(table);
        Scene scene = new Scene(vbox, 600, 400);

        stage.setScene(scene);
        stage.setTitle("Listado de Estudiantes");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
