package course;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class Course {
    private int[] heightsOfBarriers;

    public Course(int ... heightsOfBarriers){
        this.heightsOfBarriers = heightsOfBarriers;
    }

    public int[] getHeightsOfBarriers() {
        return heightsOfBarriers.clone();
    }



}
