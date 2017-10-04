package day5._7AntiAircraftAim;

public class Target {

    private int[][][] space;
    int targetX;
    int targetY;
    int targetZ;

    /**
     * The constructor receives the size of the space within which the hypothetical
     * aircraft flies in. The space is represented as a 3D array. All of the
     * elements are instantiated to 0 and after the space is built,
     * the init function places the aircraft at a random
     * location.
     * @param x         X size.
     * @param y         Y size.
     * @param z         Z size.
     */
    public Target (int x, int y, int z){
        space = new int[x][y][z];
        for(int i = 0; i < x; i++){
            for(int j = 0; j < y; j++){
                for(int k = 0; k < z; k++){
                    space[i][j][k] = 0;
                }
            }
        }
        init();
    }

    /**
     * The init function places the aircraft at a random location
     * within the 3D space.
     */
    private void init(){
        targetX = (int) Math.abs(space.length * Math.random());
        targetY = (int) Math.abs(space[0].length * Math.random());
        targetZ = (int) Math.abs(space[0][0].length * Math.random());

        space[targetX][targetY][targetZ] = 1;

        // - Used for debudding purposes to see where the Aircraft actually is.
        // System.out.println("The X is: " + targetX + " The Y is: " + targetY + " The Z is: " + targetZ);
    }

    /**
     * Receives the firing coordinates, and returns the result of the shot.
     * @param x         X coordinate of the shot.
     * @param y         Y coordinate of the shot.
     * @param z         Z coordinate of the shot.
     * @return          Any of the available values:
     *                  HIT, FAIL_LEFT, FAIL_RIGHT, FAIL_HIGH, FAIL_LOW, FAIL_SHORT, FAIL_LONG, OUT_OF_RANGE
     */
    public Shot fire(int x,int y,int z){
        if(x < 0 || x > space.length || y < 0 || y > space[0].length || z < 0 || z > space[0][0].length){
            return Shot.OUT_OF_RANGE;
        }

        return x < targetX ? Shot.FAIL_LEFT :
                x > targetX ? Shot.FAIL_RIGHT :
                y < targetY ? Shot.FAIL_LOW :
                y > targetY ? Shot.FAIL_HIGH :
                z < targetZ ? Shot.FAIL_SHORT :
                z > targetZ ? Shot.FAIL_LONG :
                Shot.HIT;
    }
}
