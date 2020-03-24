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