package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;

public class Controller implements Initializable
{
    private static final String TAG = "Controller";
    @FXML
    public TableColumn<Task,String > nameColumn;
    @FXML
    public TableColumn<Task,Date> dateColumn;
    @FXML
    public TableColumn<Task,String> timeColumn;
    @FXML
    public TableView tableTask;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ObservableList<Task> tasks = FXCollections.observableArrayList();
        tasks.add(new Task("Task1",new Date(1999,5,5),"15:55",23));
        tasks.add(new Task("Task2",new Date(2000,6,6),"17:55",55));
        System.out.println("we got here?");
        tableTask.setItems(tasks);
        tableTask.getColumns().addAll(nameColumn,dateColumn,timeColumn);

    }
}
