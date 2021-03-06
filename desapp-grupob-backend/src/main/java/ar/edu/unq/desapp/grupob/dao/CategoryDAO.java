package ar.edu.unq.desapp.grupob.dao;

import java.util.List;

import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

import ar.edu.unq.desapp.grupob.model.Category;

public class CategoryDAO extends HibernateGenericDAO<Category> implements
        GenericDAO<Category> {

    private static final long serialVersionUID = 939209274312970536L;

    @Override
    protected Class<Category> getDomainClass() {
        return Category.class;
    }

    @SuppressWarnings("unchecked")
    public List<Category> filterByName(String name) {
        List<Category> categories = this.getSession().createCriteria(getDomainClass())
                .add(Restrictions.ilike("name", name, MatchMode.ANYWHERE))
                .list();
        return categories;

    }

    @Override
    public Category findByName(String name) {
        Category category = (Category) this.getSession().createCriteria(getDomainClass())
                .add(Restrictions.ilike("name", name, MatchMode.EXACT)).uniqueResult();
        return category;
    }
}
