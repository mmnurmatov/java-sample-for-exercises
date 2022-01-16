package Algoritmga_kirish;
import java.util.Random;

/**
 * Created by Maqsud-PC on 25.12.2015.
 */
public class algoritm9 {
    public static class Board {
        private Point[] points;
        private int N;
        private int width;
        private int height;

        public  Board(int n, int w, int h) {
            points = new Point[n];
            N = n;
            width = w;
            height = h;
        }

        public Board(Board board) {
            points = new Point[board.points.length];
            for (int i = 0; i < points.length; i++)
                points[i] = new Point(board.points[i].getX(), board.points[i].getY());
            this.width = board.width;
            this.height = board.height;
        }
        public int getPointsCount() {
            return points.length;
        }
        public int getWidth() {
            return width;
        }
        public int getHeight() {
            return height;
        }
        public Point getPoint(int index) {
            return points[index];
        }
        public void setPoint(int index, Point p) {
            points[index] = p;
        }
    }
    public static class Point {
        private int x;
        private int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
        public double dist(Point p) {
            return Math.sqrt((x - p.x) * (x - p.x) + (y - p.y) * (y - p.y));
        }
        public void move(int dx, int dy, int xBorder, int yBorder){
            if(((x + dx) < xBorder) && ((x + dx) >= 0))
                x += dx;
            if(((y + dy) < yBorder) && ((y + dy) >= 0))
                y += dy;
        }
        public int getX(){
            return x;
        }
        public int getY(){
            return y;
        }
    }
    public static class Polyline {
        public Point p[];
        public int N = 5;

        public Polyline(int Num) {
            N = Num;
            p = new Point[N];
        }
        public double dist() {
            double d = 0;
            for (int i = 0; i < (N - 1); i++) {
                d += p[i].dist(p[i + 1]);
            }
            return d;
        }
    }
    public static class MinPolyline {
        private double bestDist;
        private Polyline bestMinPolyl;
        private Board board;
        private int N;

        public Polyline F(Board b) {
            N = b.getPointsCount();
            board = b;
            int[] perm = new int[N];
            boolean used[] = new boolean[N];

            for (int i = 0; i < N; i++) {
                perm[i] = i + 1;
                used[i] = false;
            }
            bestDist = Double.MAX_VALUE;
            permute (0, perm, used);
            return bestMinPolyl;
        }

        void permute(int first_index, int[] perm, boolean[] used) {
            if (first_index == N) {
                Polyline polyl = new Polyline(N);

                for (int i = 0; i < N; i++){
                    polyl.p[i] = board.getPoint(perm[i] - 1);
                }
                if (bestDist > polyl.dist()){
                    bestDist = polyl.dist();
                    bestMinPolyl = polyl;
                }
                return;
            }

            for (int i = 1; i < N+1; i++) {
                if (used[i - 1]) continue;
                perm[first_index] = i;
                used[i - 1] = true;
                permute(first_index + 1, perm, used);
                used[i - 1] = false;
            }
        }
    }

    static class AnnealingOptimizer {

        public static int N;
        public static int width;
        public static  int height;

        AnnealingOptimizer(int n, int width, int height) {
            N = n;
            this.width = width;
            this.height = height;
        }

        public static Board optimize(double To, double Tend, double decrement){

            Board board = new Board(N, width, height);
            Board bestBoard = new Board(N, width, height);
            Random r = new Random();
            double maxDist = 0;
            double T = To;
            double h;
            MinPolyline minPolyl = new MinPolyline();

            for (int j = 0; j < N; ++j){
                board.setPoint(j,  new Point(r.nextInt(height), r.nextInt(width)));
                bestBoard.setPoint(j, board.getPoint(j));
            }

            int i = 1;
            while (T > Tend){
                for (int moveNum = 0; moveNum < board.getPointsCount(); ++moveNum){
                    NewX(board, moveNum, T, width, true);
                    NewX(board, moveNum, T, height, false);
                }

                if (minPolyl.F(board).dist() > maxDist){
                    bestBoard = new Board(board);
                }else{
                    h = 1 / (1 + Math.exp(-(minPolyl.F(board).dist()- maxDist) / T));
                    if (r.nextDouble() > h){
                        board = new Board(bestBoard);
                    }else{
                        bestBoard = new Board(board);
                    }
                }

                maxDist = minPolyl.F(board).dist();

                T = To * Math.exp(-decrement * Math.pow(i, (double)(1) / (2*(double)N)));

                ++i;
            }

            return bestBoard;
        }

        private static void NewX (Board board, int moveNum, double T, int border, boolean xCoord) {

            Random r = new Random();
            int x;
            double z;
            double alpha = r.nextDouble();

            z = (Math.pow((1 + 1/T), (2 * alpha - 1)) - 1) * T;

            if (xCoord){
                x = board.getPoint(moveNum).getX() + (int)(z * border);

                if ((x < border) && (x >= 0)) {
                    board.getPoint(moveNum).move((int)(z * border), 0, width, height);
                } else {
                    NewX(board, moveNum, T, border, xCoord);
                }
            } else {
                x = board.getPoint(moveNum).getY() + (int)(z * border);

                if ((x < border) && (x >= 0)) {
                    board.getPoint(moveNum).move(0, (int)(z * border), width, height);
                } else {
                    NewX(board, moveNum, T, border, xCoord);
                }
            }
        }
    }

    public static void main(String[] args) {
        AnnealingOptimizer k=new  AnnealingOptimizer(10,6,6);
        System.out.println(k.optimize(100, 20, 10));

    }
}
