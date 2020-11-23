package net.bbstatstest.i299_hhh14343;

import javax.annotation.PostConstruct;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import net.bbstatstest.i299_hhh14343.entity.Stat;
import net.bbstatstest.i299_hhh14343.entity.StatId;

@Stateless
@LocalBean
public class StatService
{
    @PersistenceContext
    private EntityManager em;
    
    @PostConstruct
    public void init()
    {
        // TODO Auto-generated constructor stub
    }
    
    public Stat findByPk( StatId statId )
    {
        return em.find( Stat.class, statId );
    }
}
