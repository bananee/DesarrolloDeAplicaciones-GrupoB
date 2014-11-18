package ar.edu.unq.desapp.grupob.dao;

import java.util.List;

import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

import ar.edu.unq.desapp.grupob.model.BankAccount;

public class BankAccountDAO extends HibernateGenericDAO<BankAccount> implements
        GenericDAO<BankAccount> {

    private static final long serialVersionUID = 7723773699720888349L;

    @Override
    public List<BankAccount> filterByName(String name) {
        @SuppressWarnings("unchecked")
        List<BankAccount> bankAccounts = this.getSession().createCriteria(BankAccount.class)
                .add(Restrictions.ilike("name", name, MatchMode.ANYWHERE))
                .list();
        return bankAccounts;
    }

    @Override
    protected Class<BankAccount> getDomainClass() {
        return BankAccount.class;
    }

    @Override
    public BankAccount findByName(String name) {
        // TODO Auto-generated method stub
        return null;
    }

}
