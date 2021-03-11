package com.company;

public class pyramid {
    private int numRow;

    public pyramid(int numRow) {
        //this.rows=rows;
        this.numRow = numRow;  //make numRow public

        //make three different triangles...outer loops and L and R half?

        for (int x=1; x<=numRow; x++) {
            for (int y=1; y<=(numRow-x) * 2; y++) {
                System.out.print(" ");
            }
            //make the L side of the pmid
            for (int z=x; z>=1; z--) {
                System.out.print(" " + z);
            }
            //make the R side of the pmid
            for (int l=2; l<=x; l++) {
                System.out.print(" " + l);
            }
            System.out.println();

        }
    }
}
