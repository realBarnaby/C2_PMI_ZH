import static java.lang.System.out;

public class Team {

    //attributes
    private String name;
    public String position;

    //main
    public static void main(String[] args) {
        Team thisOne = new Team();
        thisOne.newMember("Gerd", "infantry");
        Team thatThere = new Team();
        thatThere.newMember("George", "arbalist");
        thatThere.leaveTeam();


        //getMembers method
        public void getMembers() {
            out.printf("data of 1. member: %s %s", thisOne.getName(), thisOne.getPosition());
            out.printf("data of 2. member: %s %s", thatThere.getName(), thatThere.getPosition());
        }
    }


    //methods
    //newMember method
    public void newMember(String name, String position) {
        out.print("a new member joined the team");
        this.name = name;
        this.position = position;
    }

    public String getName() { return name; }
    public String getPosition() { return position; }

    //leaveTeam method
    public void leaveTeam() {
        out.print("a member left the team");
        this.name = null;
        this.position = null;
    }

}
