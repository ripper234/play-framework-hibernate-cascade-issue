package controllers;

import models.Child;
import models.Parent;
import play.mvc.Controller;

public class Application extends Controller {

    public static void index() {
        render();
    }

    public static void save1() {
        Parent p = new Parent();
        p.name = "Dad";
        p.child = new Child();
        p.child.save();
        p.child.name = "Son";
        p.save();
        renderText("OK");
    }

    public static void update2() {
        Parent p = Parent.find("byName", "Dad").first();
        p.child.name = "Daughter";
        p.save();
        renderText("OK");
    }

    public static void clear() {
        Parent.deleteAll();
        Child.deleteAll();
        renderText("OK");
    }
}