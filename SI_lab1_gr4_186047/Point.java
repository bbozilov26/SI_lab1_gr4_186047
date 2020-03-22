class Point {
	String id
	double x,y;

	//TODO add new variable
	String color;

	//TODO constructor
    public Point(String id, double x, double y){
        this.id = id;
        this.x = x;
        this.y = y;
    }

	//TODO setters and getters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void move (char xDirection, char yDirection) {
		//TODO
        if(xDirection == 'L' && yDirection == 'U'){
            this.x = getX() - 1;
            this.y = getY() + 1;
        }

        if(xDirection == 'L' && yDirection == 'D'){
            this.x = getX() - 1;
            this.y = getY() - 1;
        }

        if(xDirection == 'R' && yDirection == 'U'){
            this.x = getX() + 1;
            this.y = getY() + 1;
        }

        if(xDirection == 'R' && yDirection == 'D'){
            this.x = getX() + 1;
            this.y = getY() - 1;
        }
	}

	public void draw () {
		//TODO
        System.out.println(this.id + "(" + this.x + ", " + this.y + ")");
	}
}

class Canvas{
    List<Point> pointList;

    public List<Point> addPoint(Point point){
        pointList.add(point);
    }

    public List<Point> removePoint(Point point){
        pointList.remove(point);
    }

    public void findMiddlePoint(Point a, Point b){
        double middlePointX = (a.x + b.x) / 2;
        double middlePointY = (a.y + b.y) / 2;

        System.out.println("Middle point = (" + middlePointX + ", "
                + middlePointY + ")");
    }

    public moveAllPoints(){
        char DirX, DirY;

        for(Point p : pointList){
            DirX = sc.nextLine();
            DirY = sc.nextLine();
            p.move(DirX, DirY);
        }
    }
}