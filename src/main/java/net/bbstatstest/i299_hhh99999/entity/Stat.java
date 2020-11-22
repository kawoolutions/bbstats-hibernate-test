package net.bbstatstest.i299_hhh99999.entity;

import java.io.Serializable;

import javax.persistence.Basic;
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

    @Basic(optional = false)
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

    public Integer getGameId()
    {
        return playerStat.getGameId();
    }

    public void setGameId(Integer gameId)
    {
        playerStat.setGameId(gameId);
    }

    public Boolean getHome()
    {
        return playerStat.getHome();
    }

    public void setHome(Boolean home)
    {
        playerStat.setHome(home);
    }

    public Integer getPlayerId()
    {
        return playerStat.getPlayerId();
    }

    public void setPlayerId(Integer playerId)
    {
        playerStat.setPlayerId(playerId);
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
