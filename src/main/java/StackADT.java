//Test thay doi 2222222 3
public interface StackADT <T>{

    public void push(T item);
    //trar về và loại bo phan tu
    public T pop();
    //Lay ra va khong loai bo
    public T peek();
    //Ktra rong
    public boolean isEmpty();
    //kich thuoc
    public int size();
    //Chuoi
    public String toString();
}
