package net.bbstatstest.i299_hhh14343;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import net.bbstatstest.i299_hhh14343.entity.PlayerStatId;
import net.bbstatstest.i299_hhh14343.entity.ScoreId;
import net.bbstatstest.i299_hhh14343.entity.Stat;
import net.bbstatstest.i299_hhh14343.entity.StatId;

@Named
@ViewScoped
public class NestedIdClassesView implements Serializable
{
    private static final long serialVersionUID = 1L;
    
    @Inject
    private StatService statService;
    
    private Stat stat;
    
    @PostConstruct
    public void init()
    {
        ScoreId scoreId = new ScoreId();
        scoreId.setGameId( 32 );
        scoreId.setHome( Boolean.TRUE );
        
        PlayerStatId playerStatId = new PlayerStatId();
        playerStatId.setPlayerId( 1 );
        playerStatId.setScore( scoreId );
        
        StatId statId = new StatId();
        statId.setPlayerStat( playerStatId );
        statId.setPeriod( 4 );
        
        stat = statService.findByPk( statId );
    }

    public Stat getStat()
    {
        return stat;
    }

    public void setStat( Stat stat )
    {
        this.stat = stat;
    }
}