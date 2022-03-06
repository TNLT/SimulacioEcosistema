public class Vector2 implements Comparable<Vector2> {
    // From: TNLN


    public int x,y;

    public Vector2(){
        this.x = 0;
        this.y = 0;
    }

    public Vector2(int x, int y){
        this.x= x;
        this.y=y;
    }

    public Vector2 Sum(Vector2 vec2){
        return new Vector2(this.x + vec2.x,this.y + vec2.y);
    }

    @Override
    public int compareTo(Vector2 vec2) {
        int WhatReturns;
        if(this.x == vec2.x && this.y == vec2.y){WhatReturns = 0;}
        else if(Math.sqrt(Math.pow(this.x,2) + Math.pow(this.y,2)) > Math.sqrt(Math.pow(vec2.x,2) + Math.pow(vec2.y,2))){
            WhatReturns = 1;
        }else{WhatReturns = -1;}

        return  WhatReturns;
    }

    public double DistTo(Vector2 vec2){
        return Math.sqrt(Math.pow(this.x-vec2.x,2) + Math.pow(this.y-vec2.y,2));
    }
}
