package Christmas;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Kid> kids;

    public School() {
        this.kids = new ArrayList<>();
    }

    public School(List<Kid> kids) {
        this.kids = kids;
        this.kids = new ArrayList<>();
    }

    public void enroll(Kid kid) {
        if (kid.getIsNice()) {
            kids.add(kid);
        }
    }

    public void startChristmasParty(Santa santa) {
            santa.giveAway(kids);
            int counter = 100 - santa.getNumberOfGifts();
        System.out.println("Santa has given away " + counter+ " gifts at the Christmas party");
        }



    public List<Kid> getSadYoungsters() {
        List<Kid> sadKids = new ArrayList<>();
        for (Kid kid : kids) {
            if(!kid.getIsHappy() && kid.getAge() < 10) {
                sadKids.add(kid);
            }
        }
        return sadKids;
    }
}
