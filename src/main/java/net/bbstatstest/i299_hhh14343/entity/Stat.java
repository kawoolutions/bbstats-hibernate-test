package net.bbstatstest.i299_hhh14343.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "\"Stats\"")
@IdClass(StatId.class)
public class Stat implements Serializable
{
    private static final long serialVersionUID = 1L;

    @Id
    @Column
    private Integer period;

    @Id
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "game_id", referencedColumnName = "game_id")
    @JoinColumn(name = "is_home", referencedColumnName = "is_home")
    @JoinColumn(name = "player_id", referencedColumnName = "player_id")
    private PlayerStat playerStat;

    public Stat()
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

    public PlayerStat getPlayerStat()
    {
        return playerStat;
    }

    public void setPlayerStat(PlayerStat playerStat)
    {
        this.playerStat = playerStat;
    }
}
