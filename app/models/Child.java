package models;

import play.data.validation.URL;
import play.data.validation.Required;
import play.db.jpa.Model;

import javax.persistence.Entity;

@Entity
public class Child extends Model {
    public String name;

    public Child(){}
    public Child(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return url;
    }

    @Required
    @URL
    public String url;

    public boolean isPrimary;
}
