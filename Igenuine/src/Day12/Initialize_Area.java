package Igenuine.src.Day12;

public class Initialize_Area {
    int length,width ;
    Initialize_Area(int length,int width){
        this.length=length;
        this.width=width;
    }
    public void calculateArea(){
        int area= this.length*this.width;
        System.out.println("The Area of rectangle: " +area);
    }
    public void calculatePerimeter(){
        int i= this.length+this.width;
        int peri = 2*i;
        System.out.println("The Perimeter of rectangle: " +peri);
    }
}
