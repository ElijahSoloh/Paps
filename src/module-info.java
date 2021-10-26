module Paps {
	requires javafx.controls;
	requires javafx.fxml;
	requires java.desktop;
	requires javafx.graphics;
	requires javafx.base;
	requires java.xml;
	
	opens application to javafx.graphics, javafx.fxml;
}
