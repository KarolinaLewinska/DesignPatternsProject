public class ProxyMain {
    public static void main(String[] args){
        Proxy proxy1 = new Proxy(11);
        Proxy proxy2 = new Proxy(17);

        proxy1.WatchMovie();
        proxy2.WatchMovie();
    }
}
