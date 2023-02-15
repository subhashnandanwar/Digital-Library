package DigitalLib;

public class module1 {
    String name,fname,uni_id,uid;
    int book;

    public void getdata(String name,String fname,String uni_id,String uid,int book){
    this.name=name;
    this.fname=fname;
    this.uni_id=uni_id;
    this.uid=uid;
    this.book=book;
    }
    public void setdata(){
        System.out.println("Students name:"+name);
        System.out.println("Students father name:"+fname);
        System.out.println("University id:"+uni_id);
        System.out.println("user id"+uid);
        System.out.println("Book"+book);
    }
}
