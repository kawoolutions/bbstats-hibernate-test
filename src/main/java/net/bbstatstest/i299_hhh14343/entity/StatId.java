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
}
