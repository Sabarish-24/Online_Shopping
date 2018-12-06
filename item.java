package Item;

public class item{
    String name;
    int cid, pid, price, vnv;
    public item(){
        cid=0;
        pid=0;
        price=0;
        vnv=0;
        name=null;
    }
    public void setname(String u){
        name = u;
    }
    public void setcid(int u){
        cid = u;
    }
    public void setpid(int u){
        pid = u;
    }
    public void setvnv(int u){
        vnv = u;
    }
    public void setprice(int p){
        price = p;
    }
    public String getname(){
        return name;
    }
    public int getprice(){
        return price;
    }
    public int getpid(){
        return pid;
    }
    public int getcid(){
        return cid;
    }
    public int getvnv(){
        return vnv;
    }
}