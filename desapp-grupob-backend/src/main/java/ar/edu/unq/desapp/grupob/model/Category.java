package ar.edu.unq.desapp.grupob.model;

import java.util.ArrayList;
import java.util.List;

public class Category extends Entity{
    
    private static final long serialVersionUID = 2413240818403136684L;
    /**
     * Instances
     */
    private String name;
    private List<SubCategory> subcategories;


    /**
     * Constructor
     */
    public Category(){}
    
    public Category (String name) {
        this.setName(name);
        this.setSubcategories(new ArrayList<SubCategory>());
    }
    
    public Category (String name, List<SubCategory> subcategories) {
        this.setName(name);
        this.setSubcategories(subcategories);
    }

    /**
     * Gets & Sets
     */
    public String getName() {
        return name;
    }

    public List<SubCategory> getSubcategories() {
        return subcategories;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setSubcategories(List<SubCategory> subcategories) {
        this.subcategories = subcategories;
    }

    /**
     * Methods
     */
    public void createSubCategory (SubCategory sub) {
        this.getSubcategories().add(sub);
    }
    
    public void modifySubcategory (SubCategory subOrigin, SubCategory subMod) {
        this.getSubcategories().remove(subOrigin);
        this.getSubcategories().add(subMod);
    }
    
    public void deleteSubcategory (SubCategory sub){
        this.getSubcategories().remove(sub);
    }
    
    
}
