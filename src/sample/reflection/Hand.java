package sample.reflection;

/*
 * Author: glaschenko
 * Created: 06.09.2018
 */
public class Hand {
    @JSONField(name = "n")
    Integer number;
    @JSONField(name = "s")
    String site;

    Integer stake;

    public Hand(Integer number, String site, Integer stake) {

        this.number = number;
        this.site = site;
        this.stake = stake;
    }
}
