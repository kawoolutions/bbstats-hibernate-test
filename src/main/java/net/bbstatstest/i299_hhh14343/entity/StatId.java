package net.bbstatstest.i299_hhh14343.entity;

import java.io.Serializable;

public class StatId implements Serializable
{
    private static final long serialVersionUID = 1L;

    private Integer period;

    private PlayerStatId playerStat;

    public StatId()
    {
    }

    public Integer getPeriod()
    {
        return period;
    }

    public void setPeriod(Integer period)
    {
        this.period = period;
    }

    public PlayerStatId getPlayerStat()
    {
        return playerStat;
    }

    public void setPlayerStat(PlayerStatId playerStat)
    {
        this.playerStat = playerStat;
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ( (period == null) ? 0 : period.hashCode() );
        result = prime * result + ( (playerStat == null) ? 0 : playerStat.hashCode() );
        return result;
    }

    @Override
    public boolean equals(Object obj)
    {
        if ( this == obj )
            return true;
        if ( obj == null )
            return false;
        if ( getClass() != obj.getClass() )
            return false;
        StatId other = ( StatId ) obj;
        if ( period == null )
        {
            if ( other.period != null )
                return false;
        }
        else if ( !period.equals( other.period ) )
            return false;
        if ( playerStat == null )
        {
            if ( other.playerStat != null )
                return false;
        }
        else if ( !playerStat.equals( other.playerStat ) )
            return false;
        return true;
    }
}
