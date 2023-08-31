package assignment;

/**
 *
 * CS314H Programming Assignment 1 - Java image processing
 *
 * Included is the Invert effect from the assignment.  Use this as an
 * example when writing the rest of your transformations.  For
 * convenience, you should place all of your transformations in this file.
 *
 * You can compile everything that is needed with
 * javac -d bin src/assignment/*.java
 *
 * You can run the program with
 * java -cp bin assignment.JIP
 *
 * Please note that the above commands assume that you are in the prog1
 * directory.
 */

import java.util.ArrayList;

class Invert extends ImageEffect {
    public int[][] apply(int[][] pixels,
            ArrayList<ImageEffectParam> params) {
        int width = pixels[0].length;
        int height = pixels.length;

        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                pixels[y][x] = ~pixels[y][x];
            }
        }
        return pixels;
    }
}

class Dummy extends ImageEffect {

    public Dummy() {
        super();
        params = new ArrayList<ImageEffectParam>();
        params.add(new ImageEffectParam("ParamName",
                "Description of param.",
                10, 0, 1000));
    }

    public int[][] apply(int[][] pixels,
            ArrayList<ImageEffectParam> params) {
        // Use params here.
        return pixels;
    }
}

//iterates through pixels matrix with a double for-loop and sets each pixel's red value to 0
class NoRed extends ImageEffect {
    public int[][] apply(int[][] pixels,
            ArrayList<ImageEffectParam> params) {
        int width = pixels[0].length;
        int height = pixels.length;

        for (int x = 0; x < height; x++) {
            for (int y = 0; y < width; y++) {
                pixels[x][y] = makePixel(0, getGreen(pixels[x][y]), getBlue(pixels[x][y]));

            }
        }
        return pixels;
    }
}

//iterates through pixels matrix with a double for-loop and sets each pixel's green value to 0
class NoGreen extends ImageEffect {
    public int[][] apply(int[][] pixels,
            ArrayList<ImageEffectParam> params) {
        int width = pixels[0].length;
        int height = pixels.length;

        for (int x = 0; x < height; x++) {
            for (int y = 0; y < width; y++) {
                pixels[x][y] = makePixel(getRed(pixels[x][y]), 0, getBlue(pixels[x][y]));

            }
        }
        return pixels;
    }
}

//iterates through pixels matrix with a double for-loop and sets each pixel's blue value to 0
class NoBlue extends ImageEffect {
    public int[][] apply(int[][] pixels,
            ArrayList<ImageEffectParam> params) {
        int width = pixels[0].length;
        int height = pixels.length;

        for (int x = 0; x < height; x++) {
            for (int y = 0; y < width; y++) {
                pixels[x][y] = makePixel(getRed(pixels[x][y]), getGreen(pixels[x][y]), 0);

            }
        }
        return pixels;
    }
}

//iterates through pixels matrix with a double for-loop and sets each pixel's values aside from red to 0 (Green & Blue)
class RedOnly extends ImageEffect {
    public int[][] apply(int[][] pixels,
            ArrayList<ImageEffectParam> params) {
        int width = pixels[0].length;
        int height = pixels.length;

        for (int x = 0; x < height; x++) {
            for (int y = 0; y < width; y++) {
                pixels[x][y] = makePixel(getRed(pixels[x][y]), 0, 0);

            }
        }
        return pixels;
    }
}

//iterates through pixels matrix with a double for-loop and sets each pixel's values aside from green to 0 (red & blue)
class GreenOnly extends ImageEffect {
    public int[][] apply(int[][] pixels,
            ArrayList<ImageEffectParam> params) {
        int width = pixels[0].length;
        int height = pixels.length;

        for (int x = 0; x < height; x++) {
            for (int y = 0; y < width; y++) {
                pixels[x][y] = makePixel(0, getGreen(pixels[x][y]), 0);

            }
        }
        return pixels;
    }
}

//iterates through pixels matrix with a double for-loop and sets each pixel's values aside from blue to 0 (red & green)
class BlueOnly extends ImageEffect {
    public int[][] apply(int[][] pixels,
            ArrayList<ImageEffectParam> params) {
        int width = pixels[0].length;
        int height = pixels.length;

        for (int x = 0; x < height; x++) {
            for (int y = 0; y < width; y++) {
                pixels[x][y] = makePixel(0, 0, getBlue(pixels[x][y]));

            }
        }
        return pixels;
    }
}

 
    //iterates through the pixels matrix and finds the average value between the red, blue, and green values, and then assign them to RGB for each pixel
                 class BlackAndWhite extends ImageEffect {
    public int[][] apply(int[][] pixels,
            ArrayList<ImageEffectParam> params) {
        int width = pixels[0].length;
        int height = pixels.length;

        for (int x = 0; x < height; x++) {
            for (int y = 0; y < width; y++) {
                int val = pixels[x][y] + pixels[x][y] + pixels[x][y];
                pixels[x][y] = makePixel(val/3, val/3, val/3);

            }
        }
        return pixels;
    }
}

//initialized a copy matrix in which I assigned the values of the pixels matrix backwards, row by row with a double for loop
class VerticalReflect extends ImageEffect {
    public int[][] apply(int[][] pixels,
            ArrayList<ImageEffectParam> params) {
        int width = pixels[0].length;
        int height = pixels.length;
        int copy[][] = new int[height][width]; // initialized a new matrix to copy the "pixels" matrix values

        for (int x = 0; x < height; x++) {
            for (int y = 0; y < width; y++) {
                copy[x][y] = pixels[x][width - y - 1];
            }
        }
        pixels = copy;
        return pixels;
    }
}

//initialized a copy matrix in which I assigned the values of the pixels matrix backwards, row by row with a double for loop
class HorizontalReflect extends ImageEffect {
    public int[][] apply(int[][] pixels,
            ArrayList<ImageEffectParam> params) {
        int width = pixels[0].length;
        int height = pixels.length;
        int copy[][] = new int[height][width]; // initialized a new matrix to copy the "pixels" matrix values

        for (int x = 0; x < height; x++) {
            for (int y = 0; y < width; y++) {
                copy[x][y] = pixels[height - x - 1][y];
            }
        }
        pixels = copy;
        return pixels;
    }
}

class Grow extends ImageEffect {  
    public int[][] apply(int[][] pixels,
            ArrayList<ImageEffectParam> params) {
        int width = pixels[0].length;
        int height = pixels.length;
        int copy[][] = new int[height * 2][width * 2];
        int posX = 0;
        int posY = 0;
        // posX and posY will keep track of the position we currently are in for copy as
        // we iterate through pixels

        for (int x = 0; x < height; x++) {
            for (int y = 0; y < width; y++) {
                copy[posX][posY] = pixels[x][y];
                copy[posX + 1][posY] = pixels[x][y];
                copy[posX][posY + 1] = pixels[x][y];
                copy[posX + 1][posY + 1] = pixels[x][y];
                posY += 2;
            }
            posX += 2;
            posY = 0;
        }
        pixels = copy;
        return pixels;
    }
}

class Shrink extends ImageEffect {
    public int[][] apply(int[][] pixels,
            ArrayList<ImageEffectParam> params) {
        int width = pixels[0].length;
        int height = pixels.length;
        int copy[][] = new int[height / 2][width / 2];
        int posX = 0;
        int posY = 0;
        // posX and posY will keep track of our position in the pixels matrix as we
        // compute the averages and assign them to the copy matrix

        for (int x = 0; x < height / 2; x++) {
            for (int y = 0; y < width / 2; y++) {
                posX = x * 2;
                posY = y * 2;
                int greenAvg = (getGreen(pixels[posX][posY]) + getGreen(pixels[posX + 1][posY])
                        + getGreen(pixels[posX][posY + 1]) + getGreen(pixels[posX + 1][posY + 1])) / 4;
                int blueAvg = (getBlue(pixels[posX][posY]) + getBlue(pixels[posX + 1][posY])
                        + getBlue(pixels[posX][posY + 1]) + getBlue(pixels[posX + 1][posY + 1])) / 4;
                int redAvg = (getRed(pixels[posX][posY]) + getRed(pixels[posX + 1][posY])
                        + getRed(pixels[posX][posY + 1]) + getRed(pixels[posX + 1][posY + 1])) / 4;
                copy[x][y] = makePixel(redAvg, greenAvg, blueAvg);
            }
        }
        pixels = copy;
        return pixels;
    }
}

class Threshold extends ImageEffect {

    public Threshold() {
        super();
        params = new ArrayList<ImageEffectParam>();
        params.add(new ImageEffectParam("ParamName",
                "Type in threshold value",
                10, 0, 255));
    }
    public int[][] apply(int[][] pixels,
            ArrayList<ImageEffectParam> params) {
        int width = pixels[0].length;
        int height = pixels.length;

        for (int x = 0; x < height; x++) {
            for (int y = 0; y < width; y++) {
                int greenVal = getGreen(pixels[x][y]) <= params.get(0).getValue() ? 0 : 255;
                int redVal = getRed(pixels[x][y]) <= params.get(0).getValue() ? 0 : 255;
                int blueVal = getBlue(pixels[x][y]) <= params.get(0).getValue() ? 0 : 255;
                pixels[x][y] = makePixel(redVal, greenVal, blueVal);
            }
        }
        return pixels;
    }
}