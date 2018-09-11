package sample.reflection;

/*
 * Author: glaschenko
 * Created: 06.09.2018
 */
public class Hand {
    @JSONField(name = "id")
    private Integer number;
    @JSONField(name = "room")
    private String site;
    @JSONField(name = "limit")
    private Integer stake;

    public Hand(Integer number, String site, Integer stake) {

        this.number = number;
        this.site = site;
        this.stake = stake;
    }
}
