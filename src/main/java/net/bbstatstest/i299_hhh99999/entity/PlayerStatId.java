package net.bbstatstest.i299_hhh99999.entity;

import java.io.Serializable;

public class PlayerStatId implements Serializable
{
    private static final long serialVersionUID = 1L;

    private Integer playerId;

    private ScoreId score;

    public PlayerStatId()
    {
    }

    public Integer getPlayerId()
    {
        return playerId;
    }

    public void setPlayerId(Integer playerId)
    {
        this.playerId = playerId;
    }

    public ScoreId getScore()
    {
        return score;
    }

    public void setScore(ScoreId score)
    {
        this.score = score;
    }
}
