package assignment;

import java.util.ArrayList;
import static assignment.ImageEffect.*;


public class test {

   
    public static void main(String [] args) {
        System.out.println(test.NoRedCheck());
        System.out.println(test.NoBlueCheck());
        System.out.println(test.NoGreenCheck());
        System.out.println(test.RedOnlyCheck());
        System.out.println(test.GreenOnlyCheck());
        System.out.println(test.BlueOnlyCheck());
        System.out.println(test.VerticalReflectCheck());
        System.out.println(test.HorizontalReflectCheck());
        System.out.println(test.GrowCheck());
        System.out.println(test.ShrinkCheck());
        System.out.println(test.ThresholdCheck());

    }
    
    public static String NoRedCheck() {
        NoRed tester = new NoRed();
        boolean works = true;
        int pixel1 = makePixel(1, 1, 1);
        int pixel2 = makePixel(1, 1, 1);
        int pixel3 = makePixel(1, 1, 1);
        int pixel4 = makePixel(1, 1, 1);
        int pixel5 = makePixel(0, 1, 1);
        int pixel6 = makePixel(0, 1, 1);
        int pixel7 = makePixel(0, 1, 1);
        int pixel8 = makePixel(0, 1, 1);
        int [][] pixelsInput = {{pixel1, pixel2}, {pixel3, pixel4}};
        int [][] pixelsOutput = {{pixel5, pixel6}, {pixel7, pixel8}};

        int [][] result = tester.apply(pixelsInput, null);
        for(int x = 0; x < 2; x++) {
            for(int y = 0; y < 2; y++) {
                if(result[x][y] != pixelsOutput[x][y]) works = false;
            }
        }
        if(works) return "NoRed has passed";
        else return "NoRed has not passed";
    }

    public static String NoGreenCheck() {
        NoGreen tester = new NoGreen();
        boolean works = true;
        int pixel1 = makePixel(1, 1, 1);
        int pixel2 = makePixel(1, 1, 1);
        int pixel3 = makePixel(1, 1, 1);
        int pixel4 = makePixel(1, 1, 1);
        int pixel5 = makePixel(1, 0, 1);
        int pixel6 = makePixel(1, 0, 1);
        int pixel7 = makePixel(1, 0, 1);
        int pixel8 = makePixel(1, 0, 1);
        int [][] pixelsInput = {{pixel1, pixel2}, {pixel3, pixel4}};
        int [][] pixelsOutput = {{pixel5, pixel6}, {pixel7, pixel8}};

        int [][] result = tester.apply(pixelsInput, null);
        for(int x = 0; x < 2; x++) {
            for(int y = 0; y < 2; y++) {
                if(result[x][y] != pixelsOutput[x][y]) works = false;
            }
        }
        if(works) return "NoGreen has passed";
        else return "NoGreen has not passed";
    }

    public static String NoBlueCheck() {
        NoBlue tester = new NoBlue();
        boolean works = true;
        int pixel1 = makePixel(1, 1, 1);
        int pixel2 = makePixel(1, 1, 1);
        int pixel3 = makePixel(1, 1, 1);
        int pixel4 = makePixel(1, 1, 1);
        int pixel5 = makePixel(1, 1, 0);
        int pixel6 = makePixel(1, 1, 0);
        int pixel7 = makePixel(1, 1, 0);
        int pixel8 = makePixel(1, 1, 0);
        int [][] pixelsInput = {{pixel1, pixel2}, {pixel3, pixel4}};
        int [][] pixelsOutput = {{pixel5, pixel6}, {pixel7, pixel8}};

        int [][] result = tester.apply(pixelsInput, null);
        for(int x = 0; x < 2; x++) {
            for(int y = 0; y < 2; y++) {
                if(result[x][y] != pixelsOutput[x][y]) works = false;
            }
        }
        if(works) return "NoBlue has passed";
        else return "NoBlue has not passed";
    }

    public static String RedOnlyCheck() {
        RedOnly tester = new RedOnly();
        boolean works = true;
        int pixel1 = makePixel(1, 1, 1);
        int pixel2 = makePixel(1, 1, 1);
        int pixel3 = makePixel(1, 1, 1);
        int pixel4 = makePixel(1, 1, 1);
        int pixel5 = makePixel(1, 0, 0);
        int pixel6 = makePixel(1, 0, 0);
        int pixel7 = makePixel(1, 0, 0);
        int pixel8 = makePixel(1, 0, 0);
        int [][] pixelsInput = {{pixel1, pixel2}, {pixel3, pixel4}};
        int [][] pixelsOutput = {{pixel5, pixel6}, {pixel7, pixel8}};

        int [][] result = tester.apply(pixelsInput, null);
        for(int x = 0; x < 2; x++) {
            for(int y = 0; y < 2; y++) {
                if(result[x][y] != pixelsOutput[x][y]) works = false;
            }
        }
        if(works) return "RedOnly has passed";
        else return "RedOnly has not passed";
    }

    public static String GreenOnlyCheck() {
        GreenOnly tester = new GreenOnly();
        boolean works = true;
        int pixel1 = makePixel(1, 1, 1);
        int pixel2 = makePixel(1, 1, 1);
        int pixel3 = makePixel(1, 1, 1);
        int pixel4 = makePixel(1, 1, 1);
        int pixel5 = makePixel(0, 1, 0);
        int pixel6 = makePixel(0, 1, 0);
        int pixel7 = makePixel(0, 1, 0);
        int pixel8 = makePixel(0, 1, 0);
        int [][] pixelsInput = {{pixel1, pixel2}, {pixel3, pixel4}};
        int [][] pixelsOutput = {{pixel5, pixel6}, {pixel7, pixel8}};

        int [][] result = tester.apply(pixelsInput, null);
        for(int x = 0; x < 2; x++) {
            for(int y = 0; y < 2; y++) {
                if(result[x][y] != pixelsOutput[x][y]) works = false;
            }
        }
        if(works) return "GreenOnly has passed";
        else return "GreenOnly has not passed";
    }

    public static String BlueOnlyCheck() {
        BlueOnly tester = new BlueOnly();
        boolean works = true;
        int pixel1 = makePixel(1, 1, 1);
        int pixel2 = makePixel(1, 1, 1);
        int pixel3 = makePixel(1, 1, 1);
        int pixel4 = makePixel(1, 1, 1);
        int pixel5 = makePixel(0, 0, 1);
        int pixel6 = makePixel(0, 0, 1);
        int pixel7 = makePixel(0, 0, 1);
        int pixel8 = makePixel(0, 0, 1);
        int [][] pixelsInput = {{pixel1, pixel2}, {pixel3, pixel4}};
        int [][] pixelsOutput = {{pixel5, pixel6}, {pixel7, pixel8}};

        int [][] result = tester.apply(pixelsInput, null);
        for(int x = 0; x < 2; x++) {
            for(int y = 0; y < 2; y++) {
                if(result[x][y] != pixelsOutput[x][y]) works = false;
            }
        }
        if(works) return "BlueOnly has passed";
        else return "BlueOnly has not passed";
    }

    public static String VerticalReflectCheck() {
        VerticalReflect tester = new VerticalReflect();
        boolean works = true;
        int pixel1 = makePixel(1, 1, 1);
        int pixel2 = makePixel(2, 2, 2);
        int pixel3 = makePixel(3, 3, 3);
        int pixel4 = makePixel(4, 4, 4);
        int pixel5 = makePixel(2, 2, 2);
        int pixel6 = makePixel(1, 1, 1);
        int pixel7 = makePixel(4, 4, 4);
        int pixel8 = makePixel(3, 3, 3);
        int [][] pixelsInput = {{pixel1, pixel2}, {pixel3, pixel4}};
        int [][] pixelsOutput = {{pixel5, pixel6}, {pixel7, pixel8}};

        int [][] result = tester.apply(pixelsInput, null);
        for(int x = 0; x < 2; x++) {
            for(int y = 0; y < 2; y++) {
                if(result[x][y] != pixelsOutput[x][y]) {
                    works = false;
                }
                
            }
            //System.out.println();
        }
        if(works) return "VerticalReflect has passed";
        else return "VerticalReflect has not passed";
    }

    public static String HorizontalReflectCheck() {
        HorizontalReflect tester = new HorizontalReflect();
        boolean works = true;
        int pixel1 = makePixel(1, 1, 1);
        int pixel2 = makePixel(2, 2, 2);
        int pixel3 = makePixel(3, 3, 3);
        int pixel4 = makePixel(4, 4, 4);
        int pixel5 = makePixel(3, 3, 3);
        int pixel6 = makePixel(4, 4, 4);
        int pixel7 = makePixel(1, 1, 1);
        int pixel8 = makePixel(2, 2, 2);
        int [][] pixelsInput = {{pixel1, pixel2}, {pixel3, pixel4}};
        int [][] pixelsOutput = {{pixel5, pixel6}, {pixel7, pixel8}};

        int [][] result = tester.apply(pixelsInput, null);
        for(int x = 0; x < 2; x++) {
            for(int y = 0; y < 2; y++) {
                if(result[x][y] != pixelsOutput[x][y]) works = false;
               
            }
        }
        if(works) return "HorizontalReflect has passed";
        else return "HorizontalReflect has not passed";
    }

    public static String GrowCheck() {
        Grow tester = new Grow();
        boolean works = true;
        int pixel1 = makePixel(1, 1, 1);
        int pixel2 = makePixel(1, 1, 1);
        int pixel3 = makePixel(1, 1, 1);
        int pixel4 = makePixel(1, 1, 1);
        int pixel5 = makePixel(1, 1, 1);
        
        int [][] pixelsInput = {{pixel1}};
        int [][] pixelsOutput = {{pixel2, pixel3}, {pixel4, pixel5}};

        int [][] result = tester.apply(pixelsInput, null);
        for(int x = 0; x < 2; x++) {
            for(int y = 0; y < 2; y++) {
                if(result[x][y] != pixelsOutput[x][y]) works = false;
               
            }
        }
        if(works) return "Grow has passed";
        else return "Grow has not passed";
    }

    public static String ShrinkCheck() {
        Shrink tester = new Shrink();
        boolean works = true;
        int pixel1 = makePixel(1, 2, 8);
        int pixel2 = makePixel(3, 2, 9);
        int pixel3 = makePixel(4, 2, 3);
        int pixel4 = makePixel(4, 2, 4);
        int pixel5 = makePixel(3, 2, 6);
        
        int [][] pixelsInput = {{pixel1, pixel2}, {pixel3, pixel4}};
        int [][] pixelsOutput = {{pixel5}};

        int [][] result = tester.apply(pixelsInput, null);
        for(int x = 0; x < 1; x++) {
            for(int y = 0; y < 1; y++) {
                if(result[x][y] != pixelsOutput[x][y]) works = false;
                //System.out.println(getBlue(result[0][0]));  
            }
        }
        if(works) return "Shrink has passed";
        else return "Shrink has not passed";
    }

    public static String ThresholdCheck() {
        Threshold tester = new Threshold();
        boolean works = true;
        int pixel1 = makePixel(100, 80, 8);
        int pixel2 = makePixel(11, 9, 10);
        int pixel3 = makePixel(50, 50, 50);
        int pixel4 = makePixel(8, 8, 8);
        int pixel5 = makePixel(255, 255, 0);
        int pixel6 = makePixel(255, 0, 0);
        int pixel7 = makePixel(255, 255, 255);
        int pixel8 = makePixel(0, 0, 0);
        int [][] pixelsInput = {{pixel1, pixel2}, {pixel3, pixel4}};
        int [][] pixelsOutput = {{pixel5, pixel6}, {pixel7, pixel8}};


        ArrayList<ImageEffectParam> params = new ArrayList<ImageEffectParam>();
        params.add(new ImageEffectParam("ParamName",
        "Type in threshold value",
        10, 0, 255));

        int [][] result = tester.apply(pixelsInput, params);
        for(int x = 0; x < 2; x++) {
            for(int y = 0; y < 2; y++) {
                if(result[x][y] != pixelsOutput[x][y]) works = false;
                //System.out.print(getRed(result[x][y]) + " ");
            }
            //System.out.println();
        }
        if(works) return "Threshold has passed";
        else return "Threshold has not passed";
    }




}


