public class Matrix {
    public static void main(String[] args) {
        Matrix matrix = new Matrix(5, 5);
    }

    private double [][] data;
    private int rows;
    private int cols;
    public Matrix(int row, int cols){
        this.rows = rows;
        this.cols = cols;
        this.data = new double[rows][cols];

    }
    public void setValue(int row, int col, double value){
        if (row >= 0 && row < rows && col >= 0 && col < cols){
            data[row][col] = value;
        }
        else {
            throw new IndexOutOfBoundsException("Индекс выходит за пределы матрицы");
        }
    }
    public Matrix add(Matrix other){
        if (this.rows != other.rows || this.cols != other.cols){
            throw new IllegalArgumentException("Размерности матриц не совпадают");
        }
        Matrix result = new Matrix(rows, cols);
        for (int i=0; i < rows; i++){
            for(int j=0; j < cols; j++){
                result.setValue(i, j, this.data[i][j] + other.getValue(i, j));
            }
        }
        return result;
    }
    public Matrix multiplication(double scalar){
        Matrix result = new Matrix(rows, cols);
        for(int i=0; i < rows; i++){
            for(int j=0; j<cols; j++){
                result.setValue(i, j, this.data[i][j]*scalar);
            }
        }
        return result;
    }
    public void print(){
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.printf("%.2f", data[i][j]);
            }
            System.out.println();
        }
    }


}