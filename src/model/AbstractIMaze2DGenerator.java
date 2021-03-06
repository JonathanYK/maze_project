package model;

public abstract class AbstractIMaze2DGenerator implements IMaze2dGenerator {

    // Measuring generating algorithm execution time, returning millis as String
    public String measureAlgorithmTime(int mazeSize) throws MazeSizeException {
        String retStr;

        if (mazeSize < 3) {
            throw new MazeSizeException("Maze size has to be bigger then 2");
        }
        long startMeasuringTime = System.currentTimeMillis();
        generate(mazeSize);
        long finishMeasuringTime = System.currentTimeMillis();

        long totalMilis = finishMeasuringTime - startMeasuringTime;
        long seconds = (totalMilis / 1000) % 60;
        retStr = "\n{" + this.getClass().getSimpleName() + "}" + ": executing took: " + seconds + ". " +
                String.format("%04d", totalMilis) + " seconds.\n";

        return retStr;
    }
}

