package proxy;

public class Client {
    public static void main(String[] args) {
        /*
            در واقع proxy جانشین یا واسطی برای دسترسی به یک object است که میتواند روی ان کنترل کند
            زمانی که میخواهیم دسترسی مشخص و کنترول شده ای از یک object ساخته شده توسط کلاس دیگر ارایه بدیم از proxy استفاده میکنیم
        */
        Internet internet = new ProxyInternet();
        try
        {
            internet.connectTo("maktab.ir");
            internet.connectTo("abc.com");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
