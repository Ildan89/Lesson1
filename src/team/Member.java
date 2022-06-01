package team;

public class Member {
    private static int memberCount = 0;

    private final int ID;

    private String name;
    private String surname;
    private int maxBarrierHeight;

    public Member(String name, String surname, int maxBarrierHeight) {
        this.ID = ++memberCount;
        this.name = name;
        this.surname = surname;
        this.maxBarrierHeight = maxBarrierHeight;
    }

    public int getId() {
        return ID;
    }

    public int getMaxBarrierHeight() {
        return maxBarrierHeight;
    }

    @Override
    public String toString() {
        return  "id = " + ID +
                ", name = '" + name + '\'' +
                ", surname = '" + surname + '\'';
    }


}
