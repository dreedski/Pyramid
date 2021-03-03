package com.company;

public class pyramid {
    private int rows; int numRow;

    public pyramid(int rows, int numRow){
        this.rows=rows;
        this.numRow=numRow;

        //make three different triangles...

        for(int rows=1; rows <= numRow; rows++){
            for(int i=1; i<=numRow-rows;i++)
                System.out.print(" ");

       for(int k = rows; k >=1; k--)
           System.out.print((k>=10) ? " " + k : " " + k);

        }

    }
