module com.iam2kabhishek.cakebake {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.iam2kabhishek.cakebake to javafx.fxml;
    exports com.iam2kabhishek.cakebake;
}
