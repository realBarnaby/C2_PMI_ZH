import static java.lang.System.out;

public class PositionChanges extends Team{

    public void promote(String position) {
        out.print("a position of a member has been changed");
        this.position = position;
    }

}
