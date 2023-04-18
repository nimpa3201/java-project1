module com.likelion.javaproject1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.likelion.javaproject1 to javafx.fxml;
    exports com.likelion.javaproject1;
}