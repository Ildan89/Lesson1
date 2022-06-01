package team;

import course.Course;

import java.util.Set;
import java.util.TreeMap;
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
        for (int height: course.getHeightsOfBarriers()) {
            passedIDs = passedIDs.stream().filter(id -> team.get(id).getMaxBarrierHeight() >= height)
                    .collect(Collectors.toSet());
        }
    }

    public void showResult() {
        System.out.println("Прошли:");
        for (Integer id: passedIDs) {
            System.out.println(team.get(id));
        }
    }


}
