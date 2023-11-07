class MyLine extends MyShape {
private int length;

public MyLine(int length) {
this.length=length;
}
@Override
public void draw() {
    System.out.println("Drawing a line "+length);
    for(int i = 0;i<length;i++) {
    System.out.print("-");
        }
    }
}