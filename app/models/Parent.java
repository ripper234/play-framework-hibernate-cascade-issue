package models;

import play.data.validation.Required;
import play.db.jpa.Model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * An websiteConfig is created out of a certain code + config version and never changes (it can be invalidated/deleted).
 */
@Entity
public class Parent extends Model {
    public Parent() {
    }

    public Parent(Child child) {
        this.child = child;
    }

    @JoinColumn(name = "website_id")
    @ManyToOne
    @Required
    public Child child;

    public String name;
}
