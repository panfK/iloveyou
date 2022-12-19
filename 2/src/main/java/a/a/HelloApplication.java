package a.a;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloApplication {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField bitcoin;

    @FXML
    private double bt;

    @FXML
    private Button conv;

    @FXML
    private double dl;

    @FXML
    private TextField dollar;

    @FXML
    private double ef;

    @FXML
    private TextField efir;

    @FXML
    private double eu;

    @FXML
    private TextField euro;

    @FXML
    private double gl;

    @FXML
    private TextField gold;

    @FXML
    private double ru;

    @FXML
    private TextField rub;

    @FXML
    private double ua;

    @FXML
    private TextField uan;

    @FXML
    void initialize() {
        assert bitcoin != null : "fx:id=\"bitcoin\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert bt != null : "fx:id=\"bt\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert conv != null : "fx:id=\"conv\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert dl != null : "fx:id=\"dl\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert dollar != null : "fx:id=\"dollar\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert ef != null : "fx:id=\"ef\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert efir != null : "fx:id=\"efir\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert eu != null : "fx:id=\"eu\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert euro != null : "fx:id=\"euro\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert gl != null : "fx:id=\"gl\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert gold != null : "fx:id=\"gold\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert ru != null : "fx:id=\"ru\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert rub != null : "fx:id=\"rub\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert ua != null : "fx:id=\"ua\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert uan != null : "fx:id=\"uan\" was not injected: check your FXML file 'hello-view.fxml'.";

    }
    double u, e, r, efi, g, b, d, all;
    r = 1;
    e = 68,78;
    d = 66,52;
    u = 9,22;
    efi = 78922,16;
    b = 1115616,19;
    g = 3704,77;

    all= rub+(euro*e)+(dollar*d)+(uan*u)+(efir*efi)+(bitcoin*b)+(gold*g);

    public void setRu(Label ru) {
        this.ru = all;
    }

    public void setEu(Label eu) {
        this.eu = all/e;
    }

    public void setDl(Label dl) {
        this.dl = all/d;
    }

    public void setUa(Label ua) {
        this.ua = all/u;
    }

    public void setEf(Label ef) {
        this.ef = all/efi;
    }

    public void setBt(Label bt) {
        this.bt = all/b;
    }

    public void setGl(Label gl) {
        this.gl = all/g;
    }

}
