package solution;

public class RobotMain {
    public static void main(String[] args) {
        Robot robot = new Robot();
        moveRobot(robot,3,0);
    }

    private static void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() < toX) {
            while(robot.getDirection()!=Direction.RIGHT)robot.turnRight();
            while(robot.getX()<toX)robot.stepForward();
           // robot.setDirection(Direction.UP);
        }

        if (robot.getX() > toX) {
            while(robot.getDirection()!=Direction.LEFT)robot.turnLeft();
            while(robot.getX()>toX)robot.stepForward();
           // robot.setDirection(Direction.UP);
        }

        if (robot.getY() < toY) {
            while(robot.getDirection()!=Direction.UP)robot.turnRight();
            while(robot.getY()<toY)robot.stepForward();
            //robot.setDirection(Direction.UP);
        }

        if (robot.getY() > toY) {
            while(robot.getDirection()!=Direction.DOWN)robot.turnLeft();
            while(robot.getY()>toY)robot.stepForward();
           // robot.setDirection(Direction.UP);
        }

    }
}
