package net.bbstatstest.i251_hhh14276.entity;

import java.io.Serializable;

public class MyPlayerStatId implements Serializable
{
    private static final long serialVersionUID = 1L;

    private Integer playerId;

    private MyScoreId score;

    public MyPlayerStatId()
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

    public MyScoreId getMyScore()
    {
        return score;
    }

    public void setMyScore(MyScoreId score)
    {
        this.score = score;
    }
}
