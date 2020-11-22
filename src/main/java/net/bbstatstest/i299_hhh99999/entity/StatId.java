package net.bbstatstest.i299_hhh99999.entity;

import java.io.Serializable;

public class StatId implements Serializable
{
    private static final long serialVersionUID = 1L;

    private PlayerStatId playerStat;

    public StatId()
    {
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
