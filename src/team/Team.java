package team;

import course.Course;

import java.util.*;
import java.util.stream.Collectors;


public class Team {
    TreeMap<Integer, Member> team;
    Set<Integer> passedIDs;

    public Team() {
        team = new TreeMap<>();
    }

    public void add(Member ... member){
        for (Member m: member) {
            team.put(m.getId(), m);
        }
    }

    public void doIt(Course course) {
        passedIDs = team.keySet();
        OptionalInt maxBarrierHeight = Arrays.stream(course.getHeightsOfBarriers()).max();
        if(maxBarrierHeight.isPresent()) {
            int maxHeight = maxBarrierHeight.getAsInt();
            passedIDs = passedIDs.stream().filter(id -> isPassed(id, maxHeight)).collect(Collectors.toSet());
        }
    }

    private boolean isPassed(int id, int height) {
        return team.get(id).getMaxBarrierHeight() >= height;
    }

    public void showResult() {
        System.out.println("Прошли:");
        for (Integer id: passedIDs) {
            System.out.println(team.get(id));
        }
    }


}
